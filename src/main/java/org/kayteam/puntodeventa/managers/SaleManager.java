/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.kayteam.puntodeventa.managers;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.kayteam.puntodeventa.objects.Sale;
import org.kayteam.puntodeventa.objects.SaleProduct;
import org.kayteam.puntodeventa.util.YamlUtil;
import org.simpleyaml.configuration.file.YamlFile;

/**
 *
 * @author segun
 */
public class SaleManager {

    private List<Sale> sales = new ArrayList<>();

    private final String mainPath = ".\\PuntoDeVenta\\sales\\";

    public SaleManager() {
        loadSales();
    }

    private void loadSales(){
        try{
            final File folder = new File(mainPath);

            for(String productCode : YamlUtil.listFilesForFolder(folder)){
                loadSale(mainPath+productCode);
            }
        }catch(Exception ignored){}
    }

    private void loadSale(String path){
        YamlFile yamlFile = YamlUtil.getFile(path);
        List<SaleProduct> saleProducts = new ArrayList<>();
        try{
            Date date = Date.from(Instant.ofEpochMilli(yamlFile.getLong("date")));
            String paymentMethod = yamlFile.getString("method");
            int payment = yamlFile.getInt("payment");
            for(String productCode : yamlFile.getConfigurationSection("products").getKeys(false)){
                String productName = yamlFile.getString("products."+productCode+".description");
                int productPrice = yamlFile.getInt("products."+productCode+".price");
                int productAmount = yamlFile.getInt("products."+productCode+".amount");
                SaleProduct saleProduct = new SaleProduct(productName, Integer.parseInt(productCode), productAmount, productPrice);
                saleProducts.add(saleProduct);
            }
            int saleID = Integer.parseInt(yamlFile.getConfigurationFile().getName().replaceAll(".yml", ""));
            Sale sale = new Sale(saleProducts, date, saleID);
            sales.add(sale);
            sortSales();
        }catch(Exception ignored){}
    }

    public void saveSale(Sale sale) throws IOException{
        YamlFile yamlFile = getSaleFile(sale.getId());
        yamlFile.set("date", Instant.now().toEpochMilli());
        yamlFile.set("payment", sale.getPayment());
        yamlFile.set("method", sale.getPaymentMethod());
        for(SaleProduct saleProduct : sale.getProducts()){
            yamlFile.set("products."+saleProduct.getCode()+".description", saleProduct.getDescription());
            yamlFile.set("products."+saleProduct.getCode()+".price", saleProduct.getPrice());
            yamlFile.set("products."+saleProduct.getCode()+".amount", saleProduct.getAmount());
        }
        yamlFile.save();
        sales.add(sale);
        sortSales();
    }

    private void sortSales(){
        Collections.sort(sales);
    }

    public int getNewerSaleId(){
        if(!sales.isEmpty()){
            return sales.get(sales.size()-1).getId()+1;
        }else{
            return 0;
        }
    }

    public List<Sale> getSales() {
        return sales;
    }

    private void loadSale(int id){
        loadSale(mainPath+id+".yml");
    }

    private YamlFile getSaleFile(int id){
        return YamlUtil.getFile(mainPath+id+".yml");
    }
}
