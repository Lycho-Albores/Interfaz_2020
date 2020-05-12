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
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author theso
 */
public class Alta_CuentaController implements Initializable {

    @FXML
    private TableView<?> TablaCuenta;
    @FXML
    private JFXTextField txt_idCuenta;
    @FXML
    private JFXTextField txt_nombreCuenta;
    @FXML
    private JFXTextField txt_apPaternoCuenta;
    @FXML
    private JFXTextField txt_apMaternoCuenta;
    @FXML
    private JFXTextField txt_SaldoInicialCuenta;
    @FXML
    private JFXTextField txt_nombreUsuarioCuenta;
    @FXML
    private JFXTextField txt_contraseñaCuenta;
    @FXML
    private JFXTextField txt_numeroCuenta;
    @FXML
    private JFXTextField txt_numTarjetaCuenta;
    @FXML
    private JFXTextField txt_referenciaCuenta;
    @FXML
    private JFXComboBox<?> ComBox_DescripcionCuenta;
    @FXML
    private JFXComboBox<?> ComBox_TipoCuenta;
    @FXML
    private JFXButton btn_buscar;
    @FXML
    private JFXDatePicker DatePicker_FechaCuenta;
    @FXML
    private JFXButton btn_insertar;
    @FXML
    private JFXButton btn_actualizar;
    @FXML
    private JFXButton btn_eliminar;
    @FXML
    private JFXButton btn_generar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        manita();
    }    
    
    
    
    public void manita(){
        btn_buscar.setCursor(Cursor.HAND);
        btn_actualizar.setCursor(Cursor.HAND);
        btn_eliminar.setCursor(Cursor.HAND);
        btn_generar.setCursor(Cursor.HAND);
        btn_insertar.setCursor(Cursor.HAND);
        ComBox_DescripcionCuenta.setCursor(Cursor.HAND);
        ComBox_TipoCuenta.setCursor(Cursor.HAND);
        DatePicker_FechaCuenta.setCursor(Cursor.HAND);
    }
    
}
