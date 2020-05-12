
package Login;

import Menu_Cliente.MenuClienteController;
import Menu_Cliente.Ventanas.Estado_cuentaController;
import clases.Usuario;
import cliente.ConsumoCliente;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRippler;
import com.jfoenix.controls.JFXTextField;
import enums.EndPoint;
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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;


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
    //@FXML
    //private JFXButton btn_newAccount;
    
    ConsumoCliente consumo = new ConsumoCliente();
    @FXML
    private Label lblError;
    
    Estado_cuentaController controller = new Estado_cuentaController();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        hand();
        rippler();
    }
    
   public void hand(){
       txt_account.setCursor(Cursor.HAND);
       txt_password.setCursor(Cursor.HAND);
       btn_login.setCursor(Cursor.HAND);
       logo_bank.setCursor(Cursor.HAND);
       //btn_newAccount.setCursor(Cursor.HAND);
   }

    public void rippler() {
        JFXRippler rippler = new JFXRippler(pane_login);
      //  JFXRippler rippler1 = new JFXRippler(logo);
        rippler.setRipplerFill(Paint.valueOf("#000000"/*"#3498db"*/));
        rippler.setRipplerRadius(60);
        rippler.setMaskType(JFXRippler.RipplerMask.RECT);
        anchor_login.getChildren().add(rippler);
    }
 
    //COMENTE EL CODIGO QUE PUSISTE ISAIAS, PARA QUE UNICAMENTE LO DESCOMENTES!
    @FXML
    private void goToMenuCliente(ActionEvent event) throws IOException {
       /* FXMLLoader ventana = new FXMLLoader(getClass().getResource("/Menu_Cliente/MenuCliente.fxml"));
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
        */
       
       //AQUI ESTA EL CODIGO PARA ENTRAR A LA VENTANA EMPLEADO!
        FXMLLoader ventana = new FXMLLoader(getClass().getResource("/Menu_Empleado/MenuDeOpciones.fxml"));
            Parent root = ventana.load();
            Stage stege = new Stage();
            Scene scene = new Scene(root);
            stege.setScene(scene);
            stege.setTitle("Menu Empleado | BN Tuchtlan"); // Titulo
            stege.getIcons().add(new Image("appbank_test/imgs/icn.png")); // Logo en el programa
            stege.show();            
            Stage cerrar;
            cerrar = (Stage)btn_login.getScene().getWindow();
            cerrar.close();
        
        
      /*  
        boolean usuarioValido = false;
        boolean contraseniaValido = false;
        String _usuario = "";
        String _contrasenia = "";
        String usuario = txt_account.getText();
        String contrasenia = new String(txt_password.getText());
        
        Object[][] usuarios = consumo.lista(EndPoint.USUARIOS);
        
        for(int i=0; i<usuarios.length; i++){
            for(int j=0; j<usuarios[i].length; j++){
                if(j==1){
                    _usuario = String.valueOf(usuarios[i][j]);
                }
                if(j==2){
                    _contrasenia = String.valueOf(usuarios[i][j]);
                }
            }
            
            if(usuario.equals(_usuario) && contrasenia.equals(_contrasenia)){
                usuarioValido = true;
                contraseniaValido = true;
                controller.setText(usuario);
            }
        }
        
        if(usuarioValido == true && contraseniaValido==true){

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
        else{
            lblError.setText("Usuario o contraseña incorrectos");
            txt_account.setText(null);
            txt_password.setText(null);
        }*/
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
   
    

//ESTA PARTE DE ABAJO SE PUEDE ELIMINAR!
/*@FXML
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
  */ 
}
