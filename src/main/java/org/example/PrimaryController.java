package org.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController  implements Initializable{

	   @FXML
	    private Button btnAgregar;

	    @FXML
	    private TableColumn<Persona,String> colApellidos;

	    @FXML
	    private TableColumn<Persona,String> colEdad;

	    @FXML
	    private TableColumn <Persona,String>colNombre;

	    @FXML
	    private TableView<Persona> tbPersonas;

	    @FXML
	    private TextField txtApellidos;

	    @FXML
	    private TextField txtEdad;

	    @FXML
	    private TextField txtNombre;
	    
	    private ObservableList<Persona> personas=FXCollections.observableArrayList();

/*arraylist de fx*/
@Override
	public void initialize(URL url,ResourceBundle rb) {

	    	colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));

			colApellidos.setCellValueFactory(new PropertyValueFactory<>("apellidos"));

			colEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));

	    }

	    @FXML
	    private void agregarPersona(ActionEvent event) {
			if(!"".equals(txtNombre.getText().trim())){
				personas.add(new Persona(txtNombre.getText().trim(),txtApellidos.getText().trim(),txtEdad.getText().trim()));
				tbPersonas.setItems(personas);
				tbPersonas.refresh();
				txtNombre.setText("");
				txtApellidos.setText("");
				txtEdad.setText("");
			}else{
				Alert alerta=new Alert(Alert.AlertType.INFORMATION);
				alerta.setHeaderText("Mensaje de informacion");
				alerta.setTitle("Dialogo de advertencia");
				alerta.setContentText("Es necesario que se escriba un nombre al contacto");
				alerta.showAndWait();
			}
		}
}