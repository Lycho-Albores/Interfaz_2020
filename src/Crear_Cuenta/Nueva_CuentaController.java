/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crear_Cuenta;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author theso
 */
public class Nueva_CuentaController implements Initializable {

    @FXML
    private ImageView logo2;
    @FXML
    private JFXButton btn_confirmar;
    @FXML
    private JFXTextField txt_nombreCompleto;
    @FXML
    private JFXTextField txt_curp;
    @FXML
    private JFXTextField txt_Estado;
    @FXML
    private JFXTextField txtMunicipio;
    @FXML
    private JFXTextField txt_CP;
    @FXML
    private JFXTextField txt_correo;
    @FXML
    private JFXTextField txt_contra;
    @FXML
    private JFXTextField txt_contra_confirm;
    @FXML
    private JFXButton btn_regresar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        hand();
    }    

    @FXML
    private void confirmacion_de_cuenta(ActionEvent event) {
    }

    @FXML
    private void BackToLogin(ActionEvent event) throws IOException {
        FXMLLoader ventana = new FXMLLoader(getClass().getResource("/Login/Login.fxml"));
        Parent root = ventana.load();
        Stage stege = new Stage();
        Scene scene = new Scene(root);
        stege.setScene(scene);
        stege.setTitle("Nueva Cuenta | BN Tuchtlan"); // Titulo
        stege.getIcons().add(new Image("appbank_test/imgs/icn.png")); // Logo en el programa
        stege.show();            
        Stage cerrar;
        cerrar = (Stage)btn_regresar.getScene().getWindow();
        cerrar.close();
            
    }
    
    
    public void hand(){
        btn_confirmar.setCursor(Cursor.HAND);
        btn_regresar.setCursor(Cursor.HAND);
    }
}
