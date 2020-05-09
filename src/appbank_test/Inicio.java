
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

    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
