package com.example.sdk11element010;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.util.Duration;

// Controller for child form
public class ChildController {

    // Child form fields
    @FXML
    private TextField child_first_name_value;
    @FXML
    private TextField child_surname_value;
    @FXML
    private DatePicker child_dateofbirth_value;
    @FXML
    private ToggleGroup Group1;
    @FXML
    private TextField child_country_of_residence_value;
    @FXML
    private Label saveLabel;

    // Two-second delay before closing scene so that user can see display label message before window is closed
    @FXML
    PauseTransition delay = new PauseTransition(Duration.seconds(2));

    // On save button being clicked, data entered into child form is inserted into database with client's ID as foreign key to link to them
    public void onSaveButtonClick(ActionEvent event) {
        String[] childData = new String[6];
        childData[0]= User.getInstance().getUserID();
        childData[1]= this.child_first_name_value.getText();
        childData[2]= this.child_surname_value.getText();
        childData[3]= this.child_dateofbirth_value.getValue().toString();
        childData[4]= this.child_country_of_residence_value.getText();
        RadioButton selectedButton = (RadioButton) Group1.getSelectedToggle();
        childData[5]= selectedButton.getText();
        System.out.println(childData[5] + "HEEEERE");

        // If database update is successful, label next to save button displays Child added for user information before closing stage after delay
        if (Database.prepChildUpdate("INSERT INTO child (clientid, firstname, surname, dob, country_residence, belongs_to) VALUES (?, ?, ?, ?, ?, ?);", childData)) {
            saveLabel.setText("Child added!");
            delay.setOnFinished(event1 -> ((Node) (event.getSource())).getScene().getWindow().hide());
            delay.play();
        } else {
            // If database update fails user is informed via the label next to save button
            saveLabel.setText("Error adding child");
        }

    }

    // Clear button sets all fields to empty or null
    public void onClearButtonClick() {
        this.child_first_name_value.setText("");
        this.child_surname_value.setText("");
        this.child_dateofbirth_value.setValue(null);
        this.child_country_of_residence_value.setText("");
        this.Group1.setUserData(null);
    }
}
