package com.example.sdk11element010;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;

import java.sql.SQLException;

// Controller for login or register form
public class LoginRegisterController {

    // Email and password data fields for logging in or registering
    @FXML
    private TextField email_value;
    @FXML
    private TextField password_value;

    private ComboBox<String> marital_status_value;

    // Counter for login attempts
    private short loginCounter = 0;

    @FXML
    private Label resultLabel;

    // Used for delaying scene close to display information to user before closing window
    PauseTransition delay = new PauseTransition(Duration.seconds(2));

    // Get synchronised instance of user
    User user = User.getInstance();

    // If user decides to click log in button
    public void onLoginButtonClick(ActionEvent event){

        // String array for email and password
        String[] credentialsAttempt = new String[2];


        credentialsAttempt[0]=this.email_value.getText();
        credentialsAttempt[1]=this.password_value.getText();

        // Just as an integrity measure, as long as the user is not logged in, check that the credentials are correct, log user in and set logged in to true
        if (user.getUserLoggedInStatus() == false) {
            String[] userCredentials = {credentialsAttempt[0], credentialsAttempt[1]};
            if (Database.checkUserCredentials("SELECT 1 FROM client WHERE email = ? AND password = ?;", userCredentials)) {
                resultLabel.setText("You are now logged in!");
                user.setUserLoggedIn(true);
                user.setUserEmail(credentialsAttempt[0]);
                delay.setOnFinished( event1 -> ((Node)(event.getSource())).getScene().getWindow().hide() );
                delay.play();
                // If credentials are incorrect, display this to user in form label
            } else {
                loginCounter++;
                if (loginCounter >= 3) {
                    // I would put in an email for resetting email, but I'm not sure how to do that at the moment
                    resultLabel.setText("Maximum attempts reached\nPlease try again later or reset email");
                    delay.setOnFinished( event1 -> ((Node)(event.getSource())).getScene().getWindow().hide() );
                    delay.play();
                } else {
                    resultLabel.setText("User credentials not found...\nEmail or password may be incorrect\n\nOr enter credentials and click\nregister to create account!");
                }
            }
        }

    }

    // If user chooses to click register button, they can enter new email and password to create new profile in database
    public void onRegisterButtonClick(ActionEvent event) throws SQLException {
        String[] credentialsAttempt = new String[2];
        credentialsAttempt[0] = this.email_value.getText();
        credentialsAttempt[1] = this.password_value.getText();
        // Method checkUserExists return true or false for the users email in database, if it exists user is displayed user exists message, as to not create duplicates
        if (Database.checkUserExists(credentialsAttempt[0])) {
            resultLabel.setText("This user email already exists\nPlease log in or try a different email...");
            // Some data verification for valid email address entered
        } else if (!credentialsAttempt[0].contains("@hotmail") && !credentialsAttempt[0].contains("@outlook") && !credentialsAttempt[0].contains("@gmail") && !credentialsAttempt[0].contains("@yahoo") && !credentialsAttempt[0].contains("@aol")) {
            resultLabel.setText("Please enter a valid email address");
        } else {
            if (credentialsAttempt[1].length() < 6 || credentialsAttempt[1].length() > 15) {
                // Security purposes, password should be at least 6 characters but not too long either for memorability purposes
                resultLabel.setText("Please enter a password between 6 and 15 characters in length");
            } else {
                // If email is new and password is valid, new user is inserted into database, where auto-incremented clientID value takes care of assigning them an ID in the database
                Database.prepRegisterUpdate("INSERT INTO client (email, password)  VALUES (?, ?);", credentialsAttempt);
                resultLabel.setText("Thank you! Your account has been created");
                // If it is a new profile, user will be presented with a window to create their profile
                user.setIsNewProfile(true);
                user.setUserLoggedIn(true);
                user.setUserEmail(credentialsAttempt[0]);
                delay.setOnFinished( event1 -> ((Node)(event.getSource())).getScene().getWindow().hide() );
                delay.play();
            }
        }
    }

    // Clear button for clearing form fields
    public void onClearButtonClick() {
        email_value.setText("");
        password_value.setText("");
        resultLabel.setText("");
    }
}
