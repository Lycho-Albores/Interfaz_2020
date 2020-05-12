/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_empleado_ventanas;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author theso
 */
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
    @FXML
    private JFXButton btn_consultar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        manita();
    }    
    public void manita(){
        btn_consultar.setCursor(Cursor.HAND);
    }
}
