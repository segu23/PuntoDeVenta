/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.kayteam.puntodeventa.managers;

import java.io.File;
import java.io.IOException;
import java.util.*;
import org.kayteam.puntodeventa.objects.Product;
import org.kayteam.puntodeventa.util.YamlUtil;
import org.simpleyaml.configuration.file.YamlFile;

/**
 *
 * @author segun
 */
public class ProductManager {
    
    private final HashMap<Long, Product> products = new HashMap<>();

    private final String mainPath = ".\\PuntoDeVenta\\products\\";

    public ProductManager(){
        loadProducts();
    }

    private void loadProducts(){
        try{
            final File folder = new File(mainPath);

            for(String productCode : YamlUtil.listFilesForFolder(folder)){
                loadProduct(mainPath+productCode);
            }
        }catch(Exception ignored){}
    }

    private void loadProduct(String path){
        YamlFile productFile = YamlUtil.getFile(path);
        try{
            String name = productFile.getString("name");
            int price = productFile.getInt("price");
            long code = Long.parseLong(productFile.getConfigurationFile().getName().replaceAll(".yml", ""));
            int stock = productFile.getInt("stock");
            Product product = new Product(name, price, code, stock);
            getProducts().put(code, product);
        }catch(Exception ignored){}
    }

    public boolean isProduct(long code){
        return getProducts().containsKey(code);
    }

    public void saveProduct(Product product) throws IOException{
        YamlFile productFile = getProductFile(product.getCode());
        productFile.set("name", product.getDescription());
        productFile.set("price", product.getPrice());
        productFile.set("stock", product.getStock());
        productFile.save();
        getProducts().put(product.getCode(), product);
    }

    public void deleteProduct(long code) throws IOException{
        getProducts().remove(code);
        getProductFile(code).deleteFile();
    }

    public HashMap<Long, Product> getProducts() {
        return products;
    }

    public Product getProduct(long code){
        return getProducts().get(code);
    }

    private YamlFile getProductFile(long code){
        return YamlUtil.getFile(mainPath+code+".yml");
    }
}
