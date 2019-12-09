package Main.java.Controllers;

import Main.java.Service.DrawingService;
import Main.java.Service.OdabirControllera;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URISyntaxException;


public class PomjeranjeTextaPostavkeImePrimateljaDrugiDioController {
    @FXML
    TextField pomjeranjePoX;
    @FXML
    TextField pomjeranjePoY;
    @FXML
    private javafx.scene.control.Button spremiButton;

    OdabirControllera odabirControllera = new OdabirControllera();
    DrawingService brojUplatnice = new DrawingService();

    @FXML
    public void initialize() throws URISyntaxException {
      odabirControllera.odabirPlacehooldera(brojUplatnice.getBrojUplatnice(),14, pomjeranjePoX, pomjeranjePoY);
    }
    @FXML
    public void spremanjePozicije() throws IOException, URISyntaxException {
        odabirControllera.spremanjeSekcije(14, pomjeranjePoX, pomjeranjePoY);
        Stage stage = (Stage) spremiButton.getScene().getWindow();
        stage.close();
    }
}
