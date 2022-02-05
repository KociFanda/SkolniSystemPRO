module com.example.skolnisystempokusc3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.skolnisystempokusc3 to javafx.fxml;
    exports com.example.skolnisystempokusc3;
}