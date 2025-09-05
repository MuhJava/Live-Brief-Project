package com.example.sdk11element010;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;

// Class for storing temporary values for fast access and re-loading form data so user does not need to fill out everything again if necessary
public class ScenarioTemps {

    private static ScenarioTemps single_instance = null;

    public ScenarioTemps() {}

    // Single instance for current use of scenario creator to ensure consistent data
    public static synchronized ScenarioTemps getInstance() {
        if (single_instance == null) {
            single_instance = new ScenarioTemps();
        }
        return single_instance;
    }

    // Setters and getters for current scenario data, this is the whole class
    public String getClientOneAgeAnalysis() {
        return clientOneAgeAnalysis;
    }

    public void setClientOneAgeAnalysis(String clientOneAgeAnalysis) {
        this.clientOneAgeAnalysis = clientOneAgeAnalysis;
    }

    public String getClientOneCustomAimsAnalysis() {
        return clientOneCustomAimsAnalysis;
    }

    public void setClientOneCustomAimsAnalysis(String clientOneCustomAimsAnalysis) {
        this.clientOneCustomAimsAnalysis = clientOneCustomAimsAnalysis;
    }

    public String getClientOnePrimaryPropertyAnalysis() {
        return clientOnePrimaryPropertyAnalysis;
    }

    public void setClientOnePrimaryPropertyAnalysis(String clientOnePrimaryPropertyAnalysis) {
        this.clientOnePrimaryPropertyAnalysis = clientOnePrimaryPropertyAnalysis;
    }

    public String getClientOnePrimaryMortgageAnalysis() {
        return clientOnePrimaryMortgageAnalysis;
    }

    public void setClientOnePrimaryMortgageAnalysis(String clientOnePrimaryMortgageAnalysis) {
        this.clientOnePrimaryMortgageAnalysis = clientOnePrimaryMortgageAnalysis;
    }

    public String getClientOnePrimaryMortgageYearsAnalysis() {
        return clientOnePrimaryMortgageYearsAnalysis;
    }

    public void setClientOnePrimaryMortgageYearsAnalysis(String clientOnePrimaryMortgageYearsAnalysis) {
        this.clientOnePrimaryMortgageYearsAnalysis = clientOnePrimaryMortgageYearsAnalysis;
    }

    public String getClientOneUkHolidayPropertyAnalysis() {
        return clientOneUkHolidayPropertyAnalysis;
    }

    public void setClientOneUkHolidayPropertyAnalysis(String clientOneUkHolidayPropertyAnalysis) {
        this.clientOneUkHolidayPropertyAnalysis = clientOneUkHolidayPropertyAnalysis;
    }

    public String getClientOneHolidayMortgageAnalysis() {
        return clientOneHolidayMortgageAnalysis;
    }

    public void setClientOneHolidayMortgageAnalysis(String clientOneHolidayMortgageAnalysis) {
        this.clientOneHolidayMortgageAnalysis = clientOneHolidayMortgageAnalysis;
    }

    public String getClientOneHolidayMortgageYearsAnalysis() {
        return clientOneHolidayMortgageYearsAnalysis;
    }

    public void setClientOneHolidayMortgageYearsAnalysis(String clientOneHolidayMortgageYearsAnalysis) {
        this.clientOneHolidayMortgageYearsAnalysis = clientOneHolidayMortgageYearsAnalysis;
    }

    public String getClientOneBTLPropertyAnalysis() {
        return clientOneBTLPropertyAnalysis;
    }

    public void setClientOneBTLPropertyAnalysis(String clientOneBTLPropertyAnalysis) {
        this.clientOneBTLPropertyAnalysis = clientOneBTLPropertyAnalysis;
    }

    public String getClientOneBTLMortgageAnalysis() {
        return clientOneBTLMortgageAnalysis;
    }

    public void setClientOneBTLMortgageAnalysis(String clientOneBTLMortgageAnalysis) {
        this.clientOneBTLMortgageAnalysis = clientOneBTLMortgageAnalysis;
    }

    public String getClientOneBTLMortgageYearsAnalysis() {
        return clientOneBTLMortgageYearsAnalysis;
    }

    public void setClientOneBTLMortgageYearsAnalysis(String clientOneBTLMortgageYearsAnalysis) {
        this.clientOneBTLMortgageYearsAnalysis = clientOneBTLMortgageYearsAnalysis;
    }

    public String getClientOneOverseasPropertyAnalysis() {
        return clientOneOverseasPropertyAnalysis;
    }

    public void setClientOneOverseasPropertyAnalysis(String clientOneOverseasPropertyAnalysis) {
        this.clientOneOverseasPropertyAnalysis = clientOneOverseasPropertyAnalysis;
    }

    public String getClientOneOverseasMortgageAnalysis() {
        return clientOneOverseasMortgageAnalysis;
    }

    public void setClientOneOverseasMortgageAnalysis(String clientOneOverseasMortgageAnalysis) {
        this.clientOneOverseasMortgageAnalysis = clientOneOverseasMortgageAnalysis;
    }

    public String getClientOneOverseasMortgageYearsAnalysis() {
        return clientOneOverseasMortgageYearsAnalysis;
    }

    public void setClientOneOverseasMortgageYearsAnalysis(String clientOneOverseasMortgageYearsAnalysis) {
        this.clientOneOverseasMortgageYearsAnalysis = clientOneOverseasMortgageYearsAnalysis;
    }

    public String getClientOneBPRAssetsAnalysis() {
        return clientOneBPRAssetsAnalysis;
    }

    public void setClientOneBPRAssetsAnalysis(String clientOneBPRAssetsAnalysis) {
        this.clientOneBPRAssetsAnalysis = clientOneBPRAssetsAnalysis;
    }

    public String getClientOneNonBPRAssetsAnalysis() {
        return clientOneNonBPRAssetsAnalysis;
    }

    public void setClientOneNonBPRAssetsAnalysis(String clientOneNonBPRAssetsAnalysis) {
        this.clientOneNonBPRAssetsAnalysis = clientOneNonBPRAssetsAnalysis;
    }

    public String getClientOneNatureOfInvestmentsAnalysis() {
        return clientOneNatureOfInvestmentsAnalysis;
    }

    public void setClientOneNatureOfInvestmentsAnalysis(String clientOneNatureOfInvestmentsAnalysis) {
        this.clientOneNatureOfInvestmentsAnalysis = clientOneNatureOfInvestmentsAnalysis;
    }

    public String getClientOneInvestmentsAnalysis() {
        return clientOneInvestmentsAnalysis;
    }

    public void setClientOneInvestmentsAnalysis(String clientOneInvestmentsAnalysis) {
        this.clientOneInvestmentsAnalysis = clientOneInvestmentsAnalysis;
    }

    public String getClientOneSavingsAndCashAnalysis() {
        return clientOneSavingsAndCashAnalysis;
    }

    public void setClientOneSavingsAndCashAnalysis(String clientOneSavingsAndCashAnalysis) {
        this.clientOneSavingsAndCashAnalysis = clientOneSavingsAndCashAnalysis;
    }

    public String getClientOneLifeCoverAnalysis() {
        return clientOneLifeCoverAnalysis;
    }

    public void setClientOneLifeCoverAnalysis(String clientOneLifeCoverAnalysis) {
        this.clientOneLifeCoverAnalysis = clientOneLifeCoverAnalysis;
    }

    public String getClientOnePensionSIPPAnalysis() {
        return clientOnePensionSIPPAnalysis;
    }

    public void setClientOnePensionSIPPAnalysis(String clientOnePensionSIPPAnalysis) {
        this.clientOnePensionSIPPAnalysis = clientOnePensionSIPPAnalysis;
    }

    public String getClientOneDeathServiceAnalysis() {
        return clientOneDeathServiceAnalysis;
    }

    public void setClientOneDeathServiceAnalysis(String clientOneDeathServiceAnalysis) {
        this.clientOneDeathServiceAnalysis = clientOneDeathServiceAnalysis;
    }

    public String getClientOneInheritanceValueAnalysis() {
        return clientOneInheritanceValueAnalysis;
    }

    public void setClientOneInheritanceValueAnalysis(String clientOneInheritanceValueAnalysis) {
        this.clientOneInheritanceValueAnalysis = clientOneInheritanceValueAnalysis;
    }

    public String getClientOneFirstNameAnalysis() {
        return clientOneFirstNameAnalysis;
    }

    public void setClientOneFirstNameAnalysis(String clientOneFirstNameAnalysis) {
        this.clientOneFirstNameAnalysis = clientOneFirstNameAnalysis;
    }

    public String getClientOneSurnameAnalysis() {
        return clientOneSurnameAnalysis;
    }

    public void setClientOneSurnameAnalysis(String clientOneSurnameAnalysis) {
        this.clientOneSurnameAnalysis = clientOneSurnameAnalysis;
    }

    public String getClientTwoAgeAnalysis() {
        return clientTwoAgeAnalysis;
    }

    public void setClientTwoAgeAnalysis(String clientTwoAgeAnalysis) {
        this.clientTwoAgeAnalysis = clientTwoAgeAnalysis;
    }

    public String getClientTwoCustomAimsAnalysis() {
        return clientTwoCustomAimsAnalysis;
    }

    public void setClientTwoCustomAimsAnalysis(String clientTwoCustomAimsAnalysis) {
        this.clientTwoCustomAimsAnalysis = clientTwoCustomAimsAnalysis;
    }

    public String getClientTwoPrimaryPropertyAnalysis() {
        return clientTwoPrimaryPropertyAnalysis;
    }

    public void setClientTwoPrimaryPropertyAnalysis(String clientTwoPrimaryPropertyAnalysis) {
        this.clientTwoPrimaryPropertyAnalysis = clientTwoPrimaryPropertyAnalysis;
    }

    public String getClientTwoPrimaryMortgageAnalysis() {
        return clientTwoPrimaryMortgageAnalysis;
    }

    public void setClientTwoPrimaryMortgageAnalysis(String clientTwoPrimaryMortgageAnalysis) {
        this.clientTwoPrimaryMortgageAnalysis = clientTwoPrimaryMortgageAnalysis;
    }

    public String getClientTwoPrimaryMortgageYearsAnalysis() {
        return clientTwoPrimaryMortgageYearsAnalysis;
    }

    public void setClientTwoPrimaryMortgageYearsAnalysis(String clientTwoPrimaryMortgageYearsAnalysis) {
        this.clientTwoPrimaryMortgageYearsAnalysis = clientTwoPrimaryMortgageYearsAnalysis;
    }

    public String getClientTwoUkHolidayPropertyAnalysis() {
        return clientTwoUkHolidayPropertyAnalysis;
    }

    public void setClientTwoUkHolidayPropertyAnalysis(String clientTwoUkHolidayPropertyAnalysis) {
        this.clientTwoUkHolidayPropertyAnalysis = clientTwoUkHolidayPropertyAnalysis;
    }

    public String getClientTwoHolidayMortgageAnalysis() {
        return clientTwoHolidayMortgageAnalysis;
    }

    public void setClientTwoHolidayMortgageAnalysis(String clientTwoHolidayMortgageAnalysis) {
        this.clientTwoHolidayMortgageAnalysis = clientTwoHolidayMortgageAnalysis;
    }

    public String getClientTwoHolidayMortgageYearsAnalysis() {
        return clientTwoHolidayMortgageYearsAnalysis;
    }

    public void setClientTwoHolidayMortgageYearsAnalysis(String clientTwoHolidayMortgageYearsAnalysis) {
        this.clientTwoHolidayMortgageYearsAnalysis = clientTwoHolidayMortgageYearsAnalysis;
    }

    public String getClientTwoBTLPropertyAnalysis() {
        return clientTwoBTLPropertyAnalysis;
    }

    public void setClientTwoBTLPropertyAnalysis(String clientTwoBTLPropertyAnalysis) {
        this.clientTwoBTLPropertyAnalysis = clientTwoBTLPropertyAnalysis;
    }

    public String getClientTwoBTLMortgageAnalysis() {
        return clientTwoBTLMortgageAnalysis;
    }

    public void setClientTwoBTLMortgageAnalysis(String clientTwoBTLMortgageAnalysis) {
        this.clientTwoBTLMortgageAnalysis = clientTwoBTLMortgageAnalysis;
    }

    public String getClientTwoBTLMortgageYearsAnalysis() {
        return clientTwoBTLMortgageYearsAnalysis;
    }

    public void setClientTwoBTLMortgageYearsAnalysis(String clientTwoBTLMortgageYearsAnalysis) {
        this.clientTwoBTLMortgageYearsAnalysis = clientTwoBTLMortgageYearsAnalysis;
    }

    public String getClientTwoOverseasPropertyAnalysis() {
        return clientTwoOverseasPropertyAnalysis;
    }

    public void setClientTwoOverseasPropertyAnalysis(String clientTwoOverseasPropertyAnalysis) {
        this.clientTwoOverseasPropertyAnalysis = clientTwoOverseasPropertyAnalysis;
    }

    public String getClientTwoOverseasMortgageAnalysis() {
        return clientTwoOverseasMortgageAnalysis;
    }

    public void setClientTwoOverseasMortgageAnalysis(String clientTwoOverseasMortgageAnalysis) {
        this.clientTwoOverseasMortgageAnalysis = clientTwoOverseasMortgageAnalysis;
    }

    public String getClientTwoOverseasMortgageYearsAnalysis() {
        return clientTwoOverseasMortgageYearsAnalysis;
    }

    public void setClientTwoOverseasMortgageYearsAnalysis(String clientTwoOverseasMortgageYearsAnalysis) {
        this.clientTwoOverseasMortgageYearsAnalysis = clientTwoOverseasMortgageYearsAnalysis;
    }

    public String getClientTwoBPRAssetsAnalysis() {
        return clientTwoBPRAssetsAnalysis;
    }

    public void setClientTwoBPRAssetsAnalysis(String clientTwoBPRAssetsAnalysis) {
        this.clientTwoBPRAssetsAnalysis = clientTwoBPRAssetsAnalysis;
    }

    public String getClientTwoNonBPRAssetsAnalysis() {
        return clientTwoNonBPRAssetsAnalysis;
    }

    public void setClientTwoNonBPRAssetsAnalysis(String clientTwoNonBPRAssetsAnalysis) {
        this.clientTwoNonBPRAssetsAnalysis = clientTwoNonBPRAssetsAnalysis;
    }

    public String getClientTwoNatureOfInvestmentsAnalysis() {
        return clientTwoNatureOfInvestmentsAnalysis;
    }

    public void setClientTwoNatureOfInvestmentsAnalysis(String clientTwoNatureOfInvestmentsAnalysis) {
        this.clientTwoNatureOfInvestmentsAnalysis = clientTwoNatureOfInvestmentsAnalysis;
    }

    public String getClientTwoInvestmentsAnalysis() {
        return clientTwoInvestmentsAnalysis;
    }

    public void setClientTwoInvestmentsAnalysis(String clientTwoInvestmentsAnalysis) {
        this.clientTwoInvestmentsAnalysis = clientTwoInvestmentsAnalysis;
    }

    public String getClientTwoSavingsAndCashAnalysis() {
        return clientTwoSavingsAndCashAnalysis;
    }

    public void setClientTwoSavingsAndCashAnalysis(String clientTwoSavingsAndCashAnalysis) {
        this.clientTwoSavingsAndCashAnalysis = clientTwoSavingsAndCashAnalysis;
    }

    public String getClientTwoLifeCoverAnalysis() {
        return clientTwoLifeCoverAnalysis;
    }

    public void setClientTwoLifeCoverAnalysis(String clientTwoLifeCoverAnalysis) {
        this.clientTwoLifeCoverAnalysis = clientTwoLifeCoverAnalysis;
    }

    public String getClientTwoPensionSIPPAnalysis() {
        return clientTwoPensionSIPPAnalysis;
    }

    public void setClientTwoPensionSIPPAnalysis(String clientTwoPensionSIPPAnalysis) {
        this.clientTwoPensionSIPPAnalysis = clientTwoPensionSIPPAnalysis;
    }

    public String getClientTwoDeathServiceAnalysis() {
        return clientTwoDeathServiceAnalysis;
    }

    public void setClientTwoDeathServiceAnalysis(String clientTwoDeathServiceAnalysis) {
        this.clientTwoDeathServiceAnalysis = clientTwoDeathServiceAnalysis;
    }

    public String getClientTwoInheritanceValueAnalysis() {
        return clientTwoInheritanceValueAnalysis;
    }

    public void setClientTwoInheritanceValueAnalysis(String clientTwoInheritanceValueAnalysis) {
        this.clientTwoInheritanceValueAnalysis = clientTwoInheritanceValueAnalysis;
    }

    public String getClientTwoFirstNameAnalysis() {
        return clientTwoFirstNameAnalysis;
    }

    public void setClientTwoFirstNameAnalysis(String clientTwoFirstNameAnalysis) {
        this.clientTwoFirstNameAnalysis = clientTwoFirstNameAnalysis;
    }

    public String getClientTwoSurnameAnalysis() {
        return clientTwoSurnameAnalysis;
    }

    public void setClientTwoSurnameAnalysis(String clientTwoSurnameAnalysis) {
        this.clientTwoSurnameAnalysis = clientTwoSurnameAnalysis;
    }

    public String getClientOneMaritalStatus() {
        return clientOneMaritalStatus;
    }

    public void setClientOneMaritalStatus(String clientOneMaritalStatus) {
        this.clientOneMaritalStatus = clientOneMaritalStatus;
    }

    public String getClientTwoMaritalStatus() {
        return clientTwoMaritalStatus;
    }

    public void setClientTwoMaritalStatus(String clientTwoMaritalStatus) {
        this.clientTwoMaritalStatus = clientTwoMaritalStatus;
    }

    private String clientOneMaritalStatus;
    private String clientTwoMaritalStatus;
    private String clientOneAgeAnalysis;
private String clientOneCustomAimsAnalysis;
private String clientOnePrimaryPropertyAnalysis;
private String clientOnePrimaryMortgageAnalysis;
private String clientOnePrimaryMortgageYearsAnalysis;
private String clientOneUkHolidayPropertyAnalysis;
private String clientOneHolidayMortgageAnalysis;
private String clientOneHolidayMortgageYearsAnalysis;
private String clientOneBTLPropertyAnalysis;
private String clientOneBTLMortgageAnalysis;
private String clientOneBTLMortgageYearsAnalysis;
private String clientOneOverseasPropertyAnalysis;
private String clientOneOverseasMortgageAnalysis;
private String clientOneOverseasMortgageYearsAnalysis;
private String clientOneBPRAssetsAnalysis;
private String clientOneNonBPRAssetsAnalysis;
private String clientOneNatureOfInvestmentsAnalysis;
private String clientOneInvestmentsAnalysis;
private String clientOneSavingsAndCashAnalysis;
private String clientOneLifeCoverAnalysis;
private String clientOnePensionSIPPAnalysis;
private String clientOneDeathServiceAnalysis;
private String clientOneInheritanceValueAnalysis;
private String clientOneFirstNameAnalysis;
private String clientOneSurnameAnalysis;



    private String clientTwoAgeAnalysis;
    private String clientTwoCustomAimsAnalysis;
    private String clientTwoPrimaryPropertyAnalysis;
    private String clientTwoPrimaryMortgageAnalysis;
    private String clientTwoPrimaryMortgageYearsAnalysis;
    private String clientTwoUkHolidayPropertyAnalysis;
    private String clientTwoHolidayMortgageAnalysis;
    private String clientTwoHolidayMortgageYearsAnalysis;
    private String clientTwoBTLPropertyAnalysis;
    private String clientTwoBTLMortgageAnalysis;
    private String clientTwoBTLMortgageYearsAnalysis;
    private String clientTwoOverseasPropertyAnalysis;
    private String clientTwoOverseasMortgageAnalysis;
    private String clientTwoOverseasMortgageYearsAnalysis;
    private String clientTwoBPRAssetsAnalysis;
    private String clientTwoNonBPRAssetsAnalysis;
    private String clientTwoNatureOfInvestmentsAnalysis;
    private String clientTwoInvestmentsAnalysis;
    private String clientTwoSavingsAndCashAnalysis;
    private String clientTwoLifeCoverAnalysis;
    private String clientTwoPensionSIPPAnalysis;
    private String clientTwoDeathServiceAnalysis;
    private String clientTwoInheritanceValueAnalysis;
    private String clientTwoFirstNameAnalysis;
    private String clientTwoSurnameAnalysis;

    public String getJointPrimaryPropertyAnalysis() {
        return jointPrimaryPropertyAnalysis;
    }

    public void setJointPrimaryPropertyAnalysis(String jointPrimaryPropertyAnalysis) {
        this.jointPrimaryPropertyAnalysis = jointPrimaryPropertyAnalysis;
    }

    public String getJointPrimaryMortgageAnalysis() {
        return jointPrimaryMortgageAnalysis;
    }

    public void setJointPrimaryMortgageAnalysis(String jointPrimaryMortgageAnalysis) {
        this.jointPrimaryMortgageAnalysis = jointPrimaryMortgageAnalysis;
    }

    public String getJointPrimaryMortgageYearsAnalysis() {
        return jointPrimaryMortgageYearsAnalysis;
    }

    public void setJointPrimaryMortgageYearsAnalysis(String jointPrimaryMortgageYearsAnalysis) {
        this.jointPrimaryMortgageYearsAnalysis = jointPrimaryMortgageYearsAnalysis;
    }

    public String getJointUkHolidayPropertyAnalysis() {
        return jointUkHolidayPropertyAnalysis;
    }

    public void setJointUkHolidayPropertyAnalysis(String jointUkHolidayPropertyAnalysis) {
        this.jointUkHolidayPropertyAnalysis = jointUkHolidayPropertyAnalysis;
    }

    public String getJointHolidayMortgageAnalysis() {
        return jointHolidayMortgageAnalysis;
    }

    public void setJointHolidayMortgageAnalysis(String jointHolidayMortgageAnalysis) {
        this.jointHolidayMortgageAnalysis = jointHolidayMortgageAnalysis;
    }

    public String getJointHolidayMortgageYearsAnalysis() {
        return jointHolidayMortgageYearsAnalysis;
    }

    public void setJointHolidayMortgageYearsAnalysis(String jointHolidayMortgageYearsAnalysis) {
        this.jointHolidayMortgageYearsAnalysis = jointHolidayMortgageYearsAnalysis;
    }

    public String getJointBTLPropertyAnalysis() {
        return jointBTLPropertyAnalysis;
    }

    public void setJointBTLPropertyAnalysis(String jointBTLPropertyAnalysis) {
        this.jointBTLPropertyAnalysis = jointBTLPropertyAnalysis;
    }

    public String getJointBTLMortgageAnalysis() {
        return jointBTLMortgageAnalysis;
    }

    public void setJointBTLMortgageAnalysis(String jointBTLMortgageAnalysis) {
        this.jointBTLMortgageAnalysis = jointBTLMortgageAnalysis;
    }

    public String getJointBTLMortgageYearsAnalysis() {
        return jointBTLMortgageYearsAnalysis;
    }

    public void setJointBTLMortgageYearsAnalysis(String jointBTLMortgageYearsAnalysis) {
        this.jointBTLMortgageYearsAnalysis = jointBTLMortgageYearsAnalysis;
    }

    public String getJointOverseasPropertyAnalysis() {
        return jointOverseasPropertyAnalysis;
    }

    public void setJointOverseasPropertyAnalysis(String jointOverseasPropertyAnalysis) {
        this.jointOverseasPropertyAnalysis = jointOverseasPropertyAnalysis;
    }

    public String getJointOverseasMortgageAnalysis() {
        return jointOverseasMortgageAnalysis;
    }

    public void setJointOverseasMortgageAnalysis(String jointOverseasMortgageAnalysis) {
        this.jointOverseasMortgageAnalysis = jointOverseasMortgageAnalysis;
    }

    public String getJointOverseasMortgageYearsAnalysis() {
        return jointOverseasMortgageYearsAnalysis;
    }

    public void setJointOverseasMortgageYearsAnalysis(String jointOverseasMortgageYearsAnalysis) {
        this.jointOverseasMortgageYearsAnalysis = jointOverseasMortgageYearsAnalysis;
    }

    public String getJointBPRAssetsAnalysis() {
        return jointBPRAssetsAnalysis;
    }

    public void setJointBPRAssetsAnalysis(String jointBPRAssetsAnalysis) {
        this.jointBPRAssetsAnalysis = jointBPRAssetsAnalysis;
    }

    public String getJointNonBPRAssetsAnalysis() {
        return jointNonBPRAssetsAnalysis;
    }

    public void setJointNonBPRAssetsAnalysis(String jointNonBPRAssetsAnalysis) {
        this.jointNonBPRAssetsAnalysis = jointNonBPRAssetsAnalysis;
    }

    public String getJointNatureOfInvestmentsAnalysis() {
        return jointNatureOfInvestmentsAnalysis;
    }

    public void setJointNatureOfInvestmentsAnalysis(String jointNatureOfInvestmentsAnalysis) {
        this.jointNatureOfInvestmentsAnalysis = jointNatureOfInvestmentsAnalysis;
    }

    public String getJointInvestmentsAnalysis() {
        return jointInvestmentsAnalysis;
    }

    public void setJointInvestmentsAnalysis(String jointInvestmentsAnalysis) {
        this.jointInvestmentsAnalysis = jointInvestmentsAnalysis;
    }

    public String getJointSavingsAndCashAnalysis() {
        return jointSavingsAndCashAnalysis;
    }

    public void setJointSavingsAndCashAnalysis(String jointSavingsAndCashAnalysis) {
        this.jointSavingsAndCashAnalysis = jointSavingsAndCashAnalysis;
    }

    public String getJointLifeCoverAnalysis() {
        return jointLifeCoverAnalysis;
    }

    public void setJointLifeCoverAnalysis(String jointLifeCoverAnalysis) {
        this.jointLifeCoverAnalysis = jointLifeCoverAnalysis;
    }

    private String jointPrimaryPropertyAnalysis;
    private String jointPrimaryMortgageAnalysis;
    private String jointPrimaryMortgageYearsAnalysis;
    private String jointUkHolidayPropertyAnalysis;
    private String jointHolidayMortgageAnalysis;
    private String jointHolidayMortgageYearsAnalysis;
    private String jointBTLPropertyAnalysis;
    private String jointBTLMortgageAnalysis;
    private String jointBTLMortgageYearsAnalysis;
    private String jointOverseasPropertyAnalysis;
    private String jointOverseasMortgageAnalysis;
    private String jointOverseasMortgageYearsAnalysis;
    private String jointBPRAssetsAnalysis;
    private String jointNonBPRAssetsAnalysis;
    private String jointNatureOfInvestmentsAnalysis;
    private String jointInvestmentsAnalysis;
    private String jointSavingsAndCashAnalysis;
    private String jointLifeCoverAnalysis;

    private String clientOneUKIHTbool;
    private String clientOneNRBbool;
    private String clientOneLPAbool;
    private String clientOneBLPbool;
    private String clientOneforeignWillbool;
    private String clientOnelifeCoverInTrustbool;
    private String clientOneDeathBenefitToTrustbool;
    private String clientOnedeathInServiceToTrustbool;
    private String clientOneExpectingInheritancebool;

    private String clientTwoUKIHTbool;
    private String clientTwoNRBbool;
    private String clientTwoLPAbool;
    private String clientTwoBLPbool;
    private String clientTwoforeignWillbool;
    private String clientTwolifeCoverInTrustbool;
    private String clientTwoDeathBenefitToTrustbool;
    private String clientTwodeathInServiceToTrustbool;
    private String clientTwoExpectingInheritancebool;
    private String clientJointforeignWillbool;
    private String clientJointlifeCoverInTrustbool;

    public String getClientOneUKIHTbool() {
        return clientOneUKIHTbool;
    }

    public void setClientOneUKIHTbool(String clientOneUKIHTbool) {
        this.clientOneUKIHTbool = clientOneUKIHTbool;
    }

    public String getClientOneNRBbool() {
        return clientOneNRBbool;
    }

    public void setClientOneNRBbool(String clientOneNRBbool) {
        this.clientOneNRBbool = clientOneNRBbool;
    }

    public String getClientOneLPAbool() {
        return clientOneLPAbool;
    }

    public void setClientOneLPAbool(String clientOneLPAbool) {
        this.clientOneLPAbool = clientOneLPAbool;
    }

    public String getClientOneBLPbool() {
        return clientOneBLPbool;
    }

    public void setClientOneBLPbool(String clientOneBLPbool) {
        this.clientOneBLPbool = clientOneBLPbool;
    }

    public String getClientOneforeignWillbool() {
        return clientOneforeignWillbool;
    }

    public void setClientOneforeignWillbool(String clientOneforeignWillbool) {
        this.clientOneforeignWillbool = clientOneforeignWillbool;
    }

    public String getClientOnelifeCoverInTrustbool() {
        return clientOnelifeCoverInTrustbool;
    }

    public void setClientOnelifeCoverInTrustbool(String clientOnelifeCoverInTrustbool) {
        this.clientOnelifeCoverInTrustbool = clientOnelifeCoverInTrustbool;
    }

    public String getClientOneDeathBenefitToTrustbool() {
        return clientOneDeathBenefitToTrustbool;
    }

    public void setClientOneDeathBenefitToTrustbool(String clientOneDeathBenefitToTrustbool) {
        this.clientOneDeathBenefitToTrustbool = clientOneDeathBenefitToTrustbool;
    }

    public String getClientOnedeathInServiceToTrustbool() {
        return clientOnedeathInServiceToTrustbool;
    }

    public void setClientOnedeathInServiceToTrustbool(String clientOnedeathInServiceToTrustbool) {
        this.clientOnedeathInServiceToTrustbool = clientOnedeathInServiceToTrustbool;
    }

    public String getClientOneExpectingInheritancebool() {
        return clientOneExpectingInheritancebool;
    }

    public void setClientOneExpectingInheritancebool(String clientOneExpectingInheritancebool) {
        this.clientOneExpectingInheritancebool = clientOneExpectingInheritancebool;
    }

    public String getClientTwoUKIHTbool() {
        return clientTwoUKIHTbool;
    }

    public void setClientTwoUKIHTbool(String clientTwoUKIHTbool) {
        this.clientTwoUKIHTbool = clientTwoUKIHTbool;
    }

    public String getClientTwoNRBbool() {
        return clientTwoNRBbool;
    }

    public void setClientTwoNRBbool(String clientTwoNRBbool) {
        this.clientTwoNRBbool = clientTwoNRBbool;
    }

    public String getClientTwoLPAbool() {
        return clientTwoLPAbool;
    }

    public void setClientTwoLPAbool(String clientTwoLPAbool) {
        this.clientTwoLPAbool = clientTwoLPAbool;
    }

    public String getClientTwoBLPbool() {
        return clientTwoBLPbool;
    }

    public void setClientTwoBLPbool(String clientTwoBLPbool) {
        this.clientTwoBLPbool = clientTwoBLPbool;
    }

    public String getClientTwoforeignWillbool() {
        return clientTwoforeignWillbool;
    }

    public void setClientTwoforeignWillbool(String clientTwoforeignWillbool) {
        this.clientTwoforeignWillbool = clientTwoforeignWillbool;
    }

    public String getClientTwolifeCoverInTrustbool() {
        return clientTwolifeCoverInTrustbool;
    }

    public void setClientTwolifeCoverInTrustbool(String clientTwolifeCoverInTrustbool) {
        this.clientTwolifeCoverInTrustbool = clientTwolifeCoverInTrustbool;
    }

    public String getClientTwoDeathBenefitToTrustbool() {
        return clientTwoDeathBenefitToTrustbool;
    }

    public void setClientTwoDeathBenefitToTrustbool(String clientTwoDeathBenefitToTrustbool) {
        this.clientTwoDeathBenefitToTrustbool = clientTwoDeathBenefitToTrustbool;
    }

    public String getClientTwodeathInServiceToTrustbool() {
        return clientTwodeathInServiceToTrustbool;
    }

    public void setClientTwodeathInServiceToTrustbool(String clientTwodeathInServiceToTrustbool) {
        this.clientTwodeathInServiceToTrustbool = clientTwodeathInServiceToTrustbool;
    }

    public String getClientTwoExpectingInheritancebool() {
        return clientTwoExpectingInheritancebool;
    }

    public void setClientTwoExpectingInheritancebool(String clientTwoExpectingInheritancebool) {
        this.clientTwoExpectingInheritancebool = clientTwoExpectingInheritancebool;
    }

    public String getClientJointforeignWillbool() {
        return clientJointforeignWillbool;
    }

    public void setClientJointforeignWillbool(String clientJointforeignWillbool) {
        this.clientJointforeignWillbool = clientJointforeignWillbool;
    }

    public String getClientJointlifeCoverInTrustbool() {
        return clientJointlifeCoverInTrustbool;
    }

    public void setClientJointlifeCoverInTrustbool(String clientJointlifeCoverInTrustbool) {
        this.clientJointlifeCoverInTrustbool = clientJointlifeCoverInTrustbool;
    }

    public Toggle getClientOneUKIHTtoggle() {
        return clientOneUKIHTtoggle;
    }

    public void setClientOneUKIHTtoggle(Toggle clientOneUKIHTtoggle) {
        this.clientOneUKIHTtoggle = clientOneUKIHTtoggle;
    }

    public Toggle getClientOneNRBtoggle() {
        return clientOneNRBtoggle;
    }

    public void setClientOneNRBtoggle(Toggle clientOneNRBtoggle) {
        this.clientOneNRBtoggle = clientOneNRBtoggle;
    }

    public Toggle getClientOneLPAtoggle() {
        return clientOneLPAtoggle;
    }

    public void setClientOneLPAtoggle(Toggle clientOneLPAtoggle) {
        this.clientOneLPAtoggle = clientOneLPAtoggle;
    }

    public Toggle getClientOneBLPtoggle() {
        return clientOneBLPtoggle;
    }

    public void setClientOneBLPtoggle(Toggle clientOneBLPtoggle) {
        this.clientOneBLPtoggle = clientOneBLPtoggle;
    }

    public Toggle getClientOneforeignWilltoggle() {
        return clientOneforeignWilltoggle;
    }

    public void setClientOneforeignWilltoggle(Toggle clientOneforeignWilltoggle) {
        this.clientOneforeignWilltoggle = clientOneforeignWilltoggle;
    }

    public Toggle getClientOnelifeCoverInTrusttoggle() {
        return clientOnelifeCoverInTrusttoggle;
    }

    public void setClientOnelifeCoverInTrusttoggle(Toggle clientOnelifeCoverInTrusttoggle) {
        this.clientOnelifeCoverInTrusttoggle = clientOnelifeCoverInTrusttoggle;
    }

    public Toggle getClientOneDeathBenefitToTrusttoggle() {
        return clientOneDeathBenefitToTrusttoggle;
    }

    public void setClientOneDeathBenefitToTrusttoggle(Toggle clientOneDeathBenefitToTrusttoggle) {
        this.clientOneDeathBenefitToTrusttoggle = clientOneDeathBenefitToTrusttoggle;
    }

    public Toggle getClientOnedeathInServiceToTrusttoggle() {
        return clientOnedeathInServiceToTrusttoggle;
    }

    public void setClientOnedeathInServiceToTrusttoggle(Toggle clientOnedeathInServiceToTrusttoggle) {
        this.clientOnedeathInServiceToTrusttoggle = clientOnedeathInServiceToTrusttoggle;
    }

    public Toggle getClientOneExpectingInheritancetoggle() {
        return clientOneExpectingInheritancetoggle;
    }

    public void setClientOneExpectingInheritancetoggle(Toggle clientOneExpectingInheritancetoggle) {
        this.clientOneExpectingInheritancetoggle = clientOneExpectingInheritancetoggle;
    }

    public Toggle getClientTwoUKIHTtoggle() {
        return clientTwoUKIHTtoggle;
    }

    public void setClientTwoUKIHTtoggle(Toggle clientTwoUKIHTtoggle) {
        this.clientTwoUKIHTtoggle = clientTwoUKIHTtoggle;
    }

    public Toggle getClientTwoNRBtoggle() {
        return clientTwoNRBtoggle;
    }

    public void setClientTwoNRBtoggle(Toggle clientTwoNRBtoggle) {
        this.clientTwoNRBtoggle = clientTwoNRBtoggle;
    }

    public Toggle getClientTwoLPAtoggle() {
        return clientTwoLPAtoggle;
    }

    public void setClientTwoLPAtoggle(Toggle clientTwoLPAtoggle) {
        this.clientTwoLPAtoggle = clientTwoLPAtoggle;
    }

    public Toggle getClientTwoBLPtoggle() {
        return clientTwoBLPtoggle;
    }

    public void setClientTwoBLPtoggle(Toggle clientTwoBLPtoggle) {
        this.clientTwoBLPtoggle = clientTwoBLPtoggle;
    }

    public Toggle getClientTwoforeignWilltoggle() {
        return clientTwoforeignWilltoggle;
    }

    public void setClientTwoforeignWilltoggle(Toggle clientTwoforeignWilltoggle) {
        this.clientTwoforeignWilltoggle = clientTwoforeignWilltoggle;
    }

    public Toggle getClientTwolifeCoverInTrusttoggle() {
        return clientTwolifeCoverInTrusttoggle;
    }

    public void setClientTwolifeCoverInTrusttoggle(Toggle clientTwolifeCoverInTrusttoggle) {
        this.clientTwolifeCoverInTrusttoggle = clientTwolifeCoverInTrusttoggle;
    }

    public Toggle getClientTwoDeathBenefitToTrusttoggle() {
        return clientTwoDeathBenefitToTrusttoggle;
    }

    public void setClientTwoDeathBenefitToTrusttoggle(Toggle clientTwoDeathBenefitToTrusttoggle) {
        this.clientTwoDeathBenefitToTrusttoggle = clientTwoDeathBenefitToTrusttoggle;
    }

    public Toggle getClientTwodeathInServiceToTrusttoggle() {
        return clientTwodeathInServiceToTrusttoggle;
    }

    public void setClientTwodeathInServiceToTrusttoggle(Toggle clientTwodeathInServiceToTrusttoggle) {
        this.clientTwodeathInServiceToTrusttoggle = clientTwodeathInServiceToTrusttoggle;
    }

    public Toggle getClientTwoExpectingInheritancetoggle() {
        return clientTwoExpectingInheritancetoggle;
    }

    public void setClientTwoExpectingInheritancetoggle(Toggle clientTwoExpectingInheritancetoggle) {
        this.clientTwoExpectingInheritancetoggle = clientTwoExpectingInheritancetoggle;
    }

    public Toggle getClientJointforeignWilltoggle() {
        return clientJointforeignWilltoggle;
    }

    public void setClientJointforeignWilltoggle(Toggle clientJointforeignWilltoggle) {
        this.clientJointforeignWilltoggle = clientJointforeignWilltoggle;
    }

    public Toggle getClientJointlifeCoverInTrusttoggle() {
        return clientJointlifeCoverInTrusttoggle;
    }

    public void setClientJointlifeCoverInTrusttoggle(Toggle clientJointlifeCoverInTrusttoggle) {
        this.clientJointlifeCoverInTrusttoggle = clientJointlifeCoverInTrusttoggle;
    }

    private Toggle clientOneUKIHTtoggle;
    private Toggle clientOneNRBtoggle;
    private Toggle clientOneLPAtoggle;
    private Toggle clientOneBLPtoggle;
    private Toggle clientOneforeignWilltoggle;
    private Toggle clientOnelifeCoverInTrusttoggle;
    private Toggle clientOneDeathBenefitToTrusttoggle;
    private Toggle clientOnedeathInServiceToTrusttoggle;
    private Toggle clientOneExpectingInheritancetoggle;

    private Toggle clientTwoUKIHTtoggle;
    private Toggle clientTwoNRBtoggle;
    private Toggle clientTwoLPAtoggle;
    private Toggle clientTwoBLPtoggle;
    private Toggle clientTwoforeignWilltoggle;
    private Toggle clientTwolifeCoverInTrusttoggle;
    private Toggle clientTwoDeathBenefitToTrusttoggle;
    private Toggle clientTwodeathInServiceToTrusttoggle;
    private Toggle clientTwoExpectingInheritancetoggle;
    private Toggle clientJointforeignWilltoggle;
    private Toggle clientJointlifeCoverInTrusttoggle;

}
