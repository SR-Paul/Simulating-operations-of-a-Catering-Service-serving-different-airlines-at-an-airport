package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class Addproductcontroller {

    @FXML
    private TableView<Product> table;

    @FXML
    private TableColumn<Product, String> nameColumn;

    @FXML
    private TableColumn<Product, Double> priceColumn;

    @FXML
    private TableColumn<Product, Integer> productIdColumn;

    @FXML
    private TableColumn<Product, String> seasonalityColumn;

    @FXML
    private TableColumn<Product, String> storageColumn;

    @FXML
    private TableColumn<Product, String> varietyColumn;

    @FXML
    void initialize() {
        //  table columns
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        productIdColumn.setCellValueFactory(new PropertyValueFactory<>("productId"));
        seasonalityColumn.setCellValueFactory(new PropertyValueFactory<>("seasonality"));
        storageColumn.setCellValueFactory(new PropertyValueFactory<>("storage"));
        varietyColumn.setCellValueFactory(new PropertyValueFactory<>("variety"));


        table.setItems(DataModel.getProducts());
    }

    @FXML
    void addproduct(ActionEvent event) {
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        try {
            javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("viewproduct.fxml"));
            Scene scene = new Scene(loader.load());

            Viewproductcontroller controller = loader.getController();
            controller.setPreviousScene(stage.getScene());

            stage.setScene(scene);
            stage.setTitle("Add Product Form");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void back(ActionEvent event) {
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();


        try {

            javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("dashboard.fxml"));
            Scene scene2 = new Scene(loader.load());


            stage.setScene(scene2);


            stage.setTitle("Add Product");

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    void deleteproduct(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("delete.fxml"));
            Scene scene2 = new Scene(loader.load());


            stage.setScene(scene2);


            stage.setTitle("Add Product");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }

