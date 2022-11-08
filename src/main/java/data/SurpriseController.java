package data;

import java.io.File;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class SurpriseController{
   
    
    // @FXML
    // private ImageView imageview;


    // public void initialize() {
    //         Image i = new Image(new File("src/main/java/data/rainbow.gif").toURI().toString());
    //         imageview.setImage(i);
    // }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
