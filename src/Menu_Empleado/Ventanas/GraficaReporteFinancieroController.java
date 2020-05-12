/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_empleado_ventanas;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.chart.LineChart;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author theso
 */
public class GraficaReporteFinancieroController implements Initializable {

    @FXML
    private LineChart<?, ?> Reporte;
    @FXML
    private JFXButton btn_back;
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

    @FXML
    private void backToMenu(ActionEvent event) {
        Stage cerrar;
        cerrar = (Stage)btn_back.getScene().getWindow();
        cerrar.close();
    }
    
    public void manita(){
        btn_back.setCursor(Cursor.HAND);
        btn_generar.setCursor(Cursor.HAND);
    }
}
