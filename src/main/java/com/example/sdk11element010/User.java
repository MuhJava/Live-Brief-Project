package com.example.sdk11element010;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// Singleton for single user object access across controllers, referenced from <https://www.geeksforgeeks.org/singleton-class-java/>

class User {

    private static User single_instance = null;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    private String userID;

    private boolean loggedInStatus = false;
    private boolean isNewProfile = false;

    private String maritalStatus;

    private String userEmail;

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    private String userPassword;
    private String firstName;
    private String partnerFirstName;
    private String partnerSurname;
    private String surname;
    private short numberOfChildren;
    private String dateOfBirth;
    private String clientGrossPropertyValue;
    private String clientNetPropertyValue;
    private String percentageEquityValue;
    private String partnerPercentageEquity;
    private String totalHolidayHomesValue;
    private String netTotalHolidayHomesValue;
    private String percentageHolidayAssetsValue;
    private String partnerPercentageHolidayAssets;
    private String btlPropertyValue;
    private String netBtlPropertyValue;
    private String percentageBtlValue;
    private String partnerBtlPercentage;
    private String savingsAndCashValue;
    private String savingsInNameValue;
    private String savingsPartnersName;
    private String savingsJoint;
    private String investmentsInnameValue;
    private String investmentsPartnersName;
    private String jointInvestments;
    private String businessValueInNameValue;
    private String businessValuePartnersName;
    private String jointBusinessValue;
    private String lifeCoverValue;
    private String lifeCoverPartnerDeath;
    private String pensionSippsValue;
    private String pensionSippsPartnerName;
    private String disCoverValue;
    private String disCoverPartner;

    private User() {}

    // Setters and getters for user quick access data
    public void setUserLoggedIn(boolean newStatus) {
        loggedInStatus = newStatus;
    }
    public void setUserLoggedOut() {
        loggedInStatus = false;
    }
    public boolean getUserLoggedInStatus() {
        return loggedInStatus;
    }

    public void setIsNewProfile(boolean profileCreated) {
        isNewProfile = true;
    }
    public boolean getIsNewProfile() {
        return isNewProfile;
    }

    public void setMaritalStatus (String newStatus) {
        maritalStatus = newStatus;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setUserEmail (String newUserEmail) {
        userEmail = newUserEmail;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPartnerFirstName() {
        return partnerFirstName;
    }

    public void setPartnerFirstName(String partnerFirstName) {
        this.partnerFirstName = partnerFirstName;
    }

    public String getPartnerSurname() {
        return partnerSurname;
    }

    public void setPartnerSurname(String partnerSurname) {
        this.partnerSurname = partnerSurname;
    }
    public short getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(short numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            if (dateOfBirth != null) {
                return LocalDate.parse(dateOfBirth, formatter);
            } else {
                LocalDate date = LocalDate.now();
                dateOfBirth = String.valueOf(date);
                return LocalDate.parse(dateOfBirth);
            }
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClientGrossPropertyValue() {
        return clientGrossPropertyValue;
    }

    public void setClientGrossPropertyValue(String clientGrossPropertyValue) {
        this.clientGrossPropertyValue = clientGrossPropertyValue;
    }

    public String getClientNetPropertyValue() {
        return clientNetPropertyValue;
    }

    public void setClientNetPropertyValue(String clientNetPropertyValue) {
        this.clientNetPropertyValue = clientNetPropertyValue;
    }
    public String getPercentageEquityValue() {
        return percentageEquityValue;
    }

    public void setPercentageEquityValue(String percentageEquityValue) {
        this.percentageEquityValue = percentageEquityValue;
    }
    public String getPartnerPercentageEquity() {
        return partnerPercentageEquity;
    }
    public void setPartnerPercentageEquity(String partnerPercentageEquity) {
        this.partnerPercentageEquity = partnerPercentageEquity;
    }
    public String getTotalHolidayHomesValue() {
        return totalHolidayHomesValue;
    }

    public void setTotalHolidayHomesValue(String totalHolidayHomesValue) {
        this.totalHolidayHomesValue = totalHolidayHomesValue;
    }

    public String getNetTotalHolidayHomesValue() {
        return netTotalHolidayHomesValue;
    }

    public void setNetTotalHolidayHomesValue(String netTotalHolidayHomesValue) {
        this.netTotalHolidayHomesValue = netTotalHolidayHomesValue;
    }

    public String getPercentageHolidayAssetsValue() {
        return percentageHolidayAssetsValue;
    }

    public String getPartnerPercentageHolidayAssets() {
        return partnerPercentageHolidayAssets;
    }
    public void setPartnerPercentageHolidayAssets(String partnerPercentageHolidayAssets) {
        this.partnerPercentageHolidayAssets = partnerPercentageHolidayAssets;
    }

    public void setPercentageHolidayAssetsValue(String percentageHolidayAssetsValue) {
        this.percentageHolidayAssetsValue = percentageHolidayAssetsValue;
    }

    public String getBtlPropertyValue() {
        return btlPropertyValue;
    }

    public void setBtlPropertyValue(String btlPropertyValue) {
        this.btlPropertyValue = btlPropertyValue;
    }

    public String getNetBtlPropertyValue() {
        return netBtlPropertyValue;
    }

    public void setNetBtlPropertyValue(String netBtlPropertyValue) {
        this.netBtlPropertyValue = netBtlPropertyValue;
    }

    public String getPercentageBtlValue() {
        return percentageBtlValue;
    }

    public void setPercentageBtlValue(String percentageBtlValue) {
        this.percentageBtlValue = percentageBtlValue;
    }

    public String getPartnerBtlPercentage() {
        return partnerBtlPercentage;
    }

    public void setPartnerBtlPercentage(String partnerBtlPercentage) {
        this.partnerBtlPercentage = partnerBtlPercentage;
    }

    public String getSavingsAndCashValue() {
        return savingsAndCashValue;
    }

    public String getSavingsPartnersName() {
        return savingsPartnersName;
    }

    public void setSavingsPartnersName(String savingsPartnersName) {
        this.savingsPartnersName = savingsPartnersName;
    }

    public String getSavingsJoint() {
        return savingsJoint;
    }

    public void setSavingsJoint(String savingsJoint) {
        this.savingsJoint = savingsJoint;
    }

    public String getInvestmentsPartnersName() {
        return investmentsPartnersName;
    }

    public void setInvestmentsPartnersName(String investmentsPartnersName) {
        this.investmentsPartnersName = investmentsPartnersName;
    }

    public String getJointInvestments() {
        return jointInvestments;
    }

    public void setJointInvestments(String jointInvestments) {
        this.jointInvestments = jointInvestments;
    }

    public String getBusinessValuePartnersName() {
        return businessValuePartnersName;
    }

    public void setBusinessValuePartnersName(String businessValuePartnersName) {
        this.businessValuePartnersName = businessValuePartnersName;
    }

    public String getJointBusinessValue() {
        return jointBusinessValue;
    }

    public void setJointBusinessValue(String jointBusinessValue) {
        this.jointBusinessValue = jointBusinessValue;
    }

    public String getLifeCoverPartnerDeath() {
        return lifeCoverPartnerDeath;
    }

    public void setLifeCoverPartnerDeath(String lifeCoverPartnerDeath) {
        this.lifeCoverPartnerDeath = lifeCoverPartnerDeath;
    }

    public String getPensionSippsPartnerName() {
        return pensionSippsPartnerName;
    }

    public void setPensionSippsPartnerName(String pensionSippsPartnerName) {
        this.pensionSippsPartnerName = pensionSippsPartnerName;
    }

    public String getDisCoverPartner() {
        return disCoverPartner;
    }

    public void setDisCoverPartner(String disCoverPartner) {
        this.disCoverPartner = disCoverPartner;
    }

    public void setSavingsAndCashValue(String savingsAndCashValue) {
        this.savingsAndCashValue = savingsAndCashValue;
    }

    public String getSavingsInNameValue() {
        return savingsInNameValue;
    }

    public void setSavingsInNameValue(String savingsInNameValue) {
        this.savingsInNameValue = savingsInNameValue;
    }

    public String getInvestmentsInnameValue() {
        return investmentsInnameValue;
    }

    public void setInvestmentsInnameValue(String investmentsInnameValue) {
        this.investmentsInnameValue = investmentsInnameValue;
    }

    public String getBusinessValueInNameValue() {
        return businessValueInNameValue;
    }

    public void setBusinessValueInNameValue(String businessValueInNameValue) {
        this.businessValueInNameValue = businessValueInNameValue;
    }

    public String getLifeCoverValue() {
        return lifeCoverValue;
    }

    public void setLifeCoverValue(String lifeCoverValue) {
        this.lifeCoverValue = lifeCoverValue;
    }

    public String getPensionSippsValue() {
        return pensionSippsValue;
    }

    public void setPensionSippsValue(String pensionSippsValue) {
        this.pensionSippsValue = pensionSippsValue;
    }

    public String getDisCoverValue() {
        return disCoverValue;
    }

    public void setDisCoverValue(String disCoverValue) {
        this.disCoverValue = disCoverValue;
    }

    // Synchronised instance of user to one user is consistent to user's data
    public static synchronized User getInstance() {
        if (single_instance == null) {
            single_instance = new User();
        }
        return single_instance;
    }

}
