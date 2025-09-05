package com.example.sdk11element010;

import javafx.scene.control.Label;
// I would like to add custom exceptions here too and more e.g override printing a giant stack trace for simple things to keep it neat, such as a letter in a number field or vice versa by overriding the stack print method
public class DataVerification extends Exception {
	
	// Checks a menu's single input validity by taking the options as a sequence in a String, iterating through the options comparing the first char of user input to see if it is a valid option
	// No longer necessary in GUI version
	public static boolean checkValidMenuInput(String menuOptions, String userMenuChoice) {
		
		    for (int i = 0; i<menuOptions.length(); i++) {
			    if (userMenuChoice.charAt(0) == (menuOptions.charAt(i))) {
				    return true;
			    }
		    }
		return false;
    }

	// Method takes label parameter for where to display message and an input from user, checks if any input is not equal to numerical values, return false if not for invalid data entry, true if input only matches numbers
	public static boolean checkNumbersOnlyString(Label label, String usersInput) {
		if (!usersInput.matches("[0-9]+")) {
		label.setText("Please enter numbers only");
		label.setStyle("-fx-text-fill: red;");
		return false;
		} else {
			label.setText("");
			return true;
		}
	}

	// Method takes label parameter for where to display message and an input from user, checks if any input is equal to numerical values, return false if yes for invalid data entry, true if input only matches letters
	public static boolean checkLettersOnlyString(Label label, String usersInput) {
		if (usersInput.matches("[0-9]+")) {
			label.setText("Non-numerical characters only");
			label.setStyle("-fx-text-fill: red;");
			return false;
		} else {
			label.setText("");
			return true;
		}
	}

    // Method for ensuring limit of database varchar is not reached by form inputs
	public static boolean checkSQLVarcharLimit(int varcharLimit, String inputString) {
		if (inputString.length() > varcharLimit) {
			return false;
		} else {
			return true;
		}
	}
	// For when I want to override stacktrace print method
	@Override
	public Throwable fillInStackTrace() {
		return this;
	}

}
