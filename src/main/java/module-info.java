module com.example.sdk11element010 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.sdk11element010 to javafx.fxml;
    exports com.example.sdk11element010;
        }