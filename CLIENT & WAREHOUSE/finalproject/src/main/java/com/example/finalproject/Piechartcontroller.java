package com.example.finalproject;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class Piechartcontroller {

    @FXML
    private PieChart piechart;

    @FXML
    void initialize() {

        ObservableList<Product> products = DataModel.getProducts();

        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();


        for (Product product : products) {
            String storageType = product.getStorage();
            boolean found = false;


            for (PieChart.Data slice : pieChartData) {
                if (slice.getName().equals(storageType)) {

                    slice.setPieValue(slice.getPieValue() + 1);
                    found = true;
                    break;
                }
            }


            if (!found) {
                pieChartData.add(new PieChart.Data(storageType, 1));
            }
        }


        piechart.setData(pieChartData);
    }

    @FXML
    void back(ActionEvent event) {
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        try {

            javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("dashboard.fxml"));
            Scene scene = new Scene(loader.load());


            stage.setScene(scene);
            stage.setTitle("Dashboard");

        } catch (java.io.IOException e) {

            e.printStackTrace();
            System.out.println("Error loading the dashboard scene.");
        }
    }
}
