package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Dashboardcontroller {


    @FXML
    void analysis(ActionEvent event) {
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();


        try {
            javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("piechart.fxml"));
            Scene scene2 = new Scene(loader.load());


            stage.setScene(scene2);
            stage.setTitle("Add Product");

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }



    @FXML
    void notification(ActionEvent event) {
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
    void pricecontrol(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("pricecontrol.fxml"));
            Scene scene2 = new Scene(loader.load());


            stage.setScene(scene2);

            stage.setTitle("Price Control");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void gotoinventory(ActionEvent event) {
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
}
