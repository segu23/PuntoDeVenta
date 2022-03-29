/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.kayteam.puntodeventa.objects;

/**
 *
 * @author segun
 */
public class Product {

    private String description;
    private int price;
    private long code;
    private int stock;

    public Product(String description, int price, long code, int stock) {
        this.description = description;
        this.price = price;
        this.code = code;
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public SaleProduct getSaleProduct(int amount){
        return new SaleProduct(this.description, this.code, amount, this.price);
    }
}
