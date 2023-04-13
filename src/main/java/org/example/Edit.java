package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import java.io.IOException;

public class Edit {
    @FXML
    private Button back;

    @FXML
    private void setBack() throws IOException{
        App.setRoot("users");
    }
    @FXML
    private Button changes;
    @FXML
    public Label success;

}
