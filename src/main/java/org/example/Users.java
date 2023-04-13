package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class Users {
    @FXML
    private Button logout;

    @FXML
    private void setLogout()throws IOException{
        App.setRoot("login");
    }

    @FXML
    private Button edit;
    @FXML
    private void setEdit()throws IOException{
        App.setRoot("edit");
    }
}
