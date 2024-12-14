package com.example.finalproject;

import java.io.Serializable;

public class Product implements Serializable {


    private String name;
    private float price;
    private int productId;
    private String seasonality;
    private String storage;
    private String variety;

    public void setName(String name) {
        this.name = name;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setSeasonality(String seasonality) {
        this.seasonality = seasonality;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public Product(String name, float price, int productId, String seasonality, String storage, String variety) {
        this.name = name;
        this.price = price;
        this.productId = productId;
        this.seasonality = seasonality;
        this.storage = storage;
        this.variety = variety;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public String getSeasonality() {
        return seasonality;
    }

    public String getStorage() {
        return storage;
    }

    public String getVariety() {
        return variety;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    }

