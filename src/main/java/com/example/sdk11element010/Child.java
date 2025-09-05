package com.example.sdk11element010;

import java.sql.Date;

public class Child {

    public int getChildNumber() {
        return childNumber;
    }

    public void setChildNumber(int childNumber) {
        this.childNumber = childNumber;
    }

    public int getChildClientID() {
        return childClientID;
    }

    public void setChildClientID(int childClientID) {
        this.childClientID = childClientID;
    }

    public String getChildFirstName() {
        return childFirstName;
    }

    public void setChildFirstName(String childFirstName) {
        this.childFirstName = childFirstName;
    }

    public String getChildSurname() {
        return childSurname;
    }

    public void setChildSurname(String childSurname) {
        this.childSurname = childSurname;
    }

    public String getChildDob() {
        return childDob;
    }

    public void setChildDob(String childDob) {
        this.childDob = childDob;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getBelongsTo() {
        return belongsTo;
    }

    public void setBelongsTo(String belongsTo) {
        this.belongsTo = belongsTo;
    }

    private int childNumber;
    private int childClientID;
    private String childFirstName;
    private String childSurname;
    private String childDob;
    private String countryOfResidence;
    private String belongsTo;


    public Child() {}

    public Child (int childNumber, int childClientID, String childFirstName, String childSurname, Date childDob, String countryOfResidence, String belongsTo) {
        this.childNumber = childNumber;
        this.childClientID = childClientID;
        this.childFirstName = childFirstName;
        this.childSurname = childSurname;
        this.childDob = String.valueOf(childDob);
        this.countryOfResidence = countryOfResidence;
        this.belongsTo = belongsTo;
    }
}
