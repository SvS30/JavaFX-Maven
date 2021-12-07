module com.svs {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens com.svs to javafx.fxml;
    exports com.svs;
}