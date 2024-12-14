package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Pricecontrolcontroller {

    @FXML
    private TextField ID;

    @FXML
    private TextField PRICE;

    @FXML
    void back(ActionEvent event) {
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();


        try {
            javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("addproduct.fxml"));
            Scene scene2 = new Scene(loader.load());

            stage.setScene(scene2);
            stage.setTitle("Add Product");

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void update(ActionEvent event) {
        String productIdText = ID.getText().trim();
        String newPriceText = PRICE.getText().trim();

        if (productIdText.isEmpty() || newPriceText.isEmpty()) {
            System.out.println("Product ID and Price are required!");
            return;
        }

        try {
            int productId = Integer.parseInt(productIdText);
            double newPrice = Double.parseDouble(newPriceText);

            boolean productFound = false;


            for (Product product : DataModel.getProducts()) {
                if (product.getProductId() == productId) {

                    product.setPrice((float) newPrice);
                    productFound = true;
                    System.out.println("Price updated successfully for Product ID: " + productId);
                    break;
                }
            }

            if (!productFound) {
                System.out.println("Product with ID " + productId + " not found.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid Product ID and Price.");
        }
    }
}
