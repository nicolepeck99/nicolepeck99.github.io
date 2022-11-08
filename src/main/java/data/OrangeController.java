package data;

import static data.PrimaryController.colorsToPeople;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class OrangeController{
        

    @FXML
    public TextArea text;
    //make uneditable 


    public void initialize(){
        for (NewPerson r : colorsToPeople.get("orange")) {
            text.appendText(String.valueOf(r.name + " \n"));
        }
    }


    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
