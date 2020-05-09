
package Menu_Cliente;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRippler;
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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;


public class MenuClienteController implements Initializable {

    @FXML
    private JFXButton btn_logout;
    private AnchorPane Anchor_Menu;
    private Pane pane_menu;
    @FXML
    private JFXButton btn_EstadoCta;
    @FXML
    private JFXButton btn_pagarServicios;
    @FXML
    private JFXButton btn_transferencia;
    @FXML
    private JFXButton btn_sucursales;
    @FXML
    private JFXButton btn_Ayuda;
    @FXML
    private BorderPane BorderPane;
    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private JFXButton btn_Home;
    @FXML
    private ImageView logo_bank;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        hand();
       // rippler();
      // btn_Home.setDisable(true);
      // btn_Home.setVisible(false);
    }    
    
    public void hand (){
        btn_logout.setCursor(Cursor.HAND);
        btn_Ayuda.setCursor(Cursor.HAND);
        btn_EstadoCta.setCursor(Cursor.HAND);
        btn_pagarServicios.setCursor(Cursor.HAND);
        btn_sucursales.setCursor(Cursor.HAND);
        btn_transferencia.setCursor(Cursor.HAND);
        btn_Home.setCursor(Cursor.HAND);
        
    }
    
    public void cargadepag(String pag){
        Parent root = null;
        
        try {
            root =  FXMLLoader.load(getClass().getResource("/Menu_Cliente/Ventanas/"+pag+".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(MenuClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
        BorderPane.setCenter(root);
        
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
        cerrar = (Stage)btn_logout.getScene().getWindow();
        cerrar.close();
    
    }
    
 /*   
*/

    @FXML
    private void toHome(ActionEvent event) {
         BorderPane.setCenter(pane_menu);
         cargadepag("Home");
    }

    @FXML
    private void ToEstadoCta(ActionEvent event) {
        cargadepag("Estado_cuenta");
    }

    @FXML
    private void ToPagarServicio(ActionEvent event) {
        cargadepag("Pago_Servicios");
    }

    @FXML
    private void ToTransferencia(ActionEvent event) {
        cargadepag("Transferencia");
    }

    @FXML
    private void ToSucursales(ActionEvent event) {
        cargadepag("Sucursales");
    }

    @FXML
    private void toAyuda(ActionEvent event) {
        cargadepag("Ayuda");
    }

    @FXML
    private void BackToInicio(MouseEvent event) {
    }
   
}
