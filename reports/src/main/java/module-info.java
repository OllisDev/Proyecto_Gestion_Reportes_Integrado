module com.example.reports {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.reports to javafx.fxml;
    exports com.example.reports;
}
