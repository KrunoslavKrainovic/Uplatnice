package Main.java.Service;
import Main.java.Model.DTPozicija;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;


public class DrawingService {


        private static Integer brojUplatnice = 0;
        private static String racunprimatelja = "HR1210010051863000160";
        private static String imePrimatelja1Dio = "Državni proračun";
        private static String imePrimatelja2Dio =  "Republike Hrvatske";


    public void prvaUplatnica(String imeIPrezime, String adresa, String gradIPostanskibroj, String iznos, String model, String brojPrimatelja, String opisPlacanja, String iznosIvaluta, String racunPrimatelja, String modelIPozivPrimatelja) throws IOException, URISyntaxException {
        CsvService pisanje = new CsvService();
        final BufferedImage image = ImageIO.read(new File(pisanje.getLocationOfCSVOutsideOfJar() + "/Images/praznaUplatnica.jpg"));


        List<DTPozicija> pozicije = pisanje.odabirCSVUplatniceZaCitanje(brojUplatnice);

        Graphics prvaUplatnica = image.getGraphics();
        prvaUplatnica.setFont(prvaUplatnica.getFont().deriveFont(30f));
        prvaUplatnica.setColor(Color.BLACK);
        prvaUplatnica.drawString(imeIPrezime, pozicije.get(0).getPozicijaPoX(), pozicije.get(0).getPozicijaPoY());
        prvaUplatnica.drawString(adresa, pozicije.get(1).getPozicijaPoX(), pozicije.get(1).getPozicijaPoY());
        prvaUplatnica.drawString(gradIPostanskibroj, pozicije.get(2).getPozicijaPoX(), pozicije.get(2).getPozicijaPoY());
        prvaUplatnica.drawString(iznos, pozicije.get(3).getPozicijaPoX(), pozicije.get(3).getPozicijaPoY());
        prvaUplatnica.drawString(racunprimatelja, pozicije.get(11).getPozicijaPoX(), pozicije.get(11).getPozicijaPoY());
        prvaUplatnica.drawString(model, pozicije.get(4).getPozicijaPoX(), pozicije.get(4).getPozicijaPoY());
        prvaUplatnica.drawString(brojPrimatelja, pozicije.get(5).getPozicijaPoX(), pozicije.get(5).getPozicijaPoY());
        prvaUplatnica.drawString(opisPlacanja, pozicije.get(6).getPozicijaPoX(), pozicije.get(6).getPozicijaPoY());
        prvaUplatnica.drawString(iznosIvaluta, pozicije.get(7).getPozicijaPoX(), pozicije.get(7).getPozicijaPoY());
        prvaUplatnica.drawString(racunPrimatelja, pozicije.get(8).getPozicijaPoX(), pozicije.get(8).getPozicijaPoY());
        prvaUplatnica.drawString(racunprimatelja, pozicije.get(12).getPozicijaPoX(), pozicije.get(12).getPozicijaPoY());
        prvaUplatnica.drawString(modelIPozivPrimatelja, pozicije.get(9).getPozicijaPoX(), pozicije.get(9).getPozicijaPoY());
        prvaUplatnica.setFont(prvaUplatnica.getFont().deriveFont(50f));
        prvaUplatnica.drawString(imePrimatelja1Dio, pozicije.get(13).getPozicijaPoX(), pozicije.get(13).getPozicijaPoY());
        prvaUplatnica.drawString(imePrimatelja2Dio, pozicije.get(14).getPozicijaPoX(), pozicije.get(14).getPozicijaPoY());
        prvaUplatnica.drawString(opisPlacanja, pozicije.get(10).getPozicijaPoX(), pozicije.get(10).getPozicijaPoY());
        prvaUplatnica.dispose();

        ImageIO.write(image, "jpg", new File(pisanje.getLocationOfCSVOutsideOfJar() + "/Images/prvaUplatnica.jpg"));

    }




    public void drugaUplatnica(String imeIPrezime,String adresa,String gradIPostanskibroj,String iznos,String model,String brojPrimatelja,String opisPlacanja,String iznosIvaluta,String racunPrimatelja,String modelIPozivPrimatelja) throws IOException, URISyntaxException {
        CsvService pisanje = new CsvService();
        final BufferedImage image = ImageIO.read(new File(pisanje.getLocationOfCSVOutsideOfJar() + "/Images/prvaUplatnica.jpg"));


        List<DTPozicija> pozicije = pisanje.odabirCSVUplatniceZaCitanje(brojUplatnice);


        Graphics drugaUplatnica = image.getGraphics();
        drugaUplatnica.setFont(drugaUplatnica.getFont().deriveFont(30f));
        drugaUplatnica.setColor(Color.BLACK);
        drugaUplatnica.drawString(imeIPrezime, pozicije.get(0).getPozicijaPoX(), pozicije.get(0).getPozicijaPoY());
        drugaUplatnica.drawString(adresa,  pozicije.get(1).getPozicijaPoX(), pozicije.get(1).getPozicijaPoY());
        drugaUplatnica.drawString(gradIPostanskibroj,  pozicije.get(2).getPozicijaPoX(), pozicije.get(2).getPozicijaPoY());
        drugaUplatnica.drawString(iznos,  pozicije.get(3).getPozicijaPoX(), pozicije.get(3).getPozicijaPoY());
        drugaUplatnica.drawString(racunprimatelja, pozicije.get(11).getPozicijaPoX(), pozicije.get(11).getPozicijaPoY());
        drugaUplatnica.drawString(model,  pozicije.get(4).getPozicijaPoX(), pozicije.get(4).getPozicijaPoY());
        drugaUplatnica.drawString(brojPrimatelja, pozicije.get(5).getPozicijaPoX(), pozicije.get(5).getPozicijaPoY());
        drugaUplatnica.drawString(opisPlacanja, pozicije.get(6).getPozicijaPoX(), pozicije.get(6).getPozicijaPoY());
        drugaUplatnica.drawString(iznosIvaluta, pozicije.get(7).getPozicijaPoX(), pozicije.get(7).getPozicijaPoY());
        drugaUplatnica.drawString(racunPrimatelja, pozicije.get(8).getPozicijaPoX(), pozicije.get(8).getPozicijaPoY());
        drugaUplatnica.drawString(racunprimatelja, pozicije.get(12).getPozicijaPoX(), pozicije.get(12).getPozicijaPoY());
        drugaUplatnica.drawString(modelIPozivPrimatelja, pozicije.get(9).getPozicijaPoX(), pozicije.get(9).getPozicijaPoY());
        drugaUplatnica.setFont(drugaUplatnica.getFont().deriveFont(50f));
        drugaUplatnica.drawString(imePrimatelja1Dio, pozicije.get(13).getPozicijaPoX(), pozicije.get(13).getPozicijaPoY());
        drugaUplatnica.drawString(imePrimatelja2Dio, pozicije.get(14).getPozicijaPoX(), pozicije.get(14).getPozicijaPoY());
        drugaUplatnica.drawString(opisPlacanja, pozicije.get(10).getPozicijaPoX(), pozicije.get(10).getPozicijaPoY());
        drugaUplatnica.dispose();

        ImageIO.write(image, "jpg", new File(pisanje.getLocationOfCSVOutsideOfJar() + "/Images/drugaUplatnica.jpg"));

    }

    public void trecaUplatnica(String imeIPrezime,String adresa,String gradIPostanskibroj,String iznos,String model,String brojPrimatelja,String opisPlacanja,String iznosIvaluta,String racunPrimatelja,String modelIPozivPrimatelja) throws IOException, URISyntaxException {
        CsvService pisanje = new CsvService();
        final BufferedImage image = ImageIO.read(new File(pisanje.getLocationOfCSVOutsideOfJar() + "/Images/drugaUplatnica.jpg"));

        List<DTPozicija> pozicije = pisanje.odabirCSVUplatniceZaCitanje(brojUplatnice);


        Graphics trecaUplatnica = image.getGraphics();
        trecaUplatnica.setFont(trecaUplatnica.getFont().deriveFont(30f));
        trecaUplatnica.setColor(Color.BLACK);
        trecaUplatnica.drawString(imeIPrezime, pozicije.get(0).getPozicijaPoX(), pozicije.get(0).getPozicijaPoY());
        trecaUplatnica.drawString(adresa,  pozicije.get(1).getPozicijaPoX(), pozicije.get(1).getPozicijaPoY());
        trecaUplatnica.drawString(gradIPostanskibroj,  pozicije.get(2).getPozicijaPoX(), pozicije.get(2).getPozicijaPoY());
        trecaUplatnica.drawString(iznos,  pozicije.get(3).getPozicijaPoX(), pozicije.get(3).getPozicijaPoY());
        trecaUplatnica.drawString(racunprimatelja, pozicije.get(11).getPozicijaPoX(), pozicije.get(11).getPozicijaPoY());
        trecaUplatnica.drawString(model,  pozicije.get(4).getPozicijaPoX(), pozicije.get(4).getPozicijaPoY());
        trecaUplatnica.drawString(brojPrimatelja, pozicije.get(5).getPozicijaPoX(), pozicije.get(5).getPozicijaPoY());
        trecaUplatnica.drawString(opisPlacanja, pozicije.get(6).getPozicijaPoX(), pozicije.get(6).getPozicijaPoY());
        trecaUplatnica.drawString(iznosIvaluta, pozicije.get(7).getPozicijaPoX(), pozicije.get(7).getPozicijaPoY());
        trecaUplatnica.drawString(racunPrimatelja, pozicije.get(8).getPozicijaPoX(), pozicije.get(8).getPozicijaPoY());
        trecaUplatnica.drawString(racunprimatelja, pozicije.get(12).getPozicijaPoX(), pozicije.get(12).getPozicijaPoY());
        trecaUplatnica.drawString(modelIPozivPrimatelja, pozicije.get(9).getPozicijaPoX(), pozicije.get(9).getPozicijaPoY());
        trecaUplatnica.setFont(trecaUplatnica.getFont().deriveFont(50f));
        trecaUplatnica.drawString(imePrimatelja1Dio, pozicije.get(13).getPozicijaPoX(), pozicije.get(13).getPozicijaPoY());
        trecaUplatnica.drawString(imePrimatelja2Dio, pozicije.get(14).getPozicijaPoX(), pozicije.get(14).getPozicijaPoY());
        trecaUplatnica.drawString(opisPlacanja, pozicije.get(10).getPozicijaPoX(), pozicije.get(10).getPozicijaPoY());
        trecaUplatnica.dispose();

        File desktopDir = new File(System.getProperty("user.home"), "Desktop");
        String pathToDesktop = desktopDir.getPath();
        ImageIO.write(image, "jpg", new File(pathToDesktop+System.getProperty("file.separator")+"print.jpg"));

    }

    public void setRacunprimatelja(String racunprimatelja) {
        DrawingService.racunprimatelja = racunprimatelja;
    }

    public void setImePrimatelja1Dio(String imePrimatelja1Dio) {
        DrawingService.imePrimatelja1Dio = imePrimatelja1Dio;
    }

    public void setImePrimatelja2Dio(String imePrimatelja2Dio) {
        DrawingService.imePrimatelja2Dio = imePrimatelja2Dio;
    }

    public void setBrojUplatnice(Integer brojUplatnice) {
       DrawingService.brojUplatnice = brojUplatnice;
    }

    public Integer getBrojUplatnice() {
        return brojUplatnice;
    }

    public static String getRacunprimatelja() {
        return racunprimatelja;
    }

    public static String getImePrimatelja1Dio() {
        return imePrimatelja1Dio;
    }

    public static String getImePrimatelja2Dio() {
        return imePrimatelja2Dio;
    }

}
