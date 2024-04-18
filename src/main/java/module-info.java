module com.example.tangramtest {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.tangramtest to javafx.fxml;
    exports com.example.tangramtest;
}