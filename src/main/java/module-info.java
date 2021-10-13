module com.example.softwareengineeringproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.softwareengineeringproject to javafx.fxml;
    exports com.example.softwareengineeringproject;
}