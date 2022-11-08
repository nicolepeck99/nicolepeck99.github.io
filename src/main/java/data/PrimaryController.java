package data;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.fxml.FXML;

public class PrimaryController{
//our home page

    public static Map<String, List<NewPerson>> colorsToPeople = new HashMap<>(Scan.parse("src/main/java/data/project-data.txt"));
    

    //green
    @FXML
    private void switchToGreen() throws IOException {
        App.setRoot("green");
    }

    //yellow
    @FXML
    private void switchToYellow() throws IOException{
        App.setRoot("yellow");
    }

    //blue
    @FXML
    private void switchToBlue() throws IOException{
        App.setRoot("blue");
    }

    //indigo
    @FXML
    private void switchToIndigo() throws IOException{
        App.setRoot("indigo");
    }

    //violet
    @FXML
    private void switchToViolet() throws IOException{
        App.setRoot("violet");
    }

    //orange
    @FXML
    private void switchToOrange() throws IOException{
        App.setRoot("orange");
    }

    //red
    @FXML
    private void switchToRed() throws IOException{
        App.setRoot("red");
    }

    //surprise
    @FXML
    private void switchToSurprise() throws IOException{
        App.setRoot("surprise");
    }

    


}
