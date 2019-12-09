package Main.java.Service;
import Main.java.Model.DTPozicija;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class OdabirControllera {



        @FXML
        public void odabirPlacehooldera(Integer odabirUplatnice,Integer odabirSekcije,TextField pomijeranjePoX,TextField pomijeranjePoY) throws URISyntaxException {
            CsvService pisanje = new CsvService();
            DrawingService brojUplatnice = new DrawingService();

            if(odabirUplatnice.equals(1)){
                List<DTPozicija> pozicije = pisanje.odabirCSVUplatniceZaCitanje(brojUplatnice.getBrojUplatnice());
                    pomijeranjePoX.setPromptText(pozicije.get(odabirSekcije).getPozicijaPoX().toString());
                    pomijeranjePoY.setPromptText(pozicije.get(odabirSekcije).getPozicijaPoY().toString());
            }

            else if(odabirUplatnice.equals(2)){
                List<DTPozicija> pozicije = pisanje.odabirCSVUplatniceZaCitanje(brojUplatnice.getBrojUplatnice());
                    pomijeranjePoX.setPromptText(pozicije.get(odabirSekcije).getPozicijaPoX().toString());
                    pomijeranjePoY.setPromptText(pozicije.get(odabirSekcije).getPozicijaPoY().toString());
            }
            else if(odabirUplatnice.equals(3)){
                List<DTPozicija> pozicije = pisanje.odabirCSVUplatniceZaCitanje(brojUplatnice.getBrojUplatnice());
                    pomijeranjePoX.setPromptText(pozicije.get(odabirSekcije).getPozicijaPoX().toString());
                    pomijeranjePoY.setPromptText(pozicije.get(odabirSekcije).getPozicijaPoY().toString());
            }
        }




    public void spremanjeSekcije(Integer odabirSekcije,TextField pomijeranjePoX,TextField pomijeranjePoY) throws IOException, URISyntaxException {
        CsvService pisanje = new CsvService();
        DrawingService brojUplatnice = new DrawingService();
       List<DTPozicija> pozicije = pisanje.odabirCSVUplatniceZaCitanje(brojUplatnice.getBrojUplatnice());
        pozicije.get(odabirSekcije).setPozicijaPoX(pomijeranjePoX.getText());
        pozicije.get(odabirSekcije).setPozicijaPoY(pomijeranjePoY.getText());
        pisanje.odabirCSVUplatniceZaSpremanje(pozicije,brojUplatnice.getBrojUplatnice());
    }
}
