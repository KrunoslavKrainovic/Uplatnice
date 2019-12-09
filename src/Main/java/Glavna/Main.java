package Main.java.Glavna;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        try {
            BorderPane root = FXMLLoader.load(getClass().getClassLoader().getResource("UiDesign/PocetniEkran.fxml"));
            Scene scene = new Scene(root,384,154);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.getIcons().add(new Image("Icons/Icon.png"));
            root.requestFocus();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    public static void setMainPage(BorderPane root) {
        Stage newWindow = new Stage();
        newWindow.getIcons().add(new Image("Icons/Icon.png"));
        newWindow.initModality(Modality.APPLICATION_MODAL);
        newWindow.setTitle("Upis nove uplatnice");

        Scene scene = new Scene(root,427,353);
        newWindow.setScene(scene);
        newWindow.show();
    }

    public static void setPostavkePage(BorderPane root) {
        Stage newWindow = new Stage();
        newWindow.getIcons().add(new Image("Icons/Icon.png"));
        newWindow.initModality(Modality.APPLICATION_MODAL);
        newWindow.setTitle("Postavke");

        Scene scene = new Scene(root,184,330    );
        newWindow.setScene(scene);
        newWindow.show();
    }

    public static void setPomjeranjePage(BorderPane root) {
        Stage newWindow = new Stage();
        newWindow.getIcons().add(new Image("Icons/Icon.png"));
        newWindow.initModality(Modality.APPLICATION_MODAL);
        newWindow.setTitle("Pomijeranje texta");

        Scene scene = new Scene(root,102,157);
        newWindow.setScene(scene);
        newWindow.show();
    }

    public static void setVracanjeTvornickihPostavkiPage(BorderPane root) {
        Stage newWindow = new Stage();
        newWindow.getIcons().add(new Image("Icons/Icon.png"));
        newWindow.initModality(Modality.APPLICATION_MODAL);
        newWindow.setTitle("Vraćanje tvorničkih postavki");

        Scene scene = new Scene(root,216,180    );
        newWindow.setScene(scene);
        newWindow.show();
    }

    public static void setInfoPage(BorderPane root) {
        Stage newWindow = new Stage();
        newWindow.getIcons().add(new Image("Icons/Icon.png"));
        newWindow.initModality(Modality.APPLICATION_MODAL);
        newWindow.setTitle("O programu");

        Scene scene = new Scene(root,349,129    );
        newWindow.setScene(scene);
        newWindow.show();
    }

}
