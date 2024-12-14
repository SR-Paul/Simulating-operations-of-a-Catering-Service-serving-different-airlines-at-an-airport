package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Deletecontroller {

    @FXML
    private TextField pid;

    @FXML
    void back(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("addproduct.fxml"));
            Scene scene2 = new Scene(loader.load());

            stage.setScene(scene2);
            stage.setTitle("Add Product");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void delete(ActionEvent event) {
        String productIdText = pid.getText().trim();

        if (productIdText.isEmpty()) {
            System.out.println("Product ID is required!");
            return;
        }

        try {
            int productId = Integer.parseInt(productIdText);
            boolean productFound = false;

            for (Product product : DataModel.getProducts()) {
                if (product.getProductId() == productId) {

                    DataModel.getProducts().remove(product);
                    productFound = true;
                    break;
                }
            }

            if (productFound) {
                System.out.println("Product deleted successfully!");


                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("addproduct.fxml"));
                Scene scene2 = new Scene(loader.load());
                stage.setScene(scene2);
                stage.setTitle("Add Product");

            } else {
                System.out.println("Product with ID " + productId + " not found.");
            }

        } catch (NumberFormatException | IOException e) {
            System.out.println("Invalid Product ID. Please enter a valid number.");
        }
    }
}
