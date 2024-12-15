module com.example.demofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens ui to javafx.fxml;
    exports ui;
    exports java;
}