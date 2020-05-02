/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRippler;
import com.jfoenix.controls.JFXTextField;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lycho
 */
public class Login_Controller implements Initializable {

    @FXML
    private JFXButton btn_login;
    @FXML
    private Pane pane_login;
    @FXML
    private JFXTextField txt_account;
    @FXML
    private JFXPasswordField txt_password;
    @FXML
    private AnchorPane anchor_login;
    @FXML
    private ImageView logo_bank;
    @FXML
    private JFXButton btn_newAccount;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        hand();
        rippler();
              
          
        
    }    
    
   public void hand(){
       txt_account.setCursor(Cursor.HAND);
       txt_password.setCursor(Cursor.HAND);
       btn_login.setCursor(Cursor.HAND);
       logo_bank.setCursor(Cursor.HAND);
       btn_newAccount.setCursor(Cursor.HAND);
       
   }
  

    public void rippler() {
        JFXRippler rippler = new JFXRippler(pane_login);
      //  JFXRippler rippler1 = new JFXRippler(logo);
        rippler.setRipplerFill(Paint.valueOf("#000000"/*"#3498db"*/));
        rippler.setRipplerRadius(60);
        rippler.setMaskType(JFXRippler.RipplerMask.RECT);
        anchor_login.getChildren().add(rippler);
        
    }
 
    
    @FXML
    private void goToMenuCliente(ActionEvent event) throws IOException {
        FXMLLoader ventana = new FXMLLoader(getClass().getResource("/Menu_Cliente/MenuCliente.fxml"));
        Parent root = ventana.load();
        Stage stege = new Stage();
        Scene scene = new Scene(root);
        stege.setScene(scene);
        stege.setTitle("Menu Cliente | BN Tuchtlan"); // Titulo
        stege.getIcons().add(new Image("appbank_test/imgs/icn.png")); // Logo en el programa
        stege.show();            
        Stage cerrar;
        cerrar = (Stage)btn_login.getScene().getWindow();
        cerrar.close();
        
    }

    @FXML
    private void BackToInicio(MouseEvent event) throws IOException {
        FXMLLoader ventana = new FXMLLoader(getClass().getResource("/appbank_test/FXML_Inicio.fxml"));
        Parent root = ventana.load();
        Stage stege = new Stage();
        Scene scene = new Scene(root);
        stege.setScene(scene);
        stege.show();
        stege.setTitle("Inicio | BN Tuchtlan"); // Titulo
        stege.getIcons().add(new Image("appbank_test/imgs/icn.png")); // Logo en el programa
        
         Stage cerrar;
        cerrar = (Stage)logo_bank.getScene().getWindow();
        cerrar.close();
        
        
    }
    
@FXML
    private void goToNewAccount(ActionEvent event) throws IOException {
        FXMLLoader ventana = new FXMLLoader(getClass().getResource("/Crear_Cuenta/Nueva_Cuenta.fxml"));
        Parent root = ventana.load();
        Stage stege = new Stage();
        Scene scene = new Scene(root);
        stege.setScene(scene);
        stege.setTitle("Nueva Cuenta | BN Tuchtlan"); // Titulo
        stege.getIcons().add(new Image("appbank_test/imgs/icn.png")); // Logo en el programa
        stege.show();            
        Stage cerrar;
        cerrar = (Stage)btn_newAccount.getScene().getWindow();
        cerrar.close();
    }

   
    
   

   
  
    
}
