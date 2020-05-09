
package menu_empleado_ventanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class Alta_CuentaController implements Initializable {

    @FXML
    private TextField txtNombre;
    @FXML
    private DatePicker FechaApertura;
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtApellidoMat;
    @FXML
    private TextField txtSaldoInicial;
    @FXML
    private ComboBox<?> TipoCuenta;
    @FXML
    private TextField txtNombreUsuario;
    @FXML
    private TextField txtContrasenia;
    @FXML
    private TextField txtNumeroCuenta;
    @FXML
    private TextField txtNumeroTarjeta;
    @FXML
    private TextField txtReferencia;
    @FXML
    private TableView<?> TablaCuenta;
    @FXML
    private ComboBox<?> DescripcionCuenta;
    @FXML
    private TextField txtApellidoPat;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
