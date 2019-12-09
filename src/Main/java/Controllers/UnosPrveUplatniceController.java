package Main.java.Controllers;

import Main.java.Glavna.Main;
import Main.java.Service.DrawingService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URISyntaxException;



public class UnosPrveUplatniceController {

    @FXML
    TextField imeIPrezime;
    @FXML
    TextField adresa;
    @FXML
    TextField gradIPostanskibroj;
    @FXML
    TextField iznos;
    @FXML
    TextField model;
    @FXML
    TextField brojPrimatelja;
    @FXML
    TextField opisPlacanja;
    @FXML
    TextField valutaIIznos;
    @FXML
    TextField racunPrimatelja;
    @FXML
    TextField modelIBrojPrimatelja;

    @FXML
    private javafx.scene.control.Button spremiButton;


    @FXML
    public void initialize() {
        imeIPrezime.setPromptText("Ime i Prezime");
        adresa.setPromptText("Adresa");
        gradIPostanskibroj.setPromptText("Grad i postanski broj");
        iznos.setPromptText("Iznos");
        model.setPromptText("Model");
        brojPrimatelja.setPromptText("Broj primatelja");
        opisPlacanja.setPromptText("Opis placanja");
        valutaIIznos.setPromptText("Valuta i iznos");
        racunPrimatelja.setPromptText("Racun primatelja");
        modelIBrojPrimatelja.setPromptText("Model i broj primatelja");
    }


     @FXML
    public void printanjePrveUplatnice() throws IOException, URISyntaxException {
        DrawingService upisPrveUplatnice = new DrawingService();
        upisPrveUplatnice.prvaUplatnica(imeIPrezime.getText(),adresa.getText(),gradIPostanskibroj.getText(),iznos.getText(),model.getText(),brojPrimatelja.getText(),opisPlacanja.getText(),valutaIIznos.getText(),racunPrimatelja.getText(),modelIBrojPrimatelja.getText());
         Stage stage = (Stage) spremiButton.getScene().getWindow();
         stage.close();
    }

    @FXML
    public void pomjeranjeTextaImeIPrezimeButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomjeranjeTextaImeIPrezime.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomjeranjeTextaAdresaButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomjeranjeTextaAdresa.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomjeranjeTextaGradIPostanskibrojButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomjeranjeTextaGradIPostanskibroj.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomjeranjeTextaIzosButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomjeranjeTextaIznos.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomjeranjeTextaModelButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomjeranjeTextaModel.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomjeranjeTextaBrojPrimateljaButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomjeranjeTextaBrojPrimatelja.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomjeranjeTextaOpisPlacanjaButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomjeranjeTextaOpisPlacanja.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomjeranjeTextaIznosIValutaButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomjeranjeTextaIznosIValuta.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomjeranjeTextaRacunPrimateljaButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomjeranjeTextaRacunPrimatelja.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomjeranjeTextaModelIPozivPrimateljaButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomjeranjeTextaModelIPozivPrimatelja.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomjeranjeTextaOpisPlacanjaDesniDio() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomjeranjeTextaOpisPlacanjaDesniDio.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
