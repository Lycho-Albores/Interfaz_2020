
package menu_empleado_ventanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;


public class Estado_CuentaController implements Initializable {

    @FXML
    private TableView<?> TablaEstadoCuenta;
    @FXML
    private Label lblNombreTitular;
    @FXML
    private Label lblBumeroCuenta;
    @FXML
    private Label lblTipoCuenta;
    @FXML
    private Label lblSaldo;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
