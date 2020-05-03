/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbank_test;

import static java.time.Clock.system;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Lycho
 */
public class Inicio extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML_Inicio.fxml"));
        
        Scene scene = new Scene(root);
        //stage.initStyle(StageStyle.TRANSPARENT); //Hacer transparente la barra superior.
        stage.setTitle("Inicio | BN Tuchtlan"); // Titulo
        stage.getIcons().add(new Image("appbank_test/imgs/icn.png")); // Logo en el programa
        stage.setScene(scene);
        stage.show();
      
        //Isaias Grajales Velazquez
       //Hola Isaias mi nombre es ulises arreola albores
      // otra nota
      //probando los cambios!
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
