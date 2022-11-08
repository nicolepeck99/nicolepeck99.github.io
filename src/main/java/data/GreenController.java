package data;

import static data.PrimaryController.colorsToPeople;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;



public class GreenController{

    // private void Display() throws IOException{
    //     for (NewPerson r : Scan.colorsToPeople.get("green")) {
    //         System.out.println(r.name +", "+ r.company +", "+ r.date);
    //      }
    // }
    
    @FXML
    public TextArea text;
    //make uneditable 


    public void initialize(){
        for (NewPerson r : colorsToPeople.get("green")) {
            text.appendText(String.valueOf(r.name + " \n"));
        }
    }


    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
        //System.out.println("Hello world");
        //mainLabel.setText("ghdijshvjbksbdhqwvjsc");  
    }



}