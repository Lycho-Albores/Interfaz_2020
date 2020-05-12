
package Menu_Cliente.Ventanas;

import Login.Login_Controller;
import clases.Usuario;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javax.swing.JLabel;


public class Estado_cuentaController implements Initializable {

    @FXML
    private ImageView logo_bank;
    @FXML
    private JFXButton btn_Actualizar;
    
    private JLabel etiqueta = new JLabel("texto");
    @FXML
    private Label usuario = new Label();
    
    static String auxiliar="";

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       usuario.setText(auxiliar);
    }    

    @FXML
    private void BackToInicio(MouseEvent event) {
        
    }

    @FXML
    private void Actualizar_EstadoCuenta(ActionEvent event) {
        System.out.println(auxiliar);
    }
    
    public void setText(String texto){
        auxiliar = texto;
    }
    
}
