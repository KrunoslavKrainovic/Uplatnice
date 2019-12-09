package Main.java.Controllers;
import Main.java.Service.DrawingService;
import Main.java.Service.OdabirControllera;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URISyntaxException;




public class PomijeranjeTextaAdresaController {


    @FXML
    TextField pomijeranjePoX;
    @FXML
    TextField pomijeranjePoY;
    @FXML
    private javafx.scene.control.Button spremiButton;

    OdabirControllera odabirControllera = new OdabirControllera();
    DrawingService brojUplatnice = new DrawingService();

    @FXML
    public void initialize() throws URISyntaxException {
       odabirControllera.odabirPlacehooldera(brojUplatnice.getBrojUplatnice(),1,pomijeranjePoX,pomijeranjePoY);
    }
    @FXML
    public void spremanjePozicije() throws IOException, URISyntaxException {
        odabirControllera.spremanjeSekcije(1,pomijeranjePoX,pomijeranjePoY);
        Stage stage = (Stage) spremiButton.getScene().getWindow();
        stage.close();
    }
}
