package Main.java.Controllers;
import Main.java.Glavna.Main;
import Main.java.Service.DrawingService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;

public class PostavkeController {


    @FXML
    TextField racunPrimatelja;
    @FXML
    TextField imePrimatelja1;
    @FXML
    TextField imePrimatelja2;
    @FXML
    RadioButton prvaUplatnica;
    @FXML
    RadioButton drugaUplatnica;
    @FXML
    RadioButton trecaUplatnica;
    @FXML
    private javafx.scene.control.Button spremiButton;

    DrawingService odabirUplatnice = new DrawingService();

    @FXML
    public void initialize() {
        racunPrimatelja.setPromptText(DrawingService.getRacunprimatelja());
        imePrimatelja1.setPromptText(DrawingService.getImePrimatelja1Dio());
        imePrimatelja2.setPromptText(DrawingService.getImePrimatelja2Dio());
    }

    @FXML
    public void odabirUplatnice(){

            if (prvaUplatnica.isSelected()) {
                odabirUplatnice.setBrojUplatnice(1);
                 }
            else if (drugaUplatnica.isSelected()) {
                odabirUplatnice.setBrojUplatnice(2);
                }
            else if (trecaUplatnica.isSelected()) {
                odabirUplatnice.setBrojUplatnice(3);
                }

    }

    @FXML
    public void spremanjeUPostavkebutton() {
        DrawingService spremanjeUPostavkebutton = new DrawingService();
        spremanjeUPostavkebutton.setImePrimatelja1Dio(imePrimatelja1.getText());
        spremanjeUPostavkebutton.setImePrimatelja2Dio(imePrimatelja2.getText());
        spremanjeUPostavkebutton.setRacunprimatelja(racunPrimatelja.getText());
        Stage stage = (Stage) spremiButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void PomjeranjeTextaPostavkeRacunPrimatelja() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomjeranjeTextaPostavkeRacunPrimatelja.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void PomjeranjeTextaPostavkeImePrimateljaPrimateljaPrviDio() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomjeranjeTextaPostavkeImePrimateljaPrviDio.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void PomjeranjeTextaPostavkeImePrimateljaPrimateljaDrugiDio() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomjeranjeTextaPostavkeImePrimateljaDrugiDio.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






}
