module com.svs {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens com.svs to javafx.fxml;
    exports com.svs;
}