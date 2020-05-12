/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_empleado_ventanas;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author theso
 */
public class Reporte_FinancieroController implements Initializable {
    @FXML
    private TableView<?> TablaReporte;
    @FXML
    private Label lblCantidad;
    @FXML
    private JFXButton btn_consultar;
    @FXML
    private JFXButton btn_grafica;
    @FXML
    private JFXDatePicker periodo1;
    @FXML
    private JFXDatePicker periodo2;

    /**
     * Initializes the controller class.
     */
   
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        manita();
    }    
public void manita(){
    btn_consultar.setCursor(Cursor.HAND);
    btn_grafica.setCursor(Cursor.HAND);
}

    @FXML
    private void goToGrafica(ActionEvent event) throws IOException {
      FXMLLoader ventana = new FXMLLoader(getClass().getResource("/Menu_Empleado/Ventanas/GraficaReporteFinanciero.fxml"));
        Parent root = ventana.load();
        Stage stege = new Stage();
        Scene scene = new Scene(root);
        stege.setScene(scene);
        stege.setTitle("Gráfica| BN Tuchtlan"); // Titulo
        stege.getIcons().add(new Image("appbank_test/imgs/icn.png")); // Logo en el programa
        stege.show();
        
       /*  Stage cerrar;
        cerrar = (Stage)btn_grafica.getScene().getWindow();
        cerrar.close();
       */
}

    @FXML
    private void consultar1(ActionEvent event) {
    }
    
}
