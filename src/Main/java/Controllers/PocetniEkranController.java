package Main.java.Controllers;
import Main.java.Service.DrawingService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import Main.java.Glavna.Main;
import java.io.IOException;




public class PocetniEkranController {


    @FXML
    public void prvaUplatnicaButton(){
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/UnosPrveUplatnice.fxml"));
            Main.setMainPage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
        DrawingService brojUplatnice = new DrawingService();
        brojUplatnice.setBrojUplatnice(1);

    }

    @FXML
    public void drugeUplatnicaButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/UnosDrugeUplatnice.fxml"));
            Main.setMainPage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
        DrawingService brojUplatnice = new DrawingService();
        brojUplatnice.setBrojUplatnice(2);

    }

    @FXML
    public void treceUplatnicaButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/UnosTreceUplatnice.fxml"));
            Main.setMainPage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
        DrawingService brojUplatnice = new DrawingService();
        brojUplatnice.setBrojUplatnice(3);

    }

    @FXML
    public void postavkeButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/Postavke.fxml"));
            Main.setPostavkePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void VracanjetvornickihpostavkiButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/VracanjeTvornickihPostavki.fxml"));
            Main.setVracanjeTvornickihPostavkiPage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void InfoButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/Info.fxml"));
            Main.setInfoPage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
