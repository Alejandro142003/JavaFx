package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

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
            labelUser.setText("Correct user!");
            labelUser.setTextFill(Color.GREEN);
        }else {
            labelUser.setText("Wrong User!");
            labelUser.setTextFill(Color.RED);
        }
    }
}

