package com.svs;

import java.io.IOException;
import com.svs.util.AlertUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class PrimaryController {

    @FXML
    private TextField txtName;

    @FXML
    private Button btnGreet;

    @FXML
    void greetAction(MouseEvent event) throws IOException {
        if (!txtName.getText().isEmpty())
            AlertUtil.createAlert(AlertType.INFORMATION, "Hello " + txtName.getText() + "!").showAndWait();
        else
            AlertUtil.createAlert(AlertType.ERROR, "Sorry, you need to enter your name").showAndWait();
    }
}