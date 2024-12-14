package com.example.cateringmanager_saklaenhaamim_2221380;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PrintOrderController {

    @FXML
    private TableView<?> departureTC;

    @FXML
    private TableColumn<?, ?> flightNameTC;

    @FXML
    private TableColumn<?, ?> mealTC;

    @FXML
    private Button printButtonn;

    @FXML
    private TableColumn<?, ?> quantityTC;

    @FXML
    private TableColumn<?, ?> scheduleTC;

    @FXML
    void handlePrintButton(ActionEvent event) {

    }

}

