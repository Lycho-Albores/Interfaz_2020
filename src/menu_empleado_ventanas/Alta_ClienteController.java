
package menu_empleado_ventanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class Alta_ClienteController implements Initializable {

    @FXML
    private TextField txtId;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidoPat;
    @FXML
    private TextField txtApellidoMat;
    @FXML
    private TextField txtRFC;
    @FXML
    private TextField txtDomicilio;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtIngresoMensual;
    @FXML
    private ComboBox<?> TipoPersona;
    @FXML
    private TextField txtNumCliente;
    @FXML
    private TableView<?> TablaCliente;
    @FXML
    private DatePicker FechaNac;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
