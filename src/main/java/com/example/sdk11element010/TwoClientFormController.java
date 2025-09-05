package com.example.sdk11element010;

import javafx.animation.PauseTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class TwoClientFormController {

    @FXML
    private TableView<Child> childtable;
    @FXML
    private TableColumn<Child, Integer> childNo;
    @FXML
    private TableColumn<Child, Integer> clientID;
    @FXML
    private TableColumn<Child, String> cFName;
    @FXML
    private TableColumn<Child, String> cSName;
    @FXML
    private TableColumn<Child, Date> cdob;
    @FXML
    private TableColumn<Child, String> ccntry;
    @FXML
    private TableColumn<Child, String> cBlngTo;
    @FXML
    private Button clearbutton;
    @FXML
    private Button addbutton;
    @FXML
    private Button savebutton;
    @FXML
    private TextField first_name_value;
    @FXML
    private TextField surname_value;
    @FXML
    private DatePicker dateofbirth_value;
    @FXML
    private ComboBox marital_status_value;
    @FXML
    private TextField partner_first_name_value;
    @FXML
    private TextField partner_surname_value;
    @FXML
    private TextField client_gross_property_value;
    @FXML
    private TextField client_net_property_value;
    @FXML
    private TextField percentage_equity_value;
    @FXML
    private TextField partner_percentage_equity_value;
    @FXML
    private TextField total_holiday_homes_value;
    @FXML
    private TextField net_total_holiday_homes_value;
    @FXML
    private TextField partner_percentage_holiday_assets_value;
    @FXML
    private TextField percentage_holiday_assets_value;
    @FXML
    private TextField btl_property_value;
    @FXML
    private TextField net_btl_property_value;
    @FXML
    private TextField percentage_btl_value;
    @FXML
    private TextField partners_percentage_btl_value;
    @FXML
    private TextField savings_and_cash_value;
    @FXML
    private TextField savings_inname_value;
    @FXML
    private TextField savings_partners_name_value;
    @FXML
    private TextField joint_savings_value;
    @FXML
    private TextField investments_inname_value;
    @FXML
    private TextField investments_partners_name_value;
    @FXML
    private TextField joint_investments_value;
    @FXML
    private TextField business_value_inname_value;
    @FXML
    private TextField business_value_partners_name_value;
    @FXML
    private TextField business_value_joint_value;
    @FXML
    private TextField life_cover_value;
    @FXML
    private TextField partners_life_cover_value;
    @FXML
    private TextField pension_sipps_value;
    @FXML
    private TextField partner_pension_sipps_value;
    @FXML
    private TextField dis_cover_value;
    @FXML
    private TextField partner_dis_cover_value;
    @FXML
    private Label maritalStatusError, varcharError, varcharError1, varcharError2, varcharError3, varcharError4, varcharError5, varcharError6, varcharError7, varcharError8, varcharError9, varcharError10, varcharError11, varcharError12,varcharError13, varcharError14, varcharError15, varcharError16, varcharError17, varcharError18, varcharError19, varcharError20, varcharError21, varcharError22, varcharError23, varcharError24, varcharError25, varcharError26, varcharError27,varcharError28, varcharError29, varcharError30, varcharError31, varcharError32;
    @FXML
    private Label addChildLabel, viewingChildrenLabel;
    @FXML
    PauseTransition delay = new PauseTransition(Duration.seconds(2));
    @FXML
    private Label saveLabel;

    private boolean singleClient;

    User user = User.getInstance();

    public void initialize() {

        marital_status_value.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observableValue, Object o, Object t1) {
                if (marital_status_value.getSelectionModel().selectedItemProperty().getValue().toString().equals("Single")) {
                    singleClient = true;
                } else {
                    singleClient=false;
                }
                partner_first_name_value.setDisable(singleClient);
                partner_surname_value.setDisable(singleClient);
                partner_percentage_equity_value.setDisable(singleClient);
                partners_percentage_btl_value.setDisable(singleClient);
                savings_partners_name_value.setDisable(singleClient);
                joint_savings_value.setDisable(singleClient);
                investments_partners_name_value.setDisable(singleClient);
                joint_investments_value.setDisable(singleClient);
                business_value_partners_name_value.setDisable(singleClient);
                business_value_joint_value.setDisable(singleClient);
                partners_life_cover_value.setDisable(singleClient);
                partner_pension_sipps_value.setDisable(singleClient);
                partner_dis_cover_value.setDisable(singleClient);
                partner_percentage_holiday_assets_value.setDisable(singleClient);
                user.setMaritalStatus(marital_status_value.getSelectionModel().selectedItemProperty().getValue().toString());
                System.out.println(marital_status_value.getSelectionModel().selectedItemProperty().getValue().toString() + "THIS VALUE");
            }
        });
    }
    // Referenced from TableView example, slide 17 available at <https://canvas.anglia.ac.uk/courses/34242/pages/topic-10-working-with-guis-in-java-2> Used for viewing children added to client database
    // Display children associated with client in table
    public ObservableList<Child> getChildList() throws SQLException {
        ObservableList<Child> childDataList = FXCollections.observableArrayList();
        String childDataQuery = "SELECT * FROM child WHERE clientid = ('" + user.getUserID() + "');";
        ResultSet rs = Database.sqlExecute(childDataQuery);
        Child child;
        while (rs.next()) {
            child = new Child(rs.getInt("childid"), rs.getInt("clientid"), rs.getString("firstname"), rs.getString("surname"),
                    rs.getDate("dob"), rs.getString("country_residence"), rs.getString("belongs_to"));
            childDataList.add(child);
        }
        return childDataList;
    }
    public void listChildren() throws SQLException {
        ObservableList<Child> childList = getChildList();
        childNo.setCellValueFactory(new PropertyValueFactory<Child, Integer>("childNumber"));
        clientID.setCellValueFactory(new PropertyValueFactory<Child, Integer>("childClientID"));
        cFName.setCellValueFactory(new PropertyValueFactory<Child, String>("childFirstName"));
        cSName.setCellValueFactory(new PropertyValueFactory<Child, String>("childSurname"));
        cdob.setCellValueFactory(new PropertyValueFactory<Child, Date>("childDob"));
        ccntry.setCellValueFactory(new PropertyValueFactory<Child, String>("countryOfResidence"));
        cBlngTo.setCellValueFactory(new PropertyValueFactory<Child, String>("belongsTo"));
        childtable.setItems(childList);
        System.out.println(childtable.getSelectionModel().getSelectedItems());
    }

    public void keyRelease(){

        if (dateofbirth_value.getValue() == null) {
            savebutton.setDisable(true);
        } else {
            savebutton.setDisable(false);
        }
        if (marital_status_value.getSelectionModel().selectedItemProperty().getValue() == null) {
            maritalStatusError.setText("Marital Status Required");
        } else if (marital_status_value.getSelectionModel().selectedItemProperty().getValue().toString().equals("Single")) {

            List<TextField> textFields = Arrays.asList(first_name_value, surname_value, client_gross_property_value, client_net_property_value, percentage_equity_value,
                    total_holiday_homes_value, net_total_holiday_homes_value, percentage_holiday_assets_value, btl_property_value, net_btl_property_value, percentage_btl_value,
                    savings_and_cash_value, savings_inname_value, investments_inname_value, business_value_inname_value, life_cover_value, pension_sipps_value, dis_cover_value);
            for (TextField field : textFields) {
                if (field.getText().isEmpty()) {
                    savebutton.setDisable(true);
                }
            }
        } else {
            List<TextField> textFields = Arrays.asList(first_name_value, surname_value, partner_first_name_value, partner_surname_value, client_gross_property_value, client_net_property_value, percentage_equity_value,
                    partner_percentage_equity_value, total_holiday_homes_value, net_total_holiday_homes_value, percentage_holiday_assets_value, partner_percentage_holiday_assets_value, btl_property_value, partners_percentage_btl_value, net_btl_property_value, percentage_btl_value,
                    savings_and_cash_value, savings_inname_value, savings_partners_name_value, investments_inname_value, investments_partners_name_value, business_value_inname_value, business_value_partners_name_value, life_cover_value,
                    partners_life_cover_value, pension_sipps_value, partner_pension_sipps_value, dis_cover_value, partner_dis_cover_value, joint_savings_value, joint_investments_value, business_value_joint_value);
            for (TextField field : textFields) {
                if (field.getText().isEmpty()) {
                    savebutton.setDisable(true);
                }
            }
        }
    }
    public void onSaveButtonClick(ActionEvent event){
        if (!marital_status_value.getSelectionModel().selectedItemProperty().getValue().toString().equals("Single")) {
            String[] userData = new String[34];
            userData[0] = this.first_name_value.getText();
            user.setFirstName(first_name_value.getText());
            userData[1] = this.surname_value.getText();
            user.setSurname(surname_value.getText());
            userData[2] = this.dateofbirth_value.getValue().toString();
            user.setDateOfBirth(dateofbirth_value.getValue().toString());
            userData[3] = this.partner_first_name_value.getText();
            user.setPartnerFirstName(partner_first_name_value.getText());
            userData[4] = this.partner_surname_value.getText();
            user.setPartnerSurname(partner_surname_value.getText());
            userData[5] = this.client_gross_property_value.getText();
            user.setClientGrossPropertyValue(client_gross_property_value.getText());
            userData[6] = this.client_net_property_value.getText();
            user.setClientNetPropertyValue(client_net_property_value.getText());
            userData[7] = this.percentage_equity_value.getText();
            user.setPercentageEquityValue(percentage_equity_value.getText());
            userData[8] = this.partner_percentage_equity_value.getText();
            user.setPartnerPercentageEquity(partner_percentage_equity_value.getText());
            userData[9] = this.total_holiday_homes_value.getText();
            user.setTotalHolidayHomesValue(total_holiday_homes_value.getText());
            userData[10] = this.net_total_holiday_homes_value.getText();
            user.setNetTotalHolidayHomesValue(net_total_holiday_homes_value.getText());
            userData[11] = this.btl_property_value.getText();
            user.setBtlPropertyValue(btl_property_value.getText());
            userData[12] = this.net_btl_property_value.getText();
            user.setNetBtlPropertyValue(net_btl_property_value.getText());
            userData[13] = this.percentage_btl_value.getText();
            user.setPercentageBtlValue(percentage_btl_value.getText());
            userData[14] = this.partners_percentage_btl_value.getText();
            user.setPartnerBtlPercentage(partners_percentage_btl_value.getText());
            userData[15] = this.savings_and_cash_value.getText();
            user.setSavingsAndCashValue(savings_and_cash_value.getText());
            userData[16] = this.savings_inname_value.getText();
            user.setSavingsInNameValue(savings_inname_value.getText());
            userData[17] = this.savings_partners_name_value.getText();
            user.setSavingsPartnersName(savings_partners_name_value.getText());
            userData[18] = this.joint_savings_value.getText();
            user.setSavingsJoint(joint_savings_value.getText());
            userData[19] = this.investments_inname_value.getText();
            user.setInvestmentsInnameValue(investments_inname_value.getText());
            userData[20] = this.investments_partners_name_value.getText();
            user.setInvestmentsPartnersName(investments_partners_name_value.getText());
            userData[21] = this.joint_investments_value.getText();
            user.setJointInvestments(joint_investments_value.getText());
            userData[22] = this.business_value_inname_value.getText();
            user.setBusinessValueInNameValue(business_value_inname_value.getText());
            userData[23] = this.business_value_partners_name_value.getText();
            user.setBusinessValuePartnersName(business_value_partners_name_value.getText());
            userData[24] = this.business_value_joint_value.getText();
            user.setJointBusinessValue(business_value_joint_value.getText());
            userData[25] = this.life_cover_value.getText();
            user.setLifeCoverValue(life_cover_value.getText());
            userData[26] = this.partners_life_cover_value.getText();
            user.setLifeCoverPartnerDeath(partners_life_cover_value.getText());
            userData[27] = this.pension_sipps_value.getText();
            user.setPensionSippsValue(pension_sipps_value.getText());
            userData[28] = this.partner_pension_sipps_value.getText();
            user.setPensionSippsPartnerName(partner_pension_sipps_value.getText());
            userData[29] = this.dis_cover_value.getText();
            user.setDisCoverValue(dis_cover_value.getText());
            userData[30] = this.partner_dis_cover_value.getText();
            user.setDisCoverPartner(partner_dis_cover_value.getText());
            userData[31] = this.marital_status_value.getSelectionModel().selectedItemProperty().getValue().toString();
            userData[32] = this.percentage_holiday_assets_value.getText();
            user.setPercentageHolidayAssetsValue(percentage_holiday_assets_value.getText());
            userData[33] = this.partner_percentage_holiday_assets_value.getText();
            user.setPartnerPercentageHolidayAssets(partner_percentage_holiday_assets_value.getText());

            errorLabelCheckVarchar(varcharError, 50, user.getFirstName());
            errorLabelCheckVarchar(varcharError1, 50, user.getSurname());
            if (dateofbirth_value.getValue() == null) {
                varcharError2.setText("Date of birth required");
            }
            errorLabelCheckVarchar(varcharError3, 50, user.getPartnerFirstName());
            errorLabelCheckVarchar(varcharError4, 50, user.getPartnerSurname());
            DataVerification.checkNumbersOnlyString(varcharError5, user.getClientGrossPropertyValue());
            DataVerification.checkNumbersOnlyString(varcharError6, user.getClientNetPropertyValue());
            DataVerification.checkNumbersOnlyString(varcharError7, user.getPercentageEquityValue());
            DataVerification.checkNumbersOnlyString(varcharError8, user.getPartnerPercentageEquity());
            DataVerification.checkNumbersOnlyString(varcharError9, user.getTotalHolidayHomesValue());
            DataVerification.checkNumbersOnlyString(varcharError10, user.getNetTotalHolidayHomesValue());
            DataVerification.checkNumbersOnlyString(varcharError11, user.getBtlPropertyValue());
            DataVerification.checkNumbersOnlyString(varcharError12, user.getNetBtlPropertyValue());
            DataVerification.checkNumbersOnlyString(varcharError13, user.getPercentageBtlValue());
            DataVerification.checkNumbersOnlyString(varcharError14, user.getPartnerBtlPercentage());
            DataVerification.checkNumbersOnlyString(varcharError15, user.getSavingsAndCashValue());
            DataVerification.checkNumbersOnlyString(varcharError16, user.getSavingsInNameValue());
            DataVerification.checkNumbersOnlyString(varcharError17, user.getSavingsPartnersName());
            DataVerification.checkNumbersOnlyString(varcharError18, user.getSavingsJoint());
            DataVerification.checkNumbersOnlyString(varcharError19, user.getInvestmentsInnameValue());
            DataVerification.checkNumbersOnlyString(varcharError20, user.getInvestmentsPartnersName());
            DataVerification.checkNumbersOnlyString(varcharError21, user.getJointInvestments());
            DataVerification.checkNumbersOnlyString(varcharError22, user.getBusinessValueInNameValue());
            DataVerification.checkNumbersOnlyString(varcharError23, user.getBusinessValuePartnersName());
            DataVerification.checkNumbersOnlyString(varcharError24, user.getJointBusinessValue());
            DataVerification.checkNumbersOnlyString(varcharError25, user.getLifeCoverValue());
            DataVerification.checkNumbersOnlyString(varcharError26, user.getLifeCoverPartnerDeath());
            DataVerification.checkNumbersOnlyString(varcharError27, user.getPensionSippsValue());
            DataVerification.checkNumbersOnlyString(varcharError28, user.getPensionSippsPartnerName());
            DataVerification.checkNumbersOnlyString(varcharError29, user.getDisCoverValue());
            DataVerification.checkNumbersOnlyString(varcharError30, user.getDisCoverPartner());
            DataVerification.checkNumbersOnlyString(varcharError31, user.getPercentageHolidayAssetsValue());
            DataVerification.checkNumbersOnlyString(varcharError32, user.getPartnerPercentageHolidayAssets());

            String newProfileData = "UPDATE client SET firstname = ?, surname = ?, dob = ?, partner_firstname = ?, partner_surname = ?, client_gross_property_value = ?, client_net_property_value = ?, percentage_equity = ?, partner_percentage_equity = ?, total_value_holiday_homes = ?, net_total_value_holiday_homes = ?, btl_property_value = ?, btl_net_property_value = ?, btl_percentage = ?, partner_btl_percentage = ?, savings_and_cash = ?, savings_in_name = ?, savings_partners_name = ?, savings_joint = ?, investments_in_name = ?, investments_partners_name = ?, investments_joint = ?, business_value_in_name = ?, business_value_partners_name = ?, business_value_joint = ?, life_cover_value_on_death = ?, life_cover_value_partners_death = ?, pension_or_sipps_in_name = ?, pension_or_sipps_partners_name = ?, dis_cover_employer = ?, dis_cover_partner_employer = ?, marital_status = ? , percentage_holiday_assets = ?, partner_percentage_holiday_assets = ? WHERE clientid = ('" + user.getUserID() + "');";
            if (Database.prepCoupleProfileUpdate(newProfileData, userData)) {
                saveLabel.setText("DataBase Has Been Updated.");
                delay.setOnFinished(event1 -> ((Node) (event.getSource())).getScene().getWindow().hide());
                delay.play();
            } else {
                saveLabel.setText("Invalid submission details, please check entries");
            }
        } else {
            String[] userData = new String[20];
            userData[0]=this.first_name_value.getText();
            user.setFirstName(userData[0]);
            userData[1]=this.surname_value.getText();
            user.setSurname(userData[1]);
            userData[2]=this.dateofbirth_value.getValue().toString();
            user.setDateOfBirth(userData[2]);
            userData[3]=this.client_gross_property_value.getText();
            user.setClientGrossPropertyValue(userData[3]);
            userData[4]=this.client_net_property_value.getText();
            user.setClientNetPropertyValue(userData[4]);
            userData[5]=this.percentage_equity_value.getText();
            user.setPercentageEquityValue(userData[5]);
            userData[6]=this.total_holiday_homes_value.getText();
            user.setTotalHolidayHomesValue(userData[6]);
            userData[7]=this.net_total_holiday_homes_value.getText();
            user.setNetTotalHolidayHomesValue(userData[7]);
            userData[8]=this.percentage_holiday_assets_value.getText();
            user.setPercentageHolidayAssetsValue(userData[8]);
            userData[9]=this.btl_property_value.getText();
            user.setBtlPropertyValue(userData[9]);
            userData[10]=this.net_btl_property_value.getText();
            user.setNetBtlPropertyValue(userData[10]);
            userData[11]=this.percentage_btl_value.getText();
            user.setPercentageBtlValue(userData[11]);
            userData[12]=this.savings_and_cash_value.getText();
            user.setSavingsAndCashValue(userData[12]);
            userData[13]=this.savings_inname_value.getText();
            user.setSavingsInNameValue(userData[13]);
            userData[14]=this.investments_inname_value.getText();
            user.setInvestmentsInnameValue(userData[14]);
            userData[15]=this.business_value_inname_value.getText();
            user.setBusinessValueInNameValue(userData[15]);
            userData[16]=this.life_cover_value.getText();
            user.setLifeCoverValue(userData[16]);
            userData[17]=this.pension_sipps_value.getText();
            user.setPensionSippsValue(userData[17]);
            userData[18]=this.dis_cover_value.getText();
            user.setDisCoverValue(userData[18]);
            userData[19]=this.marital_status_value.getSelectionModel().selectedItemProperty().getValue().toString();
            user.setMaritalStatus(userData[19]);

            errorLabelCheckVarchar(varcharError, 50, user.getFirstName());
            errorLabelCheckVarchar(varcharError1, 50, user.getSurname());
            if (dateofbirth_value.getValue() == null) {
                varcharError2.setText("Date of birth required");
            }
            DataVerification.checkNumbersOnlyString(varcharError5, user.getClientGrossPropertyValue());
            DataVerification.checkNumbersOnlyString(varcharError6, user.getClientNetPropertyValue());
            DataVerification.checkNumbersOnlyString(varcharError7, user.getPercentageEquityValue());
            DataVerification.checkNumbersOnlyString(varcharError9, user.getTotalHolidayHomesValue());
            DataVerification.checkNumbersOnlyString(varcharError10, user.getNetTotalHolidayHomesValue());
            DataVerification.checkNumbersOnlyString(varcharError11, user.getBtlPropertyValue());
            DataVerification.checkNumbersOnlyString(varcharError12, user.getNetBtlPropertyValue());
            DataVerification.checkNumbersOnlyString(varcharError13, user.getPercentageBtlValue());
            DataVerification.checkNumbersOnlyString(varcharError15, user.getSavingsAndCashValue());
            DataVerification.checkNumbersOnlyString(varcharError16, user.getSavingsInNameValue());
            DataVerification.checkNumbersOnlyString(varcharError19, user.getInvestmentsInnameValue());
            DataVerification.checkNumbersOnlyString(varcharError22, user.getBusinessValueInNameValue());
            DataVerification.checkNumbersOnlyString(varcharError25, user.getLifeCoverValue());
            DataVerification.checkNumbersOnlyString(varcharError27, user.getPensionSippsValue());
            DataVerification.checkNumbersOnlyString(varcharError29, user.getDisCoverValue());
            DataVerification.checkNumbersOnlyString(varcharError31, user.getPercentageHolidayAssetsValue());

            String newProfileData = "UPDATE client SET firstname = ?, surname = ?, dob = ?, client_gross_property_value = ?, client_net_property_value = ?, percentage_equity = ?, total_value_holiday_homes = ?, net_total_value_holiday_homes = ?, percentage_holiday_assets = ?, btl_property_value = ?, btl_net_property_value = ?, btl_percentage = ?, savings_and_cash = ?, savings_in_name = ?, investments_in_name = ?, business_value_in_name = ?, life_cover_value_on_death = ?, pension_or_sipps_in_name = ?, dis_cover_employer = ?, marital_status = ? WHERE clientid = ('" + user.getUserID() + "');";
            if (Database.prepSingleProfileUpdate(newProfileData,userData)) {
                saveLabel.setText("DataBase Has Been Updated.");
                delay.setOnFinished(event1 -> ((Node) (event.getSource())).getScene().getWindow().hide());
                delay.play();
            } else {
                saveLabel.setText("Invalid submission details, please check entries");
            }
        }
    }
    public void onClearButtonClick(){

        first_name_value.setText("");
        surname_value.setText("");
        dateofbirth_value.setValue(null);
        partner_first_name_value.setText("");
        partner_surname_value.setText("");
        client_gross_property_value.setText("");
        client_net_property_value.setText("");
        percentage_equity_value.setText("");
        partner_percentage_equity_value.setText("");
        total_holiday_homes_value.setText("");
        net_total_holiday_homes_value.setText("");
        btl_property_value.setText("");
        net_btl_property_value.setText("");
        percentage_btl_value.setText("");
        partners_percentage_btl_value.setText("");
        savings_and_cash_value.setText("");
        savings_inname_value.setText("");
        savings_partners_name_value.setText("");
        joint_savings_value.setText("");
        investments_inname_value.setText("");
        investments_partners_name_value.setText("");
        joint_investments_value.setText("");
        business_value_inname_value.setText("");
        business_value_partners_name_value.setText("");
        business_value_joint_value.setText("");
        life_cover_value.setText("");
        partners_life_cover_value.setText("");
        pension_sipps_value.setText("");
        partner_pension_sipps_value.setText("");
        dis_cover_value.setText("");
        partner_dis_cover_value.setText("");
        percentage_holiday_assets_value.setText("");
        partner_percentage_holiday_assets_value.setText("");

    }

    // Display data for view tab
    public void displayProfileData() {

        List<TextField> textFields = Arrays.asList(first_name_value, surname_value, partner_first_name_value, partner_surname_value, client_gross_property_value, client_net_property_value, percentage_equity_value,
                partner_percentage_equity_value, total_holiday_homes_value, net_total_holiday_homes_value, percentage_holiday_assets_value, partner_percentage_holiday_assets_value, btl_property_value, partners_percentage_btl_value, net_btl_property_value, percentage_btl_value,
                savings_and_cash_value, savings_inname_value, savings_partners_name_value, investments_inname_value, investments_partners_name_value, business_value_inname_value, business_value_partners_name_value, life_cover_value,
                partners_life_cover_value, pension_sipps_value, partner_pension_sipps_value, dis_cover_value, partner_dis_cover_value, joint_savings_value, joint_investments_value, business_value_joint_value);

        // Ensure nulls are empty for loading, avoid NullPointerExceptions, and disable fields for view only purposes
        for (TextField field : textFields) {
            if (field.getText() == null) {
                field.setText("");
            }
            field.setDisable(true);
        }

        first_name_value.setText(user.getFirstName());
        surname_value.setText(user.getSurname());
        if (user.getDateOfBirth() != null) {
            dateofbirth_value.setValue(user.getDateOfBirth());
            dateofbirth_value.setDisable(true);
        }
        if (user.getMaritalStatus() != null) {
            marital_status_value.setValue(user.getMaritalStatus());
            marital_status_value.setDisable(true);
        }

        partner_first_name_value.setText(user.getPartnerFirstName());
        partner_surname_value.setText(user.getPartnerSurname());
        client_gross_property_value.setText(user.getClientGrossPropertyValue());
        client_net_property_value.setText(user.getClientNetPropertyValue());
        percentage_equity_value.setText(user.getPercentageEquityValue());
        partner_percentage_equity_value.setText(user.getPartnerPercentageEquity());
        total_holiday_homes_value.setText(user.getTotalHolidayHomesValue());
        net_total_holiday_homes_value.setText(user.getNetTotalHolidayHomesValue());
        btl_property_value.setText(user.getBtlPropertyValue());
        net_btl_property_value.setText(user.getNetBtlPropertyValue());
        percentage_btl_value.setText(user.getPercentageBtlValue());
        partners_percentage_btl_value.setText(user.getPartnerBtlPercentage());
        savings_and_cash_value.setText(user.getSavingsAndCashValue());
        savings_inname_value.setText(user.getSavingsInNameValue());
        savings_partners_name_value.setText(user.getSavingsPartnersName());
        joint_savings_value.setText(user.getSavingsJoint());
        investments_inname_value.setText(user.getInvestmentsInnameValue());
        investments_partners_name_value.setText(user.getInvestmentsPartnersName());
        joint_investments_value.setText(user.getJointInvestments());
        business_value_inname_value.setText(user.getBusinessValueInNameValue());
        business_value_partners_name_value.setText(user.getBusinessValuePartnersName());
        business_value_joint_value.setText(user.getJointBusinessValue());
        life_cover_value.setText(user.getLifeCoverValue());
        partners_life_cover_value.setText(user.getLifeCoverPartnerDeath());
        pension_sipps_value.setText(user.getPensionSippsValue());
        partner_pension_sipps_value.setText(user.getPensionSippsPartnerName());
        dis_cover_value.setText(user.getDisCoverValue());
        partner_dis_cover_value.setText(user.getDisCoverPartner());
        percentage_holiday_assets_value.setText(user.getPercentageHolidayAssetsValue());
        partner_percentage_holiday_assets_value.setText(user.getPartnerPercentageHolidayAssets());
    }

    // Opens a new smaller window for adding a child one at a time to be auto-incremented by ID in the database, linked to clientid, user may add as many children as they like
    public void onAddButtonClick() {
        try {
            Stage loginRegisterStage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/child.fxml"));
            Parent root = loader.load();
            loginRegisterStage.setTitle("Add a child");
            loginRegisterStage.setScene(new Scene(root, 700, 320));
            loginRegisterStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Show and hide function button methods, for homepage to utilise when in view only
    public void viewTabHideButtons() {
        savebutton.setVisible(false);
        clearbutton.setVisible(false);
        addbutton.setVisible(false);
    }
    public void viewTabShowButtons() {
        savebutton.setVisible(true);
        clearbutton.setVisible(true);
        addbutton.setVisible(true);
    }

    // Handle hiding or showing the view table for children for view tab
    public void hideChildTable() {
        childtable.setVisible(false);
    }
    public void showChildTable() {
        childtable.setVisible(true);
    }
    // Handle turning relevant labels on or off for view tab or not
    public void viewLabels() {
        addChildLabel.setVisible(false);
        viewingChildrenLabel.setVisible(true);
    }
    public void nonViewLabels() {
        addChildLabel.setVisible(true);
        viewingChildrenLabel.setVisible(false);
    }

    // Checking database varchar limit against field value
    private void errorLabelCheckVarchar(Label label, int maxChar, String userData) {
        if (!DataVerification.checkSQLVarcharLimit(maxChar, userData)) {
            label.setText("Maximum characters allowed: " + maxChar);
            label.setStyle("-fx-text-fill: red;");
        } else {
            label.setText("");
        }
    }
}
