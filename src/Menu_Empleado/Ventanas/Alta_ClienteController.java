/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_empleado_ventanas;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author theso
 */
public class Alta_ClienteController implements Initializable {

    @FXML
    private TableView<?> TablaCliente;
    @FXML
    private JFXTextField txt_idCliente;
    @FXML
    private JFXTextField txt_nombreCliente;
    @FXML
    private JFXTextField txt_apPaternoCliente;
    @FXML
    private JFXTextField txt_apMaternoCliente;
    @FXML
    private JFXTextField txt_emailCliente;
    @FXML
    private JFXTextField txt_NumCliente;
    @FXML
    private JFXTextField txt_rfcCliente;
    @FXML
    private JFXTextField txt_domicilioCliente;
    @FXML
    private JFXTextField txt_telCliente;
    @FXML
    private JFXTextField txt_IngresoMensualCliente;
    @FXML
    private JFXButton btn_insertarCliente;
    @FXML
    private JFXButton btn_Actualizar;
    @FXML
    private JFXButton btn_Eliminar;
    @FXML
    private JFXButton btn_Cuentas;
    @FXML
    private JFXDatePicker DatePicker_FecNacCliente;
    @FXML
    private JFXComboBox<?> comBox_TipoPersonaCliente;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        manita();
        // TODO
    }    
    
    private void manita(){
        btn_Actualizar.setCursor(Cursor.HAND);
        btn_Cuentas.setCursor(Cursor.HAND);
        btn_Eliminar.setCursor(Cursor.HAND);
        btn_insertarCliente.setCursor(Cursor.HAND);
      
    }
}
