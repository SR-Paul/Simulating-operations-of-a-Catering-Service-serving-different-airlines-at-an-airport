package com.example.finalproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataModel {
    private static final ObservableList<Product> products = FXCollections.observableArrayList();

    public static ObservableList<Product> getProducts() {
        return products;
    }

    public static void addproduct(Product product) {
        products.add(product);
    }
}
