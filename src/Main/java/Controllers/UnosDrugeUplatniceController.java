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



public class UnosDrugeUplatniceController {

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
    public void printanjeDrugeUplatnice() throws IOException, URISyntaxException {
        DrawingService upisDrugeUplatnice = new DrawingService();
        upisDrugeUplatnice.drugaUplatnica(imeIPrezime.getText(),adresa.getText(),gradIPostanskibroj.getText(),iznos.getText(),model.getText(),brojPrimatelja.getText(),opisPlacanja.getText(),valutaIIznos.getText(),racunPrimatelja.getText(),modelIBrojPrimatelja.getText());
        Stage stage = (Stage) spremiButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void pomijeranjeTextaImeIPrezimeButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomijeranjeTextaImeIPrezime.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomijeranjeTextaAdresaButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomijeranjeTextaAdresa.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomijeranjeTextaGradIPostanskibrojButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomijeranjeTextaGradIPostanskibroj.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomijeranjeTextaIzosButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomijeranjeTextaIznos.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomijeranjeTextaModelButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomijeranjeTextaModel.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomijeranjeTextaBrojPrimateljaButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomijeranjeTextaBrojPrimatelja.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomijeranjeTextaOpisPlacanjaButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomijeranjeTextaOpisPlacanja.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomijeranjeTextaIznosIValutaButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomijeranjeTextaIznosIValuta.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomijeranjeTextaRacunPrimateljaButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomijeranjeTextaRacunPrimatelja.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomijeranjeTextaModelIPozivPrimateljaButton() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomijeranjeTextaModelIPozivPrimatelja.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void pomijeranjeTextaOpisPlacanjaDesniDio() {
        BorderPane root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PomijeranjeTextaOpisPlacanjaDesniDio.fxml"));
            Main.setPomjeranjePage(root);
            root.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
