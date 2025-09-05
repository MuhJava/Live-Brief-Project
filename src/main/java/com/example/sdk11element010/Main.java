package com.example.sdk11element010;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        User user = User.getInstance();

        // If database connection fails, exit for retry
        if (!Database.getConnected("postgres", "postgres")) {
            System.out.println("Incorrect database credentials provided");
            System.exit(0);

        } else {
            System.out.println("DataBase connected successfully...");
        }

        // Database table creations for a new system

        // Check client table exists in database otherwise table requires one time creation in new system
        if (Database.checkTableExists("client")) {
            System.out.println("Client table found\n");
        } else {
            Database.createNewTable("CREATE TABLE client (clientID SERIAL PRIMARY KEY, email varchar(40), password varchar(15), firstName varchar(50), surname varchar(50), dob date, marital_status varchar(17), partner_firstName varchar(50), partner_surname varchar(50), client_gross_property_value int, client_net_property_value int, percentage_equity smallint, partner_percentage_equity smallint, total_value_holiday_homes int, net_total_value_holiday_homes int, percentage_holiday_assets smallint, partner_percentage_holiday_assets smallint, btl_property_value int, btl_net_property_value int, btl_percentage smallint, partner_btl_percentage smallint, savings_and_cash int, savings_in_name int, savings_partners_name int, savings_joint int, investments_in_name int, investments_partners_name int, investments_joint int, business_value_in_name int, business_value_partners_name int, business_value_joint int, life_cover_value_on_death int, life_cover_value_partners_death int, pension_or_sipps_in_name int, pension_or_sipps_partners_name int, dis_cover_employer int, dis_cover_partner_employer int);");
            System.out.println(("Client table created\n"));
        }
        // Check child table exists in database otherwise table requires one time creation in new system
        if (Database.checkTableExists("child")) {
            System.out.println("Child table found\n");
        } else {
            Database.createNewTable("CREATE TABLE child (childID SERIAL PRIMARY KEY, clientID int, firstName varchar(50), surname varchar(50), dob date, country_residence varchar(50), belongs_to varchar(10));");
            System.out.println(("Child table created\n"));
        }

        // Display login and register window
        showLoginRegisterWindow();

        // If profile is just made then forward to new profile creation window then direct to homepage
        if (user.getIsNewProfile()) {

            user.setUserID(loadClientID(user.getUserEmail()));

            showCreateProfileWindow();

        }

        // When user is logged in, load userID from clientID in database associated with their data, their ID will be go-to for fetching information
        if (user.getUserLoggedInStatus()) {

            user.setUserID(loadClientID(user.getUserEmail()));

            // Load users data from database

            ResultSet userStoredData = Database.fetchUserData("SELECT * FROM client WHERE clientID = ?;", user.getUserID());

            // Set profile data from stored data on user's ID in database
            while (userStoredData.next()) {

                    user.setUserID(userStoredData.getString(1));
                    user.setUserEmail(userStoredData.getString(2));
                    user.setUserPassword(userStoredData.getString(3));
                    user.setFirstName(userStoredData.getString(4));
                    user.setSurname(userStoredData.getString(5));
                    user.setDateOfBirth(userStoredData.getString(6));
                    user.setMaritalStatus(userStoredData.getString(7));
                    user.setPartnerFirstName(userStoredData.getString(8));
                    user.setPartnerSurname(userStoredData.getString(9));
                    user.setClientGrossPropertyValue(userStoredData.getString(10));
                    user.setClientNetPropertyValue(userStoredData.getString(11));
                    user.setPercentageEquityValue(userStoredData.getString(12));
                    user.setPartnerPercentageEquity(userStoredData.getString(13));
                    user.setTotalHolidayHomesValue(userStoredData.getString(14));
                    user.setNetTotalHolidayHomesValue(userStoredData.getString(15));
                    user.setPercentageHolidayAssetsValue(userStoredData.getString(16));
                    user.setPartnerPercentageHolidayAssets(userStoredData.getString(17));
                    user.setBtlPropertyValue(userStoredData.getString(18));
                    user.setNetBtlPropertyValue(userStoredData.getString(19));
                    user.setPercentageBtlValue(userStoredData.getString(20));
                    user.setPartnerBtlPercentage(userStoredData.getString(21));
                    user.setSavingsAndCashValue(userStoredData.getString(22));
                    user.setSavingsInNameValue(userStoredData.getString(23));
                    user.setSavingsPartnersName(userStoredData.getString(24));
                    user.setSavingsJoint(userStoredData.getString(25));
                    user.setInvestmentsInnameValue(userStoredData.getString(26));
                    user.setInvestmentsPartnersName(userStoredData.getString(27));
                    user.setJointInvestments(userStoredData.getString(28));
                    user.setBusinessValueInNameValue(userStoredData.getString(29));
                    user.setBusinessValuePartnersName(userStoredData.getString(30));
                    user.setJointBusinessValue(userStoredData.getString(31));
                    user.setLifeCoverValue(userStoredData.getString(32));
                    user.setLifeCoverPartnerDeath(userStoredData.getString(33));
                    user.setPensionSippsValue(userStoredData.getString(34));
                    user.setPensionSippsPartnerName(userStoredData.getString(35));
                    user.setDisCoverValue(userStoredData.getString(36));
                    user.setDisCoverPartner(userStoredData.getString(37));


            }

            System.out.println(user.getUserID());
            showHomepageWindow();

        }

    }

    // Display login/register window
    private void showLoginRegisterWindow() {
        try {
            Stage loginRegisterStage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/loginorregister.fxml"));
            Parent root = loader.load();
            loginRegisterStage.setTitle("Log in / Register");
            loginRegisterStage.setScene(new Scene(root, 700, 320));
            loginRegisterStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Display create profile window
    private void showCreateProfileWindow() {
        try {
        Stage profileStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/twoclientform.fxml"));
        profileStage.setTitle("Create profile");
        profileStage.setScene(new Scene(root, 1700, 1000));
        profileStage.showAndWait();
    } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showScenarioWindow() {
        try {
            Stage profileStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/scenarioform.fxml"));
            profileStage.setTitle("Create scenario");
            profileStage.setScene(new Scene(root, 1700, 1000));
            profileStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Display home page
    private void showHomePage2() {
        try {
            Stage homepageStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/homepage2.fxml"));
            homepageStage.setTitle("Home page");
            homepageStage.setScene(new Scene(root, 1800, 1100));
            homepageStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Get clients ID for database profile
    public String loadClientID(String userEmail) throws SQLException {
        ResultSet userStoredID = Database.fetchUserID("SELECT clientID FROM client WHERE email = ?;", userEmail);
        while (userStoredID.next()) {
            return userStoredID.getString(1);
        }
        return null;
    }

    private void showHomepageWindow() {
        try {
            Stage testStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/homepage.fxml"));
            testStage.setTitle("Create scenario");
            testStage.setScene(new Scene(root, 1700, 1000));
            testStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Main method
    public static void main(String[] args) {

        launch(args);

    }
}
