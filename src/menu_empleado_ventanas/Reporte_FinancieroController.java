
package menu_empleado_ventanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;


public class Reporte_FinancieroController implements Initializable {

    @FXML
    private TableView<?> TablaReporte;
    @FXML
    private DatePicker Periodo1;
    @FXML
    private DatePicker Periodo2;
    @FXML
    private Label lblCantidad;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
