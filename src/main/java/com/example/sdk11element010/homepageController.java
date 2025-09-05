package com.example.sdk11element010;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;

import java.sql.SQLException;

public class homepageController {

    @FXML
    public GridPane scenarioform;
    @FXML
    public GridPane clientform1;
    @FXML
    public GridPane clientform;
    // Homepage form attributes
    @FXML
    private TabPane tabpane;
    @FXML
    private Tab viewtab;
    @FXML
    private Tab edittab;
    @FXML
    private Tab createtab;
    @FXML
    private Tab generatetab;
    @FXML
    private Button clearbutton;
    @FXML
    private Button addbutton;
    @FXML
    private Parent includedform;

    // Controllers of forms displayed within homepage

    // The view and edit profile fxmls are the same window just utilised for different functions, so two controllers are needed to point to the same controller
    @FXML
    private TwoClientFormController clientformController;
    @FXML
    private TwoClientFormController clientform1Controller;
    @FXML
    private ScenarioFormController scenarioFormController;

    // The client form used for creating profile is utilised here for displaying any user data, so does not require use of any clear or save functions hence those functions are hidden
    private void initialize() {}

    @FXML
    private void changeTab() throws SQLException {
        System.out.println(tabpane.getSelectionModel().getSelectedItem().getText());

        // If the tab is on view the form is view only hence functionality buttons are hidden, otherwise they are not
        if (tabpane.getSelectionModel().getSelectedItem().getText().equals("View profile")) {
            clientformController.showChildTable();
            clientformController.listChildren();
            clientformController.viewTabHideButtons();
            clientformController.viewLabels();
            clientformController.displayProfileData();
        }  else {
            clientform1Controller.viewTabShowButtons();
            clientform1Controller.hideChildTable();
            clientform1Controller.nonViewLabels();
        }
    }

    @FXML
    private void submitButtonClick () {
        scenarioFormController.onSubmitButtonClick();
    }

    @FXML
    private void clearButtonClick () {
        scenarioFormController.onSubmitButtonClick();
    }
}
