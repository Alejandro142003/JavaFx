package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button btn_home;

    @FXML
    private Label labelUser;

    @FXML
    private TextField userField;

    @FXML
    private void btnHomeValidate() throws IOException {
        if (userField.getText().equals("admin")){
            labelUser.setText("Usuario correcto!");
            labelUser.setStyle("fx-background-color: #129c00");
        }else {
            labelUser.setText("Usuario incorrecto!");
            labelUser.setStyle("fx-background-color: #FF0000");
        }
    }
}

