
package appbank_test;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRippler;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;


public class FXML_InicioController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Pane Pane_Inicio;
    @FXML
    private AnchorPane APane_Inicio;
    private ImageView logo;
    @FXML
    private ImageView logo2;
    private JFXButton btn_service;
    private JFXButton btn_notice;
    private JFXButton btn_whowere;
    private JFXButton btn_contact;
    @FXML
    private JFXButton btn_login;
    @FXML
    private FontAwesomeIconView icnLogin;
    
    
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        
        
    }
    
     @FXML
    private void paLogin(ActionEvent event) throws IOException {
         System.out.println("this shit");
         System.out.println("jalo");
        FXMLLoader ventana = new FXMLLoader(getClass().getResource("/Login/Login.fxml"));
        Parent root = ventana.load();
        Stage stege = new Stage();
        Scene scene = new Scene(root);
        stege.setScene(scene);
        stege.setTitle("Login| BN Tuchtlan"); // Titulo
        stege.getIcons().add(new Image("appbank_test/imgs/icn.png")); // Logo en el programa
        stege.show();
        
         Stage cerrar;
        cerrar = (Stage)btn_login.getScene().getWindow();
        cerrar.close();
        
    }
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        puntero();
        hand();
      

    }
    
    public void hand(){
   // btn_contact.setCursor(Cursor.HAND);
    //btn_notice.setCursor(Cursor.HAND);
    //btn_service.setCursor(Cursor.HAND);
   // btn_whowere.setCursor(Cursor.HAND);
    btn_login.setCursor(Cursor.HAND);
        
    
}
      //Onda puntero
    public void puntero(){
        JFXRippler rippler = new JFXRippler(Pane_Inicio);
        rippler.setRipplerFill(Paint.valueOf("#000000"/*"#3498db"*/));
        rippler.setRipplerRadius(60);
        rippler.setMaskType(JFXRippler.RipplerMask.RECT);
        APane_Inicio.getChildren().add(rippler);
    }

    

}
