/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu_Empleado;

import Menu_Cliente.MenuClienteController;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class MenuDeOpcionesController implements Initializable {

    @FXML
    private BorderPane BorderPane;
    @FXML
    private JFXButton btn_consultas;
    @FXML
    private JFXButton btn_edoCuenta;
    @FXML
    private JFXButton btn_financiero;
    @FXML
    private JFXButton btn_nvoCliente;
    @FXML
    private JFXButton btn_nvaCuenta;
    @FXML
    private Label lable_NombreUsuario;
    @FXML
    private JFXButton btn_logOut;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        manita();
        btn_consultas.setDisable(true);
        
        
    }    
    public void manita(){
        btn_consultas.setCursor(Cursor.HAND);
        btn_edoCuenta.setCursor(Cursor.HAND);
        btn_financiero.setCursor(Cursor.HAND);
        btn_logOut.setCursor(Cursor.HAND);
        btn_nvaCuenta.setCursor(Cursor.HAND);
        btn_nvoCliente.setCursor(Cursor.HAND);
    }
    
    
     public void CargaPag(String pag){
            Parent root = null;
            
            try{
                root =  FXMLLoader.load(getClass().getResource("/Menu_Empleado/Ventanas/"+pag+".fxml"));
                
            }catch(IOException ex){
                Logger.getLogger(MenuClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }
            BorderPane.setCenter(root);
        }

    @FXML
    private void toNvaCuenta(ActionEvent event) {
        CargaPag("Alta_Cuenta");
    }

    @FXML
    private void toNvoCliente(ActionEvent event) {
        CargaPag("Alta_Cliente");
    }

    @FXML
    private void toEdoCuenta(ActionEvent event) {
        CargaPag("Estado_Cuenta");
    }

    @FXML
    private void toConsultas(ActionEvent event) {
        CargaPag("");
    }

    @FXML
    private void toReportFinanciero(ActionEvent event) {
        CargaPag("Reporte_Financiero");
    }

    @FXML
    private void backToLogin(ActionEvent event) throws IOException {
        FXMLLoader ventana = new FXMLLoader(getClass().getResource("/Login/Login.fxml"));
        Parent root = ventana.load();
        Stage stege = new Stage();
        Scene scene = new Scene(root);
        stege.setScene(scene);
        stege.show();
        stege.setTitle("Login | BN Tuchtlan"); // Titulo
        stege.getIcons().add(new Image("appbank_test/imgs/icn.png")); // Logo en el programa
        
         Stage cerrar;
        cerrar = (Stage)btn_logOut.getScene().getWindow();
        cerrar.close();
    }
    
     
     
     
}
