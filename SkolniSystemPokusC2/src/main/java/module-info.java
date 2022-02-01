module com.example.skolnisystempokusc2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.skolnisystempokusc2 to javafx.fxml;
    exports com.example.skolnisystempokusc2;
}