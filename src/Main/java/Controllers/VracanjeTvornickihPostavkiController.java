package Main.java.Controllers;

import Main.java.Service.CsvService;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URISyntaxException;

public class VracanjeTvornickihPostavkiController {


    @FXML
    RadioButton prvaUplatnica;

    @FXML
    RadioButton drugaUplatnica;

    @FXML
    RadioButton trecaUplatnica;
    @FXML
    private javafx.scene.control.Button spremiButton;




    @FXML
    public void vracanjeTvornickihPostavkibutton() throws URISyntaxException, IOException {
        CsvService backup = new CsvService();
        if(prvaUplatnica.isSelected()){
            backup.odabirCSVUplatniceZaSpremanje(backup.odabirCSVUplatniceZaCitanje(4),1);
        }

        if(drugaUplatnica.isSelected()){
            backup.odabirCSVUplatniceZaSpremanje(backup.odabirCSVUplatniceZaCitanje(5),2);
        }

        if(trecaUplatnica.isSelected()){
            backup.odabirCSVUplatniceZaSpremanje(backup.odabirCSVUplatniceZaCitanje(6),3);
        }
        Stage stage = (Stage) spremiButton.getScene().getWindow();
        stage.close();
    }
}
