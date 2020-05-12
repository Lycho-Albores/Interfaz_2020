
package Menu_Cliente.Ventanas;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class Pago_ServiciosController implements Initializable {

    @FXML
    private ImageView logo_bank;
    @FXML
    private JFXComboBox<?> combo_servicios;
    @FXML
    private JFXTextField txt_montoApagar;
    @FXML
    private JFXButton btn_ConfirmarPago;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackToInicio(MouseEvent event) {
    }

    @FXML
    private void confirmarPago(ActionEvent event) {
    }
    
}
