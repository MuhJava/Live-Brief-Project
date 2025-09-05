package com.example.sdk11element010;

import java.sql.*;

public class Database {
    private static String userName;
    private static String password;
    private static Connection db;

    // URL of database for jdbc to reach
    private static String dbUrl  = "jdbc:postgresql://localhost:5432/postgres";

    // Connect to database with login and password parameters
    public static boolean getConnected(String userName, String passWord){

        try {
            db = DriverManager.getConnection(dbUrl, userName, passWord);
            System.out.println("Database connection established... ");
            return true;
        }catch (Exception e){
            System.out.println("Database connection Failed....");
            return false;
        }
    }

    // Used for updating database no return required, e.g CREATE, INSERT statements
    public static void sqlUpdate(String statement){

        try{
            Statement sqlStat = db.createStatement();
            sqlStat.executeUpdate(statement);
            System.out.println("SQL Statement Updated Successfully");
        }catch (Exception e){
            System.out.println("SQL Error");
        }
    }

    // Possibly no longer needed
    public static void prepMaritalStatusUpdate(String pStatement, String value) {
        try {
            PreparedStatement prepStat = db.prepareStatement(pStatement);
            prepStat.setString(1, value);
            prepStat.executeUpdate();
            System.out.println("Marital status updated");
        } catch (Exception e) {
            System.out.println("SQL Marital status error...");
        }
    }

    // Dynamically takes input email and password from user and attempts to enter into database
    public static void prepRegisterUpdate(String pStatement, String[] values) {
        try {
            PreparedStatement prepStat = db.prepareStatement(pStatement);
            prepStat.setString(1, values[0]);
            prepStat.setString(2, values[1]);
            prepStat.executeUpdate();
            System.out.println("New account registered");
        } catch (Exception e) {
            System.out.println("SQL Register Error...");
        }
    }

    // Database update for client who has a partners fields to fill out too, method is boolean to return whether it is successful or not
    public static boolean prepCoupleProfileUpdate(String pStatement, String[] values) {
        try {
            PreparedStatement prepStat = db.prepareStatement(pStatement);
            prepStat.setString(1, values[0]);
            prepStat.setString(2, values[1]);
            prepStat.setDate(3, Date.valueOf(values[2]));
            prepStat.setString(4, values[3]);
            prepStat.setString(5, values[4]);
            prepStat.setInt(6, Integer.parseInt(values[5]));
            prepStat.setInt(7, Integer.parseInt(values[6]));
            prepStat.setShort(8, Short.parseShort(values[7]));
            prepStat.setShort(9, Short.parseShort(values[8]));
            prepStat.setInt(10, Integer.parseInt(values[9]));
            prepStat.setInt(11, Integer.parseInt(values[10]));
            prepStat.setInt(12, Integer.parseInt(values[11]));
            prepStat.setInt(13, Integer.parseInt(values[12]));
            prepStat.setShort(14, Short.parseShort(values[13]));
            prepStat.setShort(15, Short.parseShort(values[14]));
            prepStat.setInt(16, Integer.parseInt(values[15]));
            prepStat.setInt(17, Integer.parseInt(values[16]));
            prepStat.setInt(18, Integer.parseInt(values[17]));
            prepStat.setInt(19, Integer.parseInt(values[18]));
            prepStat.setInt(20, Integer.parseInt(values[19]));
            prepStat.setInt(21, Integer.parseInt(values[20]));
            prepStat.setInt(22, Integer.parseInt(values[21]));
            prepStat.setInt(23, Integer.parseInt(values[22]));
            prepStat.setInt(24, Integer.parseInt(values[23]));
            prepStat.setInt(25, Integer.parseInt(values[24]));
            prepStat.setInt(26, Integer.parseInt(values[25]));
            prepStat.setInt(27, Integer.parseInt(values[26]));
            prepStat.setInt(28, Integer.parseInt(values[27]));
            prepStat.setInt(29, Integer.parseInt(values[28]));
            prepStat.setInt(30, Integer.parseInt(values[29]));
            prepStat.setInt(31, Integer.parseInt(values[30]));
            prepStat.setString(32, values[31]);
            prepStat.setShort(33, Short.parseShort(values[32]));
            prepStat.setShort(34, Short.parseShort(values[33]));

            prepStat.executeUpdate();
            System.out.println("Profile updated");
            return true;
        } catch (Exception e) {
            System.out.println("Error editing profile...");
            return false;
        }
    }

    // Database update for single client data fields only, method is boolean to return whether it is successful or not
    public static boolean prepSingleProfileUpdate(String pStatement, String[] values) {
        try {
            PreparedStatement prepStat = db.prepareStatement(pStatement);
            prepStat.setString(1, values[0]);
            prepStat.setString(2, values[1]);
            prepStat.setDate(3, Date.valueOf(values[2]));
            prepStat.setInt(4, Integer.parseInt(values[3]));
            prepStat.setInt(5, Integer.parseInt(values[4]));
            prepStat.setShort(6, Short.parseShort(values[5]));
            prepStat.setInt(7, Integer.parseInt(values[6]));
            prepStat.setInt(8, Integer.parseInt(values[7]));
            prepStat.setShort(9, Short.parseShort(values[8]));
            prepStat.setInt(10, Integer.parseInt(values[9]));
            prepStat.setInt(11, Integer.parseInt(values[10]));
            prepStat.setShort(12, Short.parseShort(values[11]));
            prepStat.setInt(13, Integer.parseInt(values[12]));
            prepStat.setInt(14, Integer.parseInt(values[13]));
            prepStat.setInt(15, Integer.parseInt(values[14]));
            prepStat.setInt(16, Integer.parseInt(values[15]));
            prepStat.setInt(17, Integer.parseInt(values[16]));
            prepStat.setInt(18, Integer.parseInt(values[17]));
            prepStat.setInt(19, Integer.parseInt(values[18]));
            prepStat.setString(20, values[19]);
            prepStat.executeUpdate();
            System.out.println("Profile updated");
            return true;
        } catch (Exception e) {
            System.out.println("Error editing profile...");
            return false;
        }
    }

    // Database update for child data fields, method is boolean to return whether it is successful or not
    public static boolean prepChildUpdate(String pStatement, String[] values) {
        try {
            PreparedStatement prepStat = db.prepareStatement(pStatement);
            prepStat.setInt(1, Integer.parseInt(values[0]));
            prepStat.setString(2, values[1]);
            prepStat.setString(3, values[2]);
            prepStat.setDate(4, Date.valueOf(values[3]));
            prepStat.setString(5, (values[4]));
            prepStat.setString(6, (values[5]));
            prepStat.executeUpdate();
            System.out.println("Child Profile updated");
            return true;
        } catch (Exception e) {
            System.out.println("Error adding child data...");
            e.printStackTrace();
            return false;
        }
    }

    // Get current users email address from database
    public ResultSet fetchUserEmail(String statement){

        try{
            Statement sqlStat = db.createStatement();
            ResultSet rs = sqlStat.executeQuery(statement);
            System.out.println("SQL Statement Updated Successfully...");
            return rs;
        }catch (Exception e){
            System.out.println("SQL Error...");
        }
        return null;
    }

    // Get users data from database
    public static ResultSet fetchUserID(String pStatement, String value){

        try {
            PreparedStatement prepStat = db.prepareStatement(pStatement);
            prepStat.setString(1,  value);
            ResultSet rs = prepStat.executeQuery();
            System.out.println("Executing query...");
            return rs;
        } catch (Exception e) {
            System.out.println("ID Query error...");
        }
        return null;
    }

    // Used for inserting, updating database
    public static void prepUpdate(String pStatement, String[] values) {
        try {
            PreparedStatement prepStat = db.prepareStatement(pStatement);
            prepStat.setString(1, values[0]);
            prepStat.setString(2, values[1]);
            prepStat.executeUpdate();
            System.out.println("New account registered");
        } catch (Exception e) {
            System.out.println("SQL Error...");
        }
    }

    // Used for returning values, e.g SELECT statements
    public static ResultSet sqlExecute(String statement){

        try{
            Statement sqlStat = db.createStatement();
            ResultSet rs = sqlStat.executeQuery(statement);
            System.out.println("SQL Statement Updated Successfully...");
            return rs;
        } catch (Exception e){
            System.out.println("SQL Error...");
        }
        return null;
    }

    // A default method from jdbc examples repurposed for simply checking a user exists based on input email address
    public static ResultSet prepExecute(String pStatement, String value) {
        try {
            PreparedStatement prepStat = db.prepareStatement(pStatement);
            prepStat.setString(1,  value);
            ResultSet rs = prepStat.executeQuery();
            System.out.println("Executing query...");
            return rs;
        } catch (Exception e) {
            System.out.println("Query error...");
        }
        return null;
    }

    // Uses clientID from database to fetch users data and store into User data fields
    public static ResultSet fetchUserData(String pStatement, String value) {
        try {
            PreparedStatement prepStat = db.prepareStatement(pStatement);
            prepStat.setInt(1, Integer.parseInt(value));
            ResultSet rs = prepStat.executeQuery();
            System.out.println("Executing query...");
            return rs;
        } catch (Exception e) {
            System.out.println("Data query error...");
        }
        return null;
    }

    // Method that takes a resultset data type from database, parses to String and prints to console
    public static void resultPrinter(ResultSet results) {
        try {
            while (results.next()) {
                String row = "";
                for (int i = 1; i<=results.getMetaData().getColumnCount(); i++) {
                    row += results.getString(i) + ", ";
                }
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Result printing error");
        }
    }

    public boolean getConnected(){

        try{
            db=DriverManager.getConnection(dbUrl,userName,password);
            System.out.println("Connection Established Successfully");
            return true;
        }catch (Exception e){
            System.out.println("Error connecting to jjep database");
            return false;
        }
    }

    // Disconnect from database
    public void disconnect(){

        try{
            db.close();
            System.out.println("Connection disconnected Successfully");
        }catch (Exception e){
            System.out.println("Connection disconnected unsuccessfully");
        }
    }

    /* Used while testing table creation worked
    public void createTestTable() {
    	String testString = "CREATE TABLE address (city_name_is_super_long varchar(50), housenumber int);";
    	sqlUpdate(testString);
    }
    */

    // Method for creating a new table, simply enter the create statement
    public static void createNewTable(String createTableStatement) {
        sqlUpdate(createTableStatement);
    }

    // Method checks table exists by taking table name, and querying database for that tables name, returning true or false
    public static boolean checkTableExists(String tableName) throws SQLException {

        DatabaseMetaData dbm = db.getMetaData();
        ResultSet tables = dbm.getTables(null, null, tableName, null);

        if (tables.next()) {
            return true;
        } else {
            return false;
        }
    }

    // Checks if user exists by taking an email address and checking client table for that value, either returns true or false
    public static boolean checkUserExists(String userEmail) throws SQLException {
        ResultSet result = prepExecute("SELECT 1 FROM client WHERE email = ?;", userEmail);
        if (result.next()) {
            return true;
        } else {
            return false;
        }
    }

    // Checks users email and password are correct for login, email and password are passed to method which checks if both values are true for a row in client, returns true or false for successful login or not
    public static boolean checkUserCredentials(String pStatement, String[] values) {
        try {
            PreparedStatement prepStat = db.prepareStatement(pStatement);
            prepStat.setString(1, values[0]);
            prepStat.setString(2, values[1]);
            ResultSet result = prepStat.executeQuery();
            System.out.println("Checking user credentials...\n");
            if (result.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("SQL error checking credentials...");
        }
        return false;
    }
}
