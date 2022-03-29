/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.kayteam.puntodeventa.objects;

import java.util.List;
import java.util.Date;

/**
 *
 * @author segun
 */
public class Sale implements Comparable<Sale>{

    private List<SaleProduct> products;
    private Date date;
    private int id;
    private int payment = 0;
    private String paymentMethod;

    public Sale(List<SaleProduct> products, Date date, int id) {
        this.products = products;
        this.date = date;
        this.id = id;
    }

    public List<SaleProduct> getProducts() {
        return products;
    }

    public void setProducts(List<SaleProduct> products) {
        this.products = products;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalPrice(){
        int totalPrice = 0;
        for(SaleProduct saleProduct : this.products){
            totalPrice += saleProduct.getPrice()*saleProduct.getAmount(); 
        }
        return totalPrice;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    @Override
    public int compareTo(Sale p) {
        return Integer.compare(id, p.getId());
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getProductsAmount(){
        int totalProducts = 0;
        for(SaleProduct saleProduct : this.products){
            totalProducts += saleProduct.getAmount();
        }
        return totalProducts;
    }
}
