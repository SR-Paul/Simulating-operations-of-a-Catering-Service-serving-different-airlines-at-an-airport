package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Viewproductcontroller {

    @FXML
    private TextField name;

    @FXML
    private TextField price;

    @FXML
    private TextField productId;

    @FXML
    private TextField seasonality;

    @FXML
    private TextField storage;

    @FXML
    private TextField variety;

    private Scene previousScene;


    public Viewproductcontroller() {

    }


    public void setProductId(TextField productId) {
        this.productId = productId;
    }

    public void setPreviousScene(Scene scene) {
        this.previousScene = scene;
    }

    @FXML
    void submit(ActionEvent event) {
        try {
            String productName = name.getText();
            float productPrice = Float.parseFloat(price.getText());
            int productID = Integer.parseInt(productId.getText());
            String productSeasonality = seasonality.getText();
            String productStorage = storage.getText();
            String productVariety = variety.getText();

            Product newProduct = new Product(productName, productPrice, productID, productSeasonality, productStorage, productVariety);
            DataModel.addproduct(newProduct);

            // Clear fields
            name.clear();
            price.clear();
            productId.clear();
            seasonality.clear();
            storage.clear();
            variety.clear();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
    }

    @FXML
    void back(ActionEvent event) {
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(previousScene);
    }
}
