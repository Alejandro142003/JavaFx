package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Edit {
    @FXML
    private Button back;

    @FXML
    private void setBack() throws IOException{
        App.setRoot("users");
    }

}
