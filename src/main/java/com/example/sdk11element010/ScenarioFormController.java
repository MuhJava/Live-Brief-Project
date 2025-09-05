package com.example.sdk11element010;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

// Form controller for creating scenario and generating report

public class ScenarioFormController {
    public RadioButton IHTyes;
    public RadioButton IHTno;
    @FXML
    private ComboBox chosen_client_analysis;
    @FXML
    private ComboBox marital_status_analysis;
    @FXML
    private Label maritalStatusError;
    @FXML
    private TextField Age_analysis;
    @FXML
    private TextField Custom_aims_analysis;
    @FXML
    private TextField Primary_property_analysis;
    @FXML
    private TextField primary_mortgage_analysis;
    @FXML
    private TextField primary_mortgage_years_analysis;
    @FXML
    private TextField Uk_holiday_property_analysis;
    @FXML
    private TextField holiday_mortgage_analysis;
    @FXML
    private TextField holiday_mortgage_years_analysis;
    @FXML
    private TextField BTL_property_analysis;
    @FXML
    private TextField BTL_mortgage_analysis;
    @FXML
    private TextField BTL_mortgage_years_analysis;
    @FXML
    private TextField overseas_property_analysis;
    @FXML
    private TextField overseas_mortgage_analysis;
    @FXML
    private TextField overseas_mortgage_years_analysis;
    @FXML
    private TextField BPR_assets_analysis;
    @FXML
    private TextField Non_BPR_assets_analysis;
    @FXML
    private TextField Nature_of_investments_analysis;
    @FXML
    private TextField investments_analysis;
    @FXML
    private TextField savings_and_cash_analysis;
    @FXML
    private TextField life_cover_analysis;
    @FXML
    private TextField pension_SIPP_analysis;
    @FXML
    private TextField death_service_analysis;
    @FXML
    private TextField inheritance_value_analysis;
    @FXML
    private TextField first_name_analysis;
    @FXML
    private TextField surname_analysis;


    // IHT boolean
    @FXML
    private ToggleGroup Group1;

    // NRB boolean
    @FXML
    private ToggleGroup Group2;

    // LPAs boolean
    @FXML
    private ToggleGroup Group3;

    // Bloodline protection boolean
    @FXML
    private ToggleGroup Group4;

    // Foreign will boolean
    @FXML
    private ToggleGroup Group5;

    // Life cover to trust boolean
    @FXML
    private ToggleGroup Group6;

    // Death benefit to trust boolean
    @FXML
    private ToggleGroup Group7;

    // Death in service to trust boolean
    @FXML
    private ToggleGroup Group8;

    // Inheritance boolean
    @FXML
    private ToggleGroup Group9;
    
    @FXML
    private Label submitLabel;
    @FXML
    private Label varcharError, varcharError1, varcharError2, varcharError3, varcharError4, varcharError5, varcharError6, varcharError7, varcharError8, varcharError9, varcharError10, varcharError11, varcharError12,varcharError13, varcharError14, varcharError15, varcharError16, varcharError17, varcharError18,
            varcharError19, varcharError20, varcharError21, varcharError22, varcharError23, varcharError24, varcharError25, varcharError26, varcharError27, varcharError28, varcharError29, varcharError30, varcharError31,varcharError32, varcharError33, varcharError34, varcharError35, varcharError36, varcharError37;
    @FXML
    private Button submitButton;

    User user = User.getInstance();

    ScenarioTemps scenarioTemps = ScenarioTemps.getInstance();

    RadioButton UKIHTChoiceYou;
    RadioButton NRBChoiceYou;
    RadioButton LPAsChoiceYou;
    RadioButton BLPChoiceYou;
    RadioButton ForeignWillChoiceYou;
    RadioButton LifeCoverTrustChoiceYou;
    RadioButton DeathBenefitTrustChoiceYou;
    RadioButton DeathServiceTrustChoiceYou;
    RadioButton InheritanceChoiceYou;
    RadioButton UKIHTChoicePartner;
    RadioButton NRBChoicePartner;
    RadioButton LPAsChoicePartner;
    RadioButton BLPChoicePartner;
    RadioButton ForeignWillChoicePartner;
    RadioButton LifeCoverTrustChoicePartner;
    RadioButton DeathBenefitTrustChoicePartner;
    RadioButton DeathServiceTrustChoicePartner;
    RadioButton InheritanceChoicePartner;
    RadioButton ForeignWillChoiceJoint;
    RadioButton LifeCoverTrustChoiceJoint;

    private int futurePropertyValue, futureOutstandingMortgage, futureHolidayHomeValue, futureHolidayOutstandingMortgage, futureBTLOutstandingMortgage, futureBTLValue, futureOverseasValue, futureOverseasOutstandingMortgage, totalFuturePropertyValue, futureInvestmentsValue, futureSavingsAndCash, totalClientOneAssets, totalClientTwoAssets, totalJointAssets, totalCombined;

    // Load current user values from user profile for convenience
    /*
    public void onLoadButtonClick() {
        first_name_value.setText(user.getFirstName());
        surname_value.setText(user.getSurname());
        dateofbirth_value.setValue(user.getDateOfBirth());
        client_gross_property_value.setText(user.getClientGrossPropertyValue());
        client_net_property_value.setText(user.getClientNetPropertyValue());
        percentage_equity_value.setText(user.getPercentageEquityValue());
        total_holiday_homes_value.setText(user.getTotalHolidayHomesValue());
        net_total_holiday_homes_value.setText(user.getNetTotalHolidayHomesValue());
        btl_property_value.setText(user.getBtlPropertyValue());
        net_btl_property_value.setText(user.getNetBtlPropertyValue());
        percentage_btl_value.setText(user.getPercentageBtlValue());
        savings_and_cash_value.setText(user.getSavingsAndCashValue());
        savings_inname_value.setText(user.getSavingsInNameValue());
        investments_inname_value.setText(user.getInvestmentsInnameValue());
        business_value_inname_value.setText(user.getBusinessValueInNameValue());
        life_cover_value.setText(user.getLifeCoverValue());
        pension_sipps_value.setText(user.getPensionSippsValue());
        dis_cover_value.setText(user.getDisCoverValue());
    }
     */

    // Form fields need to be checked and controlled i.e for empty and disabling functions accordingly so list of fields created
    public void initialize() {

        List<TextField> textFields = Arrays.asList(Age_analysis, Custom_aims_analysis, Primary_property_analysis, primary_mortgage_analysis, primary_mortgage_years_analysis, Uk_holiday_property_analysis,
                holiday_mortgage_analysis, holiday_mortgage_years_analysis, BTL_property_analysis, BTL_mortgage_analysis, BTL_mortgage_years_analysis, overseas_property_analysis, overseas_mortgage_analysis, overseas_mortgage_years_analysis,
                BPR_assets_analysis, Non_BPR_assets_analysis, Nature_of_investments_analysis, investments_analysis, savings_and_cash_analysis, life_cover_analysis, pension_SIPP_analysis, death_service_analysis,
                inheritance_value_analysis, first_name_analysis, surname_analysis);

        // Form for scenario is extensive for every field so have made it so the same fields for different purposes i.e client 1, client 2 or joint are on the same form but cycled through via a drop down options menu, the relevant fields are then enabled or disabled when not, to make sure all necessary fields are taken for proper database updating
        chosen_client_analysis.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observableValue, Object o, Object t1) {
                if (chosen_client_analysis.getSelectionModel().selectedItemProperty().getValue().toString().equals("Yourself")) {
                    deactivateNonJointFields(false);

                    Age_analysis.setText(scenarioTemps.getClientOneAgeAnalysis());
                    Custom_aims_analysis.setText(scenarioTemps.getClientOneCustomAimsAnalysis());
                    Primary_property_analysis.setText(scenarioTemps.getClientOnePrimaryPropertyAnalysis());
                    primary_mortgage_analysis.setText(scenarioTemps.getClientOnePrimaryMortgageAnalysis());
                    primary_mortgage_years_analysis.setText(scenarioTemps.getClientOnePrimaryMortgageYearsAnalysis());
                    Uk_holiday_property_analysis.setText(scenarioTemps.getClientOneUkHolidayPropertyAnalysis());
                    holiday_mortgage_analysis.setText(scenarioTemps.getClientOneHolidayMortgageAnalysis());
                    holiday_mortgage_years_analysis.setText(scenarioTemps.getClientOneHolidayMortgageYearsAnalysis());
                    BTL_property_analysis.setText(scenarioTemps.getClientOneBTLPropertyAnalysis());
                    BTL_mortgage_analysis.setText(scenarioTemps.getClientOneBTLMortgageAnalysis());
                    BTL_mortgage_years_analysis.setText(scenarioTemps.getClientOneBTLMortgageYearsAnalysis());
                    overseas_property_analysis.setText(scenarioTemps.getClientOneOverseasPropertyAnalysis());
                    overseas_mortgage_analysis.setText(scenarioTemps.getClientOneOverseasMortgageAnalysis());
                    overseas_mortgage_years_analysis.setText(scenarioTemps.getClientOneOverseasMortgageYearsAnalysis());
                    BPR_assets_analysis.setText(scenarioTemps.getClientOneBPRAssetsAnalysis());
                    Non_BPR_assets_analysis.setText(scenarioTemps.getClientOneNonBPRAssetsAnalysis());
                    Nature_of_investments_analysis.setText(scenarioTemps.getClientOneNatureOfInvestmentsAnalysis());
                    investments_analysis.setText(scenarioTemps.getClientOneInvestmentsAnalysis());
                    savings_and_cash_analysis.setText(scenarioTemps.getClientOneSavingsAndCashAnalysis());
                    life_cover_analysis.setText(scenarioTemps.getClientOneLifeCoverAnalysis());
                    pension_SIPP_analysis.setText(scenarioTemps.getClientOnePensionSIPPAnalysis());
                    death_service_analysis.setText(scenarioTemps.getClientOneDeathServiceAnalysis());
                    inheritance_value_analysis.setText(scenarioTemps.getClientOneInheritanceValueAnalysis());
                    first_name_analysis.setText(scenarioTemps.getClientOneFirstNameAnalysis());
                    surname_analysis.setText(scenarioTemps.getClientOneSurnameAnalysis());
                    Group1.selectToggle(scenarioTemps.getClientOneUKIHTtoggle());
                    Group2.selectToggle(scenarioTemps.getClientOneNRBtoggle());
                    Group3.selectToggle(scenarioTemps.getClientOneLPAtoggle());
                    Group4.selectToggle(scenarioTemps.getClientOneBLPtoggle());
                    Group5.selectToggle(scenarioTemps.getClientOneforeignWilltoggle());
                    Group6.selectToggle(scenarioTemps.getClientOnelifeCoverInTrusttoggle());
                    Group7.selectToggle(scenarioTemps.getClientOneDeathBenefitToTrusttoggle());
                    Group8.selectToggle(scenarioTemps.getClientOnedeathInServiceToTrusttoggle());
                    Group9.selectToggle(scenarioTemps.getClientOneExpectingInheritancetoggle());


                    for (TextField field : textFields) {
                        if (field.getText() == null) {
                            field.setText("");
                        }
                    }


                } else if (chosen_client_analysis.getSelectionModel().selectedItemProperty().getValue().toString().equals("Your partner")) {
                    deactivateNonJointFields(false);

                    Age_analysis.setText(scenarioTemps.getClientTwoAgeAnalysis());
                    Custom_aims_analysis.setText(scenarioTemps.getClientTwoCustomAimsAnalysis());
                    Primary_property_analysis.setText(scenarioTemps.getClientTwoPrimaryPropertyAnalysis());
                    primary_mortgage_analysis.setText(scenarioTemps.getClientTwoPrimaryMortgageAnalysis());
                    primary_mortgage_years_analysis.setText(scenarioTemps.getClientTwoPrimaryMortgageYearsAnalysis());
                    Uk_holiday_property_analysis.setText(scenarioTemps.getClientTwoUkHolidayPropertyAnalysis());
                    holiday_mortgage_analysis.setText(scenarioTemps.getClientTwoHolidayMortgageAnalysis());
                    holiday_mortgage_years_analysis.setText(scenarioTemps.getClientTwoHolidayMortgageYearsAnalysis());
                    BTL_property_analysis.setText(scenarioTemps.getClientTwoBTLPropertyAnalysis());
                    BTL_mortgage_analysis.setText(scenarioTemps.getClientTwoBTLMortgageAnalysis());
                    BTL_mortgage_years_analysis.setText(scenarioTemps.getClientTwoBTLMortgageYearsAnalysis());
                    overseas_property_analysis.setText(scenarioTemps.getClientTwoOverseasPropertyAnalysis());
                    overseas_mortgage_analysis.setText(scenarioTemps.getClientTwoOverseasMortgageAnalysis());
                    overseas_mortgage_years_analysis.setText(scenarioTemps.getClientTwoOverseasMortgageYearsAnalysis());
                    BPR_assets_analysis.setText(scenarioTemps.getClientTwoBPRAssetsAnalysis());
                    Non_BPR_assets_analysis.setText(scenarioTemps.getClientTwoNonBPRAssetsAnalysis());
                    Nature_of_investments_analysis.setText(scenarioTemps.getClientTwoNatureOfInvestmentsAnalysis());
                    investments_analysis.setText(scenarioTemps.getClientTwoInvestmentsAnalysis());
                    savings_and_cash_analysis.setText(scenarioTemps.getClientTwoSavingsAndCashAnalysis());
                    life_cover_analysis.setText(scenarioTemps.getClientTwoLifeCoverAnalysis());
                    pension_SIPP_analysis.setText(scenarioTemps.getClientTwoPensionSIPPAnalysis());
                    death_service_analysis.setText(scenarioTemps.getClientTwoDeathServiceAnalysis());
                    inheritance_value_analysis.setText(scenarioTemps.getClientTwoInheritanceValueAnalysis());
                    first_name_analysis.setText(scenarioTemps.getClientTwoFirstNameAnalysis());
                    surname_analysis.setText(scenarioTemps.getClientTwoSurnameAnalysis());
                    Group1.selectToggle(scenarioTemps.getClientTwoUKIHTtoggle());
                    Group2.selectToggle(scenarioTemps.getClientTwoNRBtoggle());
                    Group3.selectToggle(scenarioTemps.getClientTwoLPAtoggle());
                    Group4.selectToggle(scenarioTemps.getClientTwoBLPtoggle());
                    Group5.selectToggle(scenarioTemps.getClientTwoforeignWilltoggle());
                    Group6.selectToggle(scenarioTemps.getClientTwolifeCoverInTrusttoggle());
                    Group7.selectToggle(scenarioTemps.getClientTwoDeathBenefitToTrusttoggle());
                    Group8.selectToggle(scenarioTemps.getClientTwodeathInServiceToTrusttoggle());
                    Group9.selectToggle(scenarioTemps.getClientTwoExpectingInheritancetoggle());


                    for (TextField field : textFields) {
                        if (field.getText() == null) {
                            field.setText("");
                        }
                    }

                    // This is for "joint" value gathering hence disabling those features not listed by JJEP as joint values
                } else {
                    // Fields irrelevant to joint data not needed
                    deactivateNonJointFields(true);

                    Primary_property_analysis.setText(scenarioTemps.getJointPrimaryPropertyAnalysis());
                    primary_mortgage_analysis.setText(scenarioTemps.getJointPrimaryMortgageAnalysis());
                    primary_mortgage_years_analysis.setText(scenarioTemps.getJointPrimaryMortgageYearsAnalysis());
                    Uk_holiday_property_analysis.setText(scenarioTemps.getJointUkHolidayPropertyAnalysis());
                    holiday_mortgage_analysis.setText(scenarioTemps.getJointHolidayMortgageAnalysis());
                    holiday_mortgage_years_analysis.setText(scenarioTemps.getJointHolidayMortgageYearsAnalysis());
                    BTL_property_analysis.setText(scenarioTemps.getJointBTLPropertyAnalysis());
                    BTL_mortgage_analysis.setText(scenarioTemps.getJointBTLMortgageAnalysis());
                    BTL_mortgage_years_analysis.setText(scenarioTemps.getJointBTLMortgageYearsAnalysis());
                    overseas_property_analysis.setText(scenarioTemps.getJointOverseasPropertyAnalysis());
                    overseas_mortgage_analysis.setText(scenarioTemps.getJointOverseasMortgageAnalysis());
                    overseas_mortgage_years_analysis.setText(scenarioTemps.getJointOverseasMortgageYearsAnalysis());
                    BPR_assets_analysis.setText(scenarioTemps.getJointBPRAssetsAnalysis());
                    Non_BPR_assets_analysis.setText(scenarioTemps.getJointNonBPRAssetsAnalysis());
                    Nature_of_investments_analysis.setText(scenarioTemps.getJointNatureOfInvestmentsAnalysis());
                    investments_analysis.setText(scenarioTemps.getJointInvestmentsAnalysis());
                    savings_and_cash_analysis.setText(scenarioTemps.getJointSavingsAndCashAnalysis());
                    life_cover_analysis.setText(scenarioTemps.getJointLifeCoverAnalysis());
                    Group5.selectToggle(scenarioTemps.getClientJointforeignWilltoggle());
                    Group6.selectToggle(scenarioTemps.getClientJointlifeCoverInTrusttoggle());

                    for (TextField field : textFields) {
                        if (field.getText() == null) {
                            field.setText("");
                        }
                    }

                }
            }
        });
    }

    // Keeping track of data fields depending on client selected by saving to temporary variables, so that user can change forms between themselves, potentially partner and joint fields while retaining what they have entered for each.
    public void keyRelease() {

        // Initially data fields are for the person filling form, so even if "Yourself" is not yet selected it defaults to it at first
        // Data fields save to "client one" temporary variables
        if (chosen_client_analysis.getSelectionModel().selectedItemProperty().getValue() == null || chosen_client_analysis.getSelectionModel().selectedItemProperty().getValue().toString().equals("Yourself")) {

            scenarioTemps.setClientOneAgeAnalysis(Age_analysis.getText());
            scenarioTemps.setClientOneCustomAimsAnalysis(Custom_aims_analysis.getText());
            scenarioTemps.setClientOnePrimaryPropertyAnalysis(Primary_property_analysis.getText());
            scenarioTemps.setClientOnePrimaryMortgageAnalysis(primary_mortgage_analysis.getText());
            scenarioTemps.setClientOnePrimaryMortgageYearsAnalysis(primary_mortgage_years_analysis.getText());
            scenarioTemps.setClientOneUkHolidayPropertyAnalysis(Uk_holiday_property_analysis.getText());
            scenarioTemps.setClientOneHolidayMortgageAnalysis(holiday_mortgage_analysis.getText());
            scenarioTemps.setClientOneHolidayMortgageYearsAnalysis(holiday_mortgage_years_analysis.getText());
            scenarioTemps.setClientOneBTLPropertyAnalysis(BTL_property_analysis.getText());
            scenarioTemps.setClientOneBTLMortgageAnalysis(BTL_mortgage_analysis.getText());
            scenarioTemps.setClientOneBTLMortgageYearsAnalysis(BTL_mortgage_years_analysis.getText());
            scenarioTemps.setClientOneOverseasPropertyAnalysis(overseas_property_analysis.getText());
            scenarioTemps.setClientOneOverseasMortgageAnalysis(overseas_mortgage_analysis.getText());
            scenarioTemps.setClientOneOverseasMortgageYearsAnalysis(overseas_mortgage_years_analysis.getText());
            scenarioTemps.setClientOneBPRAssetsAnalysis(BPR_assets_analysis.getText());
            scenarioTemps.setClientOneNonBPRAssetsAnalysis(Non_BPR_assets_analysis.getText());
            scenarioTemps.setClientOneNatureOfInvestmentsAnalysis(Nature_of_investments_analysis.getText());
            scenarioTemps.setClientOneInvestmentsAnalysis(investments_analysis.getText());
            scenarioTemps.setClientOneSavingsAndCashAnalysis(savings_and_cash_analysis.getText());
            scenarioTemps.setClientOneLifeCoverAnalysis(life_cover_analysis.getText());
            scenarioTemps.setClientOnePensionSIPPAnalysis(pension_SIPP_analysis.getText());
            scenarioTemps.setClientOneDeathServiceAnalysis(death_service_analysis.getText());
            scenarioTemps.setClientOneInheritanceValueAnalysis(inheritance_value_analysis.getText());
            scenarioTemps.setClientOneFirstNameAnalysis(first_name_analysis.getText());
            scenarioTemps.setClientOneSurnameAnalysis(surname_analysis.getText());

            // Toggle buttons were tricky to work with i.e using data input and re-toggling for when user is switching through the personal, partner and joint data forms
            // But eventually, here I have tracking the users input by setting temporary field with current data to load when necessary during form completion, and
            // only storing toggle button value while it is not null otherwise exception is thrown
            scenarioTemps.setClientOneUKIHTtoggle(Group1.getSelectedToggle());
            if (Group1.getSelectedToggle() != null) {
                UKIHTChoiceYou = (RadioButton) Group1.getSelectedToggle();
                scenarioTemps.setClientOneUKIHTbool(UKIHTChoiceYou.getText());
            }
            scenarioTemps.setClientOneNRBtoggle(Group2.getSelectedToggle());
            if (Group2.getSelectedToggle() != null) {
                NRBChoiceYou = (RadioButton) Group2.getSelectedToggle();
                scenarioTemps.setClientOneNRBbool(NRBChoiceYou.getText());
            }
            scenarioTemps.setClientOneLPAtoggle(Group3.getSelectedToggle());
            if (Group3.getSelectedToggle() != null) {
                LPAsChoiceYou = (RadioButton) Group3.getSelectedToggle();
                scenarioTemps.setClientOneLPAbool(LPAsChoiceYou.getText());
            }
            scenarioTemps.setClientOneBLPtoggle(Group4.getSelectedToggle());
            if (Group4.getSelectedToggle() != null) {
                BLPChoiceYou = (RadioButton) Group4.getSelectedToggle();
                scenarioTemps.setClientOneBLPbool(BLPChoiceYou.getText());
            }
            scenarioTemps.setClientOneforeignWilltoggle(Group5.getSelectedToggle());
            if (Group5.getSelectedToggle() != null) {
                ForeignWillChoiceYou = (RadioButton) Group5.getSelectedToggle();
                scenarioTemps.setClientOneforeignWillbool(ForeignWillChoiceYou.getText());
            }
            scenarioTemps.setClientOnelifeCoverInTrusttoggle(Group6.getSelectedToggle());
            if (Group6.getSelectedToggle() != null) {
                LifeCoverTrustChoiceYou = (RadioButton) Group6.getSelectedToggle();
                scenarioTemps.setClientOnelifeCoverInTrustbool(LifeCoverTrustChoiceYou.getText());
            }
            scenarioTemps.setClientOneDeathBenefitToTrusttoggle(Group7.getSelectedToggle());
            if (Group7.getSelectedToggle() != null) {
                DeathBenefitTrustChoiceYou = (RadioButton) Group7.getSelectedToggle();
                scenarioTemps.setClientOneDeathBenefitToTrustbool(DeathBenefitTrustChoiceYou.getText());
            }
            scenarioTemps.setClientOnedeathInServiceToTrusttoggle(Group8.getSelectedToggle());
            if (Group8.getSelectedToggle() != null) {
                DeathServiceTrustChoiceYou = (RadioButton) Group8.getSelectedToggle();
                scenarioTemps.setClientOnedeathInServiceToTrustbool(DeathServiceTrustChoiceYou.getText());
            }
            scenarioTemps.setClientOneExpectingInheritancetoggle(Group9.getSelectedToggle());
            if (Group9.getSelectedToggle() != null) {
                InheritanceChoiceYou = (RadioButton) Group9.getSelectedToggle();
                scenarioTemps.setClientOneExpectingInheritancebool(InheritanceChoiceYou.getText());
            }

            // Data fields now save to "client two" temporary variables
        } else if (chosen_client_analysis.getSelectionModel().selectedItemProperty().getValue().equals("Your partner")) {
            scenarioTemps.setClientTwoAgeAnalysis(Age_analysis.getText());
            scenarioTemps.setClientTwoCustomAimsAnalysis(Custom_aims_analysis.getText());
            scenarioTemps.setClientTwoPrimaryPropertyAnalysis(Primary_property_analysis.getText());
            scenarioTemps.setClientTwoPrimaryMortgageAnalysis(primary_mortgage_analysis.getText());
            scenarioTemps.setClientTwoPrimaryMortgageYearsAnalysis(primary_mortgage_years_analysis.getText());
            scenarioTemps.setClientTwoUkHolidayPropertyAnalysis(Uk_holiday_property_analysis.getText());
            scenarioTemps.setClientTwoHolidayMortgageAnalysis(holiday_mortgage_analysis.getText());
            scenarioTemps.setClientTwoHolidayMortgageYearsAnalysis(holiday_mortgage_years_analysis.getText());
            scenarioTemps.setClientTwoBTLPropertyAnalysis(BTL_property_analysis.getText());
            scenarioTemps.setClientTwoBTLMortgageAnalysis(BTL_mortgage_analysis.getText());
            scenarioTemps.setClientTwoBTLMortgageYearsAnalysis(BTL_mortgage_years_analysis.getText());
            scenarioTemps.setClientTwoOverseasPropertyAnalysis(overseas_property_analysis.getText());
            scenarioTemps.setClientTwoOverseasMortgageAnalysis(overseas_mortgage_analysis.getText());
            scenarioTemps.setClientTwoOverseasMortgageYearsAnalysis(overseas_mortgage_years_analysis.getText());
            scenarioTemps.setClientTwoBPRAssetsAnalysis(BPR_assets_analysis.getText());
            scenarioTemps.setClientTwoNonBPRAssetsAnalysis(Non_BPR_assets_analysis.getText());
            scenarioTemps.setClientTwoNatureOfInvestmentsAnalysis(Nature_of_investments_analysis.getText());
            scenarioTemps.setClientTwoInvestmentsAnalysis(investments_analysis.getText());
            scenarioTemps.setClientTwoSavingsAndCashAnalysis(savings_and_cash_analysis.getText());
            scenarioTemps.setClientTwoLifeCoverAnalysis(life_cover_analysis.getText());
            scenarioTemps.setClientTwoPensionSIPPAnalysis(pension_SIPP_analysis.getText());
            scenarioTemps.setClientTwoDeathServiceAnalysis(death_service_analysis.getText());
            scenarioTemps.setClientTwoInheritanceValueAnalysis(inheritance_value_analysis.getText());
            scenarioTemps.setClientTwoFirstNameAnalysis(first_name_analysis.getText());
            scenarioTemps.setClientTwoSurnameAnalysis(surname_analysis.getText());

            scenarioTemps.setClientTwoUKIHTtoggle(Group1.getSelectedToggle());
            if (Group1.getSelectedToggle() != null) {
                UKIHTChoicePartner = (RadioButton) Group1.getSelectedToggle();
                scenarioTemps.setClientTwoUKIHTbool(UKIHTChoicePartner.getText());
            }

            scenarioTemps.setClientTwoNRBtoggle(Group2.getSelectedToggle());
            if (Group2.getSelectedToggle() != null) {
                NRBChoicePartner = (RadioButton) Group2.getSelectedToggle();
                scenarioTemps.setClientTwoNRBbool(NRBChoicePartner.getText());
            }
            scenarioTemps.setClientTwoLPAtoggle(Group3.getSelectedToggle());
            if (Group3.getSelectedToggle() != null) {
                LPAsChoicePartner = (RadioButton) Group3.getSelectedToggle();
                scenarioTemps.setClientTwoLPAbool(LPAsChoicePartner.getText());
            }
            scenarioTemps.setClientTwoBLPtoggle(Group4.getSelectedToggle());
            if (Group4.getSelectedToggle() != null) {
                BLPChoicePartner = (RadioButton) Group4.getSelectedToggle();
                scenarioTemps.setClientTwoBLPbool(BLPChoicePartner.getText());
            }
            scenarioTemps.setClientTwoforeignWilltoggle(Group5.getSelectedToggle());
            if (Group5.getSelectedToggle() != null) {
                ForeignWillChoicePartner = (RadioButton) Group5.getSelectedToggle();
                scenarioTemps.setClientTwoforeignWillbool(ForeignWillChoicePartner.getText());
            }
            scenarioTemps.setClientTwolifeCoverInTrusttoggle(Group6.getSelectedToggle());
            if (Group6.getSelectedToggle() != null) {
                LifeCoverTrustChoicePartner = (RadioButton) Group6.getSelectedToggle();
                scenarioTemps.setClientTwolifeCoverInTrustbool(LifeCoverTrustChoicePartner.getText());
            }
            scenarioTemps.setClientTwoDeathBenefitToTrusttoggle(Group7.getSelectedToggle());
            if (Group7.getSelectedToggle() != null) {
                DeathBenefitTrustChoicePartner = (RadioButton) Group7.getSelectedToggle();
                scenarioTemps.setClientTwoDeathBenefitToTrustbool(DeathBenefitTrustChoicePartner.getText());
            }
            scenarioTemps.setClientTwodeathInServiceToTrusttoggle(Group8.getSelectedToggle());
            if (Group8.getSelectedToggle() != null) {
                DeathServiceTrustChoicePartner = (RadioButton) Group8.getSelectedToggle();
                scenarioTemps.setClientTwodeathInServiceToTrustbool(DeathServiceTrustChoicePartner.getText());
            }
            scenarioTemps.setClientTwoExpectingInheritancetoggle(Group9.getSelectedToggle());
            if (Group9.getSelectedToggle() != null) {
                InheritanceChoicePartner = (RadioButton) Group9.getSelectedToggle();
                scenarioTemps.setClientTwoExpectingInheritancebool(InheritanceChoicePartner.getText());
            }
            // Data fields now saved to "joint" temporary variables
        } else {
            scenarioTemps.setJointPrimaryPropertyAnalysis(Primary_property_analysis.getText());
            scenarioTemps.setJointPrimaryMortgageAnalysis(primary_mortgage_analysis.getText());
            scenarioTemps.setJointPrimaryMortgageYearsAnalysis(primary_mortgage_years_analysis.getText());
            scenarioTemps.setJointUkHolidayPropertyAnalysis(Uk_holiday_property_analysis.getText());
            scenarioTemps.setJointHolidayMortgageAnalysis(holiday_mortgage_analysis.getText());
            scenarioTemps.setJointHolidayMortgageYearsAnalysis(holiday_mortgage_years_analysis.getText());
            scenarioTemps.setJointBTLPropertyAnalysis(BTL_property_analysis.getText());
            scenarioTemps.setJointBTLMortgageAnalysis(BTL_mortgage_analysis.getText());
            scenarioTemps.setJointBTLMortgageYearsAnalysis(BTL_mortgage_years_analysis.getText());
            scenarioTemps.setJointOverseasPropertyAnalysis(overseas_property_analysis.getText());
            scenarioTemps.setJointOverseasMortgageAnalysis(overseas_mortgage_analysis.getText());
            scenarioTemps.setJointOverseasMortgageYearsAnalysis(overseas_mortgage_years_analysis.getText());
            scenarioTemps.setJointBPRAssetsAnalysis(BPR_assets_analysis.getText());
            scenarioTemps.setJointNonBPRAssetsAnalysis(Non_BPR_assets_analysis.getText());
            scenarioTemps.setJointNatureOfInvestmentsAnalysis(Nature_of_investments_analysis.getText());
            scenarioTemps.setJointInvestmentsAnalysis(investments_analysis.getText());
            scenarioTemps.setJointSavingsAndCashAnalysis(savings_and_cash_analysis.getText());
            scenarioTemps.setJointLifeCoverAnalysis(life_cover_analysis.getText());

            scenarioTemps.setClientJointforeignWilltoggle(Group5.getSelectedToggle());
            if (Group5.getSelectedToggle() != null) {
                ForeignWillChoiceJoint = (RadioButton) Group5.getSelectedToggle();
                scenarioTemps.setClientJointforeignWillbool(ForeignWillChoiceJoint.getText());
            }
            scenarioTemps.setClientJointlifeCoverInTrusttoggle(Group6.getSelectedToggle());
            if (Group6.getSelectedToggle() != null) {
                LifeCoverTrustChoiceJoint = (RadioButton) Group6.getSelectedToggle();
                scenarioTemps.setClientJointlifeCoverInTrustbool(LifeCoverTrustChoiceJoint.getText());
            }
        }
        // Not null check before taking selection from marital status
        if (marital_status_analysis.getSelectionModel().selectedItemProperty().getValue() != null) {
            scenarioTemps.setClientOneMaritalStatus(marital_status_analysis.getSelectionModel().selectedItemProperty().getValue().toString());

            // If relationship is single then partner and joint fields not necessary to check have data for database updating
            if ((scenarioTemps.getClientOneMaritalStatus().equals("Single"))) {
                List<String> inputData = Arrays.asList(scenarioTemps.getClientOneAgeAnalysis(), scenarioTemps.getClientOneCustomAimsAnalysis(), scenarioTemps.getClientOnePrimaryPropertyAnalysis(), scenarioTemps.getClientOnePrimaryMortgageAnalysis(),
                        scenarioTemps.getClientOnePrimaryMortgageYearsAnalysis(), scenarioTemps.getClientOneUkHolidayPropertyAnalysis(), scenarioTemps.getClientOneHolidayMortgageAnalysis(),
                        scenarioTemps.getClientOneHolidayMortgageYearsAnalysis(), scenarioTemps.getClientOneBTLPropertyAnalysis(), scenarioTemps.getClientOneBTLMortgageAnalysis(), scenarioTemps.getClientOneBTLMortgageYearsAnalysis(),
                        scenarioTemps.getClientOneOverseasPropertyAnalysis(), scenarioTemps.getClientOneOverseasMortgageAnalysis(), scenarioTemps.getClientOneOverseasMortgageYearsAnalysis(), scenarioTemps.getClientOneBPRAssetsAnalysis(),
                        scenarioTemps.getClientOneNonBPRAssetsAnalysis(), scenarioTemps.getClientOneNatureOfInvestmentsAnalysis(), scenarioTemps.getClientOneInvestmentsAnalysis(), scenarioTemps.getClientOneSavingsAndCashAnalysis(),
                        scenarioTemps.getClientOneLifeCoverAnalysis(), scenarioTemps.getClientOnePensionSIPPAnalysis(), scenarioTemps.getClientOneDeathServiceAnalysis(),
                        scenarioTemps.getClientOneInheritanceValueAnalysis(), scenarioTemps.getClientOneFirstNameAnalysis(), scenarioTemps.getClientOneSurnameAnalysis());

                // Have submit button enabled unless a field is empty
                submitButton.setDisable(false);
                for (String string : inputData) {
                    if (string == null || string.trim().isEmpty()) {
                        submitButton.setDisable(true);
                    }
                }

                List<RadioButton> oneClientToggles = Arrays.asList(UKIHTChoiceYou, NRBChoiceYou, LPAsChoiceYou, BLPChoiceYou, ForeignWillChoiceYou,
                LifeCoverTrustChoiceYou, DeathBenefitTrustChoiceYou, DeathServiceTrustChoiceYou, InheritanceChoiceYou);

                for (RadioButton button: oneClientToggles) {
                    if (button == null) {
                        submitButton.setDisable(true);
                    }
                }


                // If relationship is not single then all partner and joint data values are necessary to check have data for database updating
            } else {
                submitLabel.setText("Please fill partner & joint forms");
                List<String> fullInputData = Arrays.asList(scenarioTemps.getClientOneAgeAnalysis(), scenarioTemps.getClientOneCustomAimsAnalysis(), scenarioTemps.getClientOnePrimaryPropertyAnalysis(), scenarioTemps.getClientOnePrimaryMortgageAnalysis(),
                        scenarioTemps.getClientOnePrimaryMortgageYearsAnalysis(), scenarioTemps.getClientOneUkHolidayPropertyAnalysis(), scenarioTemps.getClientOneHolidayMortgageAnalysis(),
                        scenarioTemps.getClientOneHolidayMortgageYearsAnalysis(), scenarioTemps.getClientOneBTLPropertyAnalysis(), scenarioTemps.getClientOneBTLMortgageAnalysis(), scenarioTemps.getClientOneBTLMortgageYearsAnalysis(),
                        scenarioTemps.getClientOneOverseasPropertyAnalysis(), scenarioTemps.getClientOneOverseasMortgageAnalysis(), scenarioTemps.getClientOneOverseasMortgageYearsAnalysis(), scenarioTemps.getClientOneBPRAssetsAnalysis(),
                        scenarioTemps.getClientOneNonBPRAssetsAnalysis(), scenarioTemps.getClientOneNatureOfInvestmentsAnalysis(), scenarioTemps.getClientOneInvestmentsAnalysis(), scenarioTemps.getClientOneSavingsAndCashAnalysis(),
                        scenarioTemps.getClientOneLifeCoverAnalysis(), scenarioTemps.getClientOnePensionSIPPAnalysis(), scenarioTemps.getClientOneDeathServiceAnalysis(),
                        scenarioTemps.getClientOneInheritanceValueAnalysis(), scenarioTemps.getClientOneFirstNameAnalysis(), scenarioTemps.getClientOneSurnameAnalysis(),

                        scenarioTemps.getClientTwoAgeAnalysis(), scenarioTemps.getClientTwoCustomAimsAnalysis(), scenarioTemps.getClientTwoPrimaryPropertyAnalysis(), scenarioTemps.getClientTwoPrimaryMortgageAnalysis(),
                        scenarioTemps.getClientTwoPrimaryMortgageYearsAnalysis(), scenarioTemps.getClientTwoUkHolidayPropertyAnalysis(), scenarioTemps.getClientTwoHolidayMortgageAnalysis(),
                        scenarioTemps.getClientTwoHolidayMortgageYearsAnalysis(), scenarioTemps.getClientTwoBTLPropertyAnalysis(), scenarioTemps.getClientTwoBTLMortgageAnalysis(), scenarioTemps.getClientTwoBTLMortgageYearsAnalysis(),
                        scenarioTemps.getClientTwoOverseasPropertyAnalysis(), scenarioTemps.getClientTwoOverseasMortgageAnalysis(), scenarioTemps.getClientTwoOverseasMortgageYearsAnalysis(), scenarioTemps.getClientTwoBPRAssetsAnalysis(),
                        scenarioTemps.getClientTwoNonBPRAssetsAnalysis(), scenarioTemps.getClientTwoNatureOfInvestmentsAnalysis(), scenarioTemps.getClientTwoInvestmentsAnalysis(), scenarioTemps.getClientTwoSavingsAndCashAnalysis(),
                        scenarioTemps.getClientTwoLifeCoverAnalysis(), scenarioTemps.getClientTwoPensionSIPPAnalysis(), scenarioTemps.getClientTwoDeathServiceAnalysis(),
                        scenarioTemps.getClientTwoInheritanceValueAnalysis(), scenarioTemps.getClientTwoFirstNameAnalysis(), scenarioTemps.getClientTwoSurnameAnalysis(),

                        scenarioTemps.getJointPrimaryPropertyAnalysis(), scenarioTemps.getJointPrimaryMortgageAnalysis(), scenarioTemps.getJointPrimaryMortgageYearsAnalysis(),
                        scenarioTemps.getJointUkHolidayPropertyAnalysis(), scenarioTemps.getJointHolidayMortgageAnalysis(), scenarioTemps.getJointHolidayMortgageYearsAnalysis(),
                        scenarioTemps.getJointBTLPropertyAnalysis(), scenarioTemps.getJointBTLMortgageAnalysis(), scenarioTemps.getJointBTLMortgageYearsAnalysis(),
                        scenarioTemps.getJointOverseasPropertyAnalysis(), scenarioTemps.getJointOverseasMortgageAnalysis(), scenarioTemps.getJointOverseasMortgageYearsAnalysis(),
                        scenarioTemps.getJointBPRAssetsAnalysis(), scenarioTemps.getJointNonBPRAssetsAnalysis(), scenarioTemps.getJointNatureOfInvestmentsAnalysis(),
                        scenarioTemps.getJointInvestmentsAnalysis(), scenarioTemps.getJointSavingsAndCashAnalysis(), scenarioTemps.getJointLifeCoverAnalysis());

                ;
                // temp check
                for (String string : fullInputData) {
                    System.out.print(string + ",");
                }
                submitButton.setDisable(false);
                for (String string : fullInputData) {
                    if (string == null || string.trim().isEmpty()) {
                        submitButton.setDisable(true);
                    }
                }

                List<RadioButton> twoClientToggles = Arrays.asList(UKIHTChoiceYou, NRBChoiceYou, LPAsChoiceYou, BLPChoiceYou, ForeignWillChoiceYou,
                        LifeCoverTrustChoiceYou, DeathBenefitTrustChoiceYou, DeathServiceTrustChoiceYou, InheritanceChoiceYou, UKIHTChoicePartner, NRBChoicePartner, LPAsChoicePartner,
                        BLPChoicePartner, ForeignWillChoicePartner, LifeCoverTrustChoicePartner, DeathBenefitTrustChoicePartner, DeathServiceTrustChoicePartner,
                        InheritanceChoicePartner, ForeignWillChoiceJoint, LifeCoverTrustChoiceJoint);

                for (RadioButton button: twoClientToggles) {
                    if (button == null) {
                        submitButton.setDisable(true);
                    }
                }


            }
            // This is if marital status has not been selected yet
        } else {
            maritalStatusError.setText("Please select status");
            submitButton.setDisable(true);
        }

    }

    // Submit for future value and response calculations, for single or relationship data captures depending on marital status provided
    public void onSubmitButtonClick() {

        // If user is single then program disregards any input for other forms i.e partner and joint
        if (scenarioTemps.getClientOneMaritalStatus() == null || scenarioTemps.getClientOneMaritalStatus().equals("Single")) {
            String[] userData = new String[25];

            userData[0] = scenarioTemps.getClientOneAgeAnalysis();
            userData[1] = scenarioTemps.getClientOneCustomAimsAnalysis();
            userData[2] = scenarioTemps.getClientOnePrimaryPropertyAnalysis();
            userData[3] = scenarioTemps.getClientOnePrimaryMortgageAnalysis();
            userData[4] = scenarioTemps.getClientOnePrimaryMortgageYearsAnalysis();
            userData[5] = scenarioTemps.getClientOneUkHolidayPropertyAnalysis();
            userData[6] = scenarioTemps.getClientOneHolidayMortgageAnalysis();
            userData[7] = scenarioTemps.getClientOneHolidayMortgageYearsAnalysis();
            userData[8] = scenarioTemps.getClientOneBTLPropertyAnalysis();
            userData[9] = scenarioTemps.getClientOneBTLMortgageAnalysis();
            userData[10] = scenarioTemps.getClientOneBTLMortgageYearsAnalysis();
            userData[11] = scenarioTemps.getClientOneOverseasPropertyAnalysis();
            userData[12] = scenarioTemps.getClientOneOverseasMortgageAnalysis();
            userData[13] = scenarioTemps.getClientOneOverseasMortgageYearsAnalysis();
            userData[14] = scenarioTemps.getClientOneBPRAssetsAnalysis();
            userData[15] = scenarioTemps.getClientOneNonBPRAssetsAnalysis();
            userData[16] = scenarioTemps.getClientOneNatureOfInvestmentsAnalysis();
            userData[17] = scenarioTemps.getClientOneInvestmentsAnalysis();
            userData[18] = scenarioTemps.getClientOneSavingsAndCashAnalysis();
            userData[19] = scenarioTemps.getClientOneLifeCoverAnalysis();
            userData[20] = scenarioTemps.getClientOnePensionSIPPAnalysis();
            userData[21] = scenarioTemps.getClientOneDeathServiceAnalysis();
            userData[22] = scenarioTemps.getClientOneInheritanceValueAnalysis();
            userData[23] = scenarioTemps.getClientOneFirstNameAnalysis();
            userData[24] = scenarioTemps.getClientOneSurnameAnalysis();

            // Data verification checks
            errorLabelCheckVarchar(varcharError, 50, scenarioTemps.getClientOneFirstNameAnalysis());
            DataVerification.checkLettersOnlyString(varcharError, scenarioTemps.getClientOneFirstNameAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError2, scenarioTemps.getClientOneAgeAnalysis());
            DataVerification.checkLettersOnlyString(varcharError7, scenarioTemps.getClientOneCustomAimsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError8, scenarioTemps.getClientOnePrimaryPropertyAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError9, scenarioTemps.getClientOnePrimaryMortgageAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError10, scenarioTemps.getClientOnePrimaryMortgageYearsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError11, scenarioTemps.getClientOneUkHolidayPropertyAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError12, scenarioTemps.getClientOneHolidayMortgageAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError13, scenarioTemps.getClientOneHolidayMortgageYearsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError14, scenarioTemps.getClientOneBTLPropertyAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError15, scenarioTemps.getClientOneBTLMortgageAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError16, scenarioTemps.getClientOneBTLMortgageYearsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError17, scenarioTemps.getClientOneOverseasPropertyAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError18, scenarioTemps.getClientOneOverseasMortgageAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError19, scenarioTemps.getClientOneOverseasMortgageYearsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError21, scenarioTemps.getClientOneBPRAssetsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError22, scenarioTemps.getClientOneNonBPRAssetsAnalysis());
            DataVerification.checkLettersOnlyString(varcharError23, scenarioTemps.getClientOneNatureOfInvestmentsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError24, scenarioTemps.getClientOneInvestmentsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError25, scenarioTemps.getClientOneSavingsAndCashAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError26, scenarioTemps.getClientOneLifeCoverAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError28, scenarioTemps.getClientOnePensionSIPPAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError30, scenarioTemps.getClientOneDeathServiceAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError33, scenarioTemps.getClientOneInheritanceValueAnalysis());

            // Total assets for single client, property values minus outstanding mortgages
            try {
                totalClientOneAssets = (Integer.parseInt(scenarioTemps.getClientOnePrimaryPropertyAnalysis()) - Integer.parseInt(scenarioTemps.getClientOnePrimaryMortgageAnalysis()))
                        + (Integer.parseInt(scenarioTemps.getClientOneUkHolidayPropertyAnalysis()) - Integer.parseInt(scenarioTemps.getClientOneHolidayMortgageAnalysis()))
                        + (Integer.parseInt(scenarioTemps.getClientOneBTLPropertyAnalysis()) - Integer.parseInt(scenarioTemps.getClientOneBTLMortgageAnalysis()))
                        + (Integer.parseInt(scenarioTemps.getClientOneOverseasPropertyAnalysis()) - Integer.parseInt(scenarioTemps.getClientOneOverseasMortgageAnalysis()))
                        + (Integer.parseInt(scenarioTemps.getClientOneBPRAssetsAnalysis()) + Integer.parseInt(scenarioTemps.getClientOneNonBPRAssetsAnalysis()))
                        + (Integer.parseInt(scenarioTemps.getClientOneInvestmentsAnalysis()) + Integer.parseInt(scenarioTemps.getClientOneSavingsAndCashAnalysis()));

                // Future asset values are calculated for 10 years at 5% compounding interest. Math pow takes 1.05 (5% increase) to power 10 for 10 years then multiplies property value
                // Property values need to be cast to double initially to be calculated with the double value returned from Math.pow, if years are 0 there should be no outstanding mortgage so the divisions should be skipped to avoid /0
                if (Integer.parseInt(scenarioTemps.getClientOnePrimaryMortgageYearsAnalysis()) != 0) {
                    futureOutstandingMortgage = (int) (Float.parseFloat(scenarioTemps.getClientOnePrimaryMortgageAnalysis()) - ((Float.parseFloat(scenarioTemps.getClientOnePrimaryMortgageAnalysis()) / Float.parseFloat(scenarioTemps.getClientOnePrimaryMortgageYearsAnalysis())) * 10));
                }
                futurePropertyValue = (int) ((double) Integer.parseInt(scenarioTemps.getClientOnePrimaryPropertyAnalysis()) * (Math.pow(1.05, 10)));
                if (Integer.parseInt(scenarioTemps.getClientOneHolidayMortgageYearsAnalysis()) != 0) {
                    futureHolidayOutstandingMortgage = (int) (Float.parseFloat(scenarioTemps.getClientOneHolidayMortgageAnalysis()) - ((Float.parseFloat(scenarioTemps.getClientOneHolidayMortgageAnalysis()) / Float.parseFloat(scenarioTemps.getClientOneHolidayMortgageYearsAnalysis())) * 10));
                }
                futureHolidayHomeValue = (int) ((double) Integer.parseInt(scenarioTemps.getClientOneUkHolidayPropertyAnalysis()) * (Math.pow(1.05, 10)));
                if (Integer.parseInt(scenarioTemps.getClientOneBTLMortgageYearsAnalysis()) != 0) {
                    futureBTLOutstandingMortgage = (int) (Float.parseFloat(scenarioTemps.getClientOneBTLMortgageAnalysis()) - ((Float.parseFloat(scenarioTemps.getClientOneBTLMortgageAnalysis()) / Float.parseFloat(scenarioTemps.getClientOneBTLMortgageYearsAnalysis())) * 10));
                }
                futureBTLValue = (int) ((double) Integer.parseInt(scenarioTemps.getClientOneBTLPropertyAnalysis()) * (Math.pow(1.05, 10)));
                if (Integer.parseInt(scenarioTemps.getClientOneOverseasMortgageYearsAnalysis()) != 0) {
                    futureOverseasOutstandingMortgage = (int) (Float.parseFloat(scenarioTemps.getClientOneOverseasMortgageAnalysis()) - ((Float.parseFloat(scenarioTemps.getClientOneOverseasMortgageAnalysis()) / Float.parseFloat(scenarioTemps.getClientOneOverseasMortgageYearsAnalysis())) * 10));
                }
                futureOverseasValue = (int) ((double) Integer.parseInt(scenarioTemps.getClientOneOverseasPropertyAnalysis()) * (Math.pow(1.05, 10)));
                // Final total is property values summed minus the remaining mortgage to pay, calculated as JJEP demonstrate, dividing outstanding mortgage by number of years remaining, then multiply by 10 for amount paid over 10 years and deduct from initial value
                // totalFuturePropertyValue = (futurePropertyValue + futureHolidayHomeValue + futureBTLValue + futureOverseasValue) - (futureOutstandingMortgage + futureHolidayOutstandingMortgage + futureBTLOutstandingMortgage + futureOverseasOutstandingMortgage);
                futureInvestmentsValue = (int) ((double) Integer.parseInt(scenarioTemps.getClientOneInvestmentsAnalysis()) * (Math.pow(1.05, 10)));
                futureSavingsAndCash = (int) ((double) Integer.parseInt(scenarioTemps.getClientOneSavingsAndCashAnalysis()) * (Math.pow(1.05, 10)));
                totalClientOneAssets = (totalFuturePropertyValue + futureInvestmentsValue + futureSavingsAndCash);
            } catch (NumberFormatException NFE) {
                NFE.fillInStackTrace();
                // Save printing an entire stack trace to console for user
                System.out.println("Input error: Error message displayed on form accordingly");
            }
            // check results System.out.println(futurePropertyValue + ", " + futureBTLValue + ", " + Float.parseFloat(scenarioTemps.getClientOneBTLMortgageAnalysis()) + ", " + (Float.parseFloat(scenarioTemps.getClientOneBTLMortgageAnalysis()) / Float.parseFloat(scenarioTemps.getClientOneBTLMortgageYearsAnalysis())) + ", " + ((Float.parseFloat(scenarioTemps.getClientOneBTLMortgageAnalysis()) / Float.parseFloat(scenarioTemps.getClientOneBTLMortgageYearsAnalysis())) * 10) + ", " + futureBTLOutstandingMortgage + ", " + Integer.parseInt(scenarioTemps.getClientOneBTLMortgageAnalysis()) + ", " + ((Float.parseFloat(scenarioTemps.getClientOneBTLMortgageAnalysis()) / Float.parseFloat(scenarioTemps.getClientOneBTLMortgageYearsAnalysis())) * 10) + ", "  + (Integer.parseInt(scenarioTemps.getClientOneBTLMortgageAnalysis()) / Integer.parseInt(scenarioTemps.getClientOneBTLMortgageYearsAnalysis())) + ", " + totalFuturePropertyValue + ", " + futureInvestmentsValue + ", " + futureSavingsAndCash + ", " + totalClientOneAssets);

            // Printing to console for temporary measure to check it works, I would rather use a tableview, probably make this a method with parameters but it only needs to be called twice so probably uneccesary
            System.out.println("************** Scenario Report **************\n\n"+ "Life cover: " + printLifeCoverReport(scenarioTemps.getClientOneMaritalStatus()));
            System.out.println("\nPersonal pension: " + printPensionReport(scenarioTemps.getClientOneMaritalStatus()));
            System.out.println("\nDeath in service: " + printDeathInServiceReport(scenarioTemps.getClientOneMaritalStatus()));
            if (user.getUserLoggedInStatus() == false) {
                System.out.println("Please create an account with us and for a small administration fee we can process and save your scenario, and get in touch");
            }
            // else save to scenario database table

        } else {
            // If user is not single then partners data fields are also necessary for database update execution and data verification checks
            String[] userData = new String[68];

            userData[0] = scenarioTemps.getClientOneAgeAnalysis();
            userData[1] = scenarioTemps.getClientOneCustomAimsAnalysis();
            userData[2] = scenarioTemps.getClientOnePrimaryPropertyAnalysis();
            userData[3] = scenarioTemps.getClientOnePrimaryMortgageAnalysis();
            userData[4] = scenarioTemps.getClientOnePrimaryMortgageYearsAnalysis();
            userData[5] = scenarioTemps.getClientOneUkHolidayPropertyAnalysis();
            userData[6] = scenarioTemps.getClientOneHolidayMortgageAnalysis();
            userData[7] = scenarioTemps.getClientOneHolidayMortgageYearsAnalysis();
            userData[8] = scenarioTemps.getClientOneBTLPropertyAnalysis();
            userData[9] = scenarioTemps.getClientOneBTLMortgageAnalysis();
            userData[10] = scenarioTemps.getClientOneBTLMortgageYearsAnalysis();
            userData[11] = scenarioTemps.getClientOneOverseasPropertyAnalysis();
            userData[12] = scenarioTemps.getClientOneOverseasMortgageAnalysis();
            userData[13] = scenarioTemps.getClientOneOverseasMortgageYearsAnalysis();
            userData[14] = scenarioTemps.getClientOneBPRAssetsAnalysis();
            userData[15] = scenarioTemps.getClientOneNonBPRAssetsAnalysis();
            userData[16] = scenarioTemps.getClientOneNatureOfInvestmentsAnalysis();
            userData[17] = scenarioTemps.getClientOneInvestmentsAnalysis();
            userData[18] = scenarioTemps.getClientOneSavingsAndCashAnalysis();
            userData[19] = scenarioTemps.getClientOneLifeCoverAnalysis();
            userData[20] = scenarioTemps.getClientOnePensionSIPPAnalysis();
            userData[21] = scenarioTemps.getClientOneDeathServiceAnalysis();
            userData[22] = scenarioTemps.getClientOneInheritanceValueAnalysis();
            userData[23] = scenarioTemps.getClientOneFirstNameAnalysis();
            userData[24] = scenarioTemps.getClientOneSurnameAnalysis();
            userData[25] = scenarioTemps.getClientTwoAgeAnalysis();
            userData[26] = scenarioTemps.getClientTwoCustomAimsAnalysis();
            userData[27] = scenarioTemps.getClientTwoPrimaryPropertyAnalysis();
            userData[28] = scenarioTemps.getClientTwoPrimaryMortgageAnalysis();
            userData[29] = scenarioTemps.getClientTwoPrimaryMortgageYearsAnalysis();
            userData[30] = scenarioTemps.getClientTwoUkHolidayPropertyAnalysis();
            userData[31] = scenarioTemps.getClientTwoHolidayMortgageAnalysis();
            userData[32] = scenarioTemps.getClientTwoHolidayMortgageYearsAnalysis();
            userData[33] = scenarioTemps.getClientTwoBTLPropertyAnalysis();
            userData[34] = scenarioTemps.getClientTwoBTLMortgageAnalysis();
            userData[35] = scenarioTemps.getClientTwoBTLMortgageYearsAnalysis();
            userData[36] = scenarioTemps.getClientTwoOverseasPropertyAnalysis();
            userData[37] = scenarioTemps.getClientTwoOverseasMortgageAnalysis();
            userData[38] = scenarioTemps.getClientTwoOverseasMortgageYearsAnalysis();
            userData[39] = scenarioTemps.getClientTwoBPRAssetsAnalysis();
            userData[40] = scenarioTemps.getClientTwoNonBPRAssetsAnalysis();
            userData[41] = scenarioTemps.getClientTwoNatureOfInvestmentsAnalysis();
            userData[42] = scenarioTemps.getClientTwoInvestmentsAnalysis();
            userData[43] = scenarioTemps.getClientTwoSavingsAndCashAnalysis();
            userData[44] = scenarioTemps.getClientTwoLifeCoverAnalysis();
            userData[45] = scenarioTemps.getClientTwoPensionSIPPAnalysis();
            userData[46] = scenarioTemps.getClientTwoDeathServiceAnalysis();
            userData[47] = scenarioTemps.getClientTwoInheritanceValueAnalysis();
            userData[48] = scenarioTemps.getClientTwoFirstNameAnalysis();
            userData[49] = scenarioTemps.getClientTwoSurnameAnalysis();
            userData[50] = scenarioTemps.getJointPrimaryPropertyAnalysis();
            userData[51] = scenarioTemps.getJointPrimaryMortgageAnalysis();
            userData[52] = scenarioTemps.getJointPrimaryMortgageYearsAnalysis();
            userData[53] = scenarioTemps.getJointUkHolidayPropertyAnalysis();
            userData[54] = scenarioTemps.getJointHolidayMortgageAnalysis();
            userData[55] = scenarioTemps.getJointHolidayMortgageYearsAnalysis();
            userData[56] = scenarioTemps.getJointBTLPropertyAnalysis();
            userData[57] = scenarioTemps.getJointBTLMortgageAnalysis();
            userData[58] = scenarioTemps.getJointBTLMortgageYearsAnalysis();
            userData[59] = scenarioTemps.getJointOverseasPropertyAnalysis();
            userData[60] = scenarioTemps.getJointOverseasMortgageAnalysis();
            userData[61] = scenarioTemps.getJointOverseasMortgageYearsAnalysis();
            userData[62] = scenarioTemps.getJointBPRAssetsAnalysis();
            userData[63] = scenarioTemps.getJointNonBPRAssetsAnalysis();
            userData[64] = scenarioTemps.getJointNatureOfInvestmentsAnalysis();
            userData[65] = scenarioTemps.getJointInvestmentsAnalysis();
            userData[66] = scenarioTemps.getJointSavingsAndCashAnalysis();
            userData[67] = scenarioTemps.getJointLifeCoverAnalysis();

            errorLabelCheckVarchar(varcharError, 50, scenarioTemps.getClientOneFirstNameAnalysis());
            DataVerification.checkLettersOnlyString(varcharError, scenarioTemps.getClientOneFirstNameAnalysis());
            errorLabelCheckVarchar(varcharError1, 50, scenarioTemps.getClientTwoFirstNameAnalysis());
            DataVerification.checkLettersOnlyString(varcharError1, scenarioTemps.getClientTwoFirstNameAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError2, scenarioTemps.getClientOneAgeAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError2, scenarioTemps.getClientTwoAgeAnalysis());
            DataVerification.checkLettersOnlyString(varcharError7, scenarioTemps.getClientOneCustomAimsAnalysis());
            DataVerification.checkLettersOnlyString(varcharError7, scenarioTemps.getClientTwoCustomAimsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError8, scenarioTemps.getClientOnePrimaryPropertyAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError8, scenarioTemps.getClientTwoPrimaryPropertyAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError9, scenarioTemps.getClientOnePrimaryMortgageAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError9, scenarioTemps.getClientTwoPrimaryMortgageAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError10, scenarioTemps.getClientOnePrimaryMortgageYearsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError10, scenarioTemps.getClientTwoPrimaryMortgageYearsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError11, scenarioTemps.getClientOneUkHolidayPropertyAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError11, scenarioTemps.getClientTwoUkHolidayPropertyAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError12, scenarioTemps.getClientOneHolidayMortgageAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError12, scenarioTemps.getClientTwoHolidayMortgageAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError13, scenarioTemps.getClientOneHolidayMortgageYearsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError13, scenarioTemps.getClientTwoHolidayMortgageYearsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError14, scenarioTemps.getClientOneBTLPropertyAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError14, scenarioTemps.getClientTwoBTLPropertyAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError15, scenarioTemps.getClientOneBTLMortgageAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError15, scenarioTemps.getClientTwoBTLMortgageAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError16, scenarioTemps.getClientOneBTLMortgageYearsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError16, scenarioTemps.getClientTwoBTLMortgageYearsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError17, scenarioTemps.getClientOneOverseasPropertyAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError17, scenarioTemps.getClientTwoOverseasPropertyAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError18, scenarioTemps.getClientOneOverseasMortgageAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError18, scenarioTemps.getClientTwoOverseasMortgageAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError19, scenarioTemps.getClientOneOverseasMortgageYearsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError19, scenarioTemps.getClientTwoOverseasMortgageYearsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError21, scenarioTemps.getClientOneBPRAssetsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError21, scenarioTemps.getClientTwoBPRAssetsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError22, scenarioTemps.getClientOneNonBPRAssetsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError22, scenarioTemps.getClientTwoNonBPRAssetsAnalysis());
            DataVerification.checkLettersOnlyString(varcharError23, scenarioTemps.getClientOneNatureOfInvestmentsAnalysis());
            DataVerification.checkLettersOnlyString(varcharError23, scenarioTemps.getClientTwoNatureOfInvestmentsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError24, scenarioTemps.getClientOneInvestmentsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError24, scenarioTemps.getClientTwoInvestmentsAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError25, scenarioTemps.getClientOneSavingsAndCashAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError25, scenarioTemps.getClientTwoSavingsAndCashAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError26, scenarioTemps.getClientOneLifeCoverAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError26, scenarioTemps.getClientTwoLifeCoverAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError28, scenarioTemps.getClientOnePensionSIPPAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError28, scenarioTemps.getClientTwoPensionSIPPAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError30, scenarioTemps.getClientOneDeathServiceAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError30, scenarioTemps.getClientTwoDeathServiceAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError33, scenarioTemps.getClientOneInheritanceValueAnalysis());
            DataVerification.checkNumbersOnlyString(varcharError33, scenarioTemps.getClientTwoInheritanceValueAnalysis());

            // WIP if logged in allow database update and "email to jjep" otherwise only display report with disclaimer than it is only a sample
            System.out.println("************** Scenario Report **************\n\n"+ "Life cover: " + printLifeCoverReport(scenarioTemps.getClientOneMaritalStatus()));
            System.out.println("\nPersonal pension: " + printPensionReport(scenarioTemps.getClientOneMaritalStatus()));
            System.out.println("\nDeath in service: " + printDeathInServiceReport(scenarioTemps.getClientOneMaritalStatus()));
            if (user.getUserLoggedInStatus() == false) {
                System.out.println("Please create an account with us and for a small administration fee we can process and save your scenario, and get in touch");
            }
            // else save to scenario database table
        }
    }

    private void errorLabelCheckVarchar(Label label, int maxChar, String userData) {
        if (!DataVerification.checkSQLVarcharLimit(maxChar, userData)) {
            label.setText("Maximum characters allowed: " + maxChar);
            label.setStyle("-fx-text-fill: red;");
        } else {
            label.setText("");
        }
    }

    public void onClearButtonClick(){

        Age_analysis.setText("");
        Custom_aims_analysis.setText("");
        Primary_property_analysis.setText("");
        primary_mortgage_analysis.setText("");
        primary_mortgage_years_analysis.setText("");
        Uk_holiday_property_analysis.setText("");
        holiday_mortgage_analysis.setText("");
        holiday_mortgage_years_analysis.setText("");
        BTL_property_analysis.setText("");
        BTL_mortgage_analysis.setText("");
        BTL_mortgage_years_analysis.setText("");
        overseas_property_analysis.setText("");
        overseas_mortgage_analysis.setText("");
        overseas_mortgage_years_analysis.setText("");
        BPR_assets_analysis.setText("");
        Non_BPR_assets_analysis.setText("");
        Nature_of_investments_analysis.setText("");
        investments_analysis.setText("");
        savings_and_cash_analysis.setText("");
        life_cover_analysis.setText("");
        pension_SIPP_analysis.setText("");
        death_service_analysis.setText("");
        inheritance_value_analysis.setText("");
        first_name_analysis.setText("");
        surname_analysis.setText("");

    }

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

    // Form needs to deactivate or re-activate certain fields depending on joint or non-joint related ---- https://stackoverflow.com/questions/50242899/javafx-disable-all-buttons-from-a-togglegroup
    public void deactivateNonJointFields(boolean bool) {
        first_name_analysis.setDisable(bool);
        surname_analysis.setDisable(bool);
        marital_status_analysis.setDisable(bool);
        Age_analysis.setDisable(bool);
        pension_SIPP_analysis.setDisable(bool);
        death_service_analysis.setDisable(bool);
        Group1.getToggles().forEach(toggle -> {
            Node node = (Node) toggle ;
            node.setDisable(bool);
        });
        Group2.getToggles().forEach(toggle -> {
            Node node = (Node) toggle ;
            node.setDisable(bool);
        });
        Group3.getToggles().forEach(toggle -> {
            Node node = (Node) toggle ;
            node.setDisable(bool);
        });
        Group4.getToggles().forEach(toggle -> {
            Node node = (Node) toggle ;
            node.setDisable(bool);
        });
        Group7.getToggles().forEach(toggle -> {
            Node node = (Node) toggle ;
            node.setDisable(bool);
        });
        Group8.getToggles().forEach(toggle -> {
            Node node = (Node) toggle ;
            node.setDisable(bool);
        });
        Group9.getToggles().forEach(toggle -> {
            Node node = (Node) toggle ;
            node.setDisable(bool);
        });

    }

    // Methods that check different fields depending on marital status to know which are relevant. Scenario form reports
    public String printLifeCoverReport(String maritalStatus) {
        if (!maritalStatus.equals("Single")) {
            if (scenarioTemps.getClientJointlifeCoverInTrustbool() != null) {
                if (Integer.parseInt(scenarioTemps.getJointLifeCoverAnalysis()) != 0 && scenarioTemps.getClientJointlifeCoverInTrustbool().equals("No")) {
                    return "You have told us that you both have £" + Integer.parseInt(scenarioTemps.getJointLifeCoverAnalysis()) + " in joint life cover that may not be directed into trust. On death, this may fall into your estate, increasing its value by this amount. This needs to be investigated";
                } else {
                    return "No obvious life cover issues for" + scenarioTemps.getClientOneFirstNameAnalysis();
                }
            } else if (scenarioTemps.getClientTwolifeCoverInTrustbool() != null) {
                if (Integer.parseInt(scenarioTemps.getClientTwoLifeCoverAnalysis()) != 0 && scenarioTemps.getClientTwolifeCoverInTrustbool().equals("No")) {
                    return "You have told us that your partner has £" + Integer.parseInt(scenarioTemps.getClientTwoLifeCoverAnalysis()) + " in personal life cover that may not be directed into trust. On death, this may fall into your beneficiaries' estate, increasing its value by this amount. This needs to be investigated";
                } else {
                    return "No obvious life cover issues for" + scenarioTemps.getClientTwoFirstNameAnalysis();
                }
            } else if (scenarioTemps.getClientOnelifeCoverInTrustbool() != null) {
                if (Integer.parseInt(scenarioTemps.getClientOneLifeCoverAnalysis()) != 0 && scenarioTemps.getClientOnelifeCoverInTrustbool().equals("No")) {
                    return "You have told us that your partner has £" + Integer.parseInt(scenarioTemps.getClientOneLifeCoverAnalysis()) + " in personal life cover that may not be directed into trust. On death, this may fall into your beneficiaries' estate, increasing its value by this amount. This needs to be investigated";
                } else {
                    return "No obvious life cover issues for" + scenarioTemps.getClientOneFirstNameAnalysis();
                }
            } else {
                return "Nothing to report";
            }
        } else {
            if (scenarioTemps.getClientOnelifeCoverInTrustbool() != null) {
                if (Integer.parseInt(scenarioTemps.getClientOneLifeCoverAnalysis()) != 0 && scenarioTemps.getClientOnelifeCoverInTrustbool().equals("No")) {
                    return "You have told us that your partner has £" + Integer.parseInt(scenarioTemps.getClientOneLifeCoverAnalysis()) + " in personal life cover that may not be directed into trust. On death, this may fall into your beneficiaries' estate, increasing its value by this amount. This needs to be investigated";
                } else {
                    return "No obvious life cover issues for" + scenarioTemps.getClientOneFirstNameAnalysis();
                }
            } else {
                return "Nothing to report";
            }
        }
    }

    public String printPensionReport(String maritalStatus) {
        if (!maritalStatus.equals("Single")) {
            if (scenarioTemps.getClientTwoDeathBenefitToTrustbool() != null) {
                if (Integer.parseInt(scenarioTemps.getClientTwoPensionSIPPAnalysis()) != 0 && scenarioTemps.getClientTwoDeathBenefitToTrustbool().equals("No")) {
                    return "You have told us that your partner has £" + Integer.parseInt(scenarioTemps.getClientTwoPensionSIPPAnalysis()) + " in personal pensions that may not be directed into trust. On death, this may fall into your beneficiaries' estate, increasing its value by this amount. This needs to be investigated";
                } else {
                    return "No obvious life cover issues for" + scenarioTemps.getClientTwoFirstNameAnalysis();
                }
            } else if (scenarioTemps.getClientOneDeathBenefitToTrustbool() != null) {
                if (Integer.parseInt(scenarioTemps.getClientOnePensionSIPPAnalysis()) != 0 && scenarioTemps.getClientOneDeathBenefitToTrustbool().equals("No")) {
                    return "You have told us that your partner has £" + Integer.parseInt(scenarioTemps.getClientOneLifeCoverAnalysis()) + " in personal pensions that may not be directed into trust. On death, this may fall into your beneficiaries' estate, increasing its value by this amount. This needs to be investigated";
                } else {
                    return "No obvious life cover issues for" + scenarioTemps.getClientOneFirstNameAnalysis();
                }
            } else {
                return "Nothing to report";
            }
        } else {
            if (scenarioTemps.getClientOneDeathBenefitToTrustbool() != null) {
                if (Integer.parseInt(scenarioTemps.getClientOnePensionSIPPAnalysis()) != 0 && scenarioTemps.getClientOneDeathBenefitToTrustbool().equals("No")) {
                    return "You have told us that your partner has £" + Integer.parseInt(scenarioTemps.getClientOneLifeCoverAnalysis()) + " in personal pensions that may not be directed into trust. On death, this may fall into your beneficiaries' estate, increasing its value by this amount. This needs to be investigated";
                } else {
                    return "No obvious life cover issues for" + scenarioTemps.getClientOneFirstNameAnalysis();
                }
            } else {
                return "Nothing to report";
            }
        }
    }

    public String printDeathInServiceReport(String maritalStatus) {
        if (!maritalStatus.equals("Single")) {
            if (scenarioTemps.getClientTwodeathInServiceToTrustbool() != null) {
                if (Integer.parseInt(scenarioTemps.getClientTwoDeathServiceAnalysis()) != 0 && scenarioTemps.getClientTwodeathInServiceToTrustbool().equals("No")) {
                    return "You have told us that your partner has £" + Integer.parseInt(scenarioTemps.getClientTwoDeathServiceAnalysis()) + " in personal pensions that may not be directed into trust. On death, this may fall into your beneficiaries' estate, increasing its value by this amount. This needs to be investigated";
                } else {
                    return "No obvious life cover issues for" + scenarioTemps.getClientTwoFirstNameAnalysis();
                }
            } else if (scenarioTemps.getClientOnedeathInServiceToTrustbool() != null) {
                if (Integer.parseInt(scenarioTemps.getClientOneDeathServiceAnalysis()) != 0 && scenarioTemps.getClientOnedeathInServiceToTrustbool().equals("No")) {
                    return "You have told us that your partner has £" + Integer.parseInt(scenarioTemps.getClientOneDeathServiceAnalysis()) + " in personal pensions that may not be directed into trust. On death, this may fall into your beneficiaries' estate, increasing its value by this amount. This needs to be investigated";
                } else {
                    return "No obvious life cover issues for" + scenarioTemps.getClientOneFirstNameAnalysis();
                }
            } else {
                return "Nothing to report";
            }
        } else {
            if (scenarioTemps.getClientOnedeathInServiceToTrustbool() != null) {
                if (Integer.parseInt(scenarioTemps.getClientOneDeathServiceAnalysis()) != 0 && scenarioTemps.getClientOnedeathInServiceToTrustbool().equals("No")) {
                    return "You have told us that your partner has £" + Integer.parseInt(scenarioTemps.getClientOneDeathServiceAnalysis()) + " in personal pensions that may not be directed into trust. On death, this may fall into your beneficiaries' estate, increasing its value by this amount. This needs to be investigated";
                } else {
                    return "No obvious life cover issues for" + scenarioTemps.getClientOneFirstNameAnalysis();
                }
            } else {
                return "Nothing to report";
            }
        }
    }


}
