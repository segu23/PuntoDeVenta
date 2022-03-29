/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.kayteam.puntodeventa.objects;

/**
 *
 * @author segun
 */
public class SaleProduct {

    private String description;
    private long code;
    private int amount;
    private int price;

    public SaleProduct(String description, long code, int amount, int price) {
        this.description = description;
        this.code = code;
        this.amount = amount;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getParcialPrice(){
        return amount*price;
    }
}
