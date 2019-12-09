 package Main.java.Service;
 import Main.java.Glavna.Main;
 import Main.java.Model.DTPozicija;
 import com.opencsv.*;
 import java.io.*;
 import java.net.URISyntaxException;
 import java.util.ArrayList;
 import java.util.List;

 public class  CsvService {

     public  CsvService(){}



     public String getLocationOfCSVOutsideOfJar() throws URISyntaxException {
         File jarFile = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
         String inputFilePath = jarFile.getParent() + File.separator;
         System.out.println(inputFilePath);
         return inputFilePath;
     }

     public List<DTPozicija> odabirCSVUplatniceZaCitanje(Integer brojUplatnice) throws URISyntaxException {
         List<DTPozicija> arrayPozicijaTexta;

         if(brojUplatnice.equals(1)){
             arrayPozicijaTexta = readCSVData(getLocationOfCSVOutsideOfJar() + "/Config/DBPozicijaPrvaUplatnica.csv");
         }
         else if(brojUplatnice.equals(2)){
             arrayPozicijaTexta = readCSVData(getLocationOfCSVOutsideOfJar() + "/Config/DBPozicijaDrugaUplatnica.csv");
         }

         else if(brojUplatnice.equals(3)) {
             arrayPozicijaTexta = readCSVData(getLocationOfCSVOutsideOfJar() + "/Config/DBPozicijaTrecaUplatnica.csv");
         }
         else if(brojUplatnice.equals(4)) {
             arrayPozicijaTexta = readCSVData(getLocationOfCSVOutsideOfJar() + "/Backup/DBPozicijaPrvaUplatnica.csv");
         }

         else if(brojUplatnice.equals(5)) {
             arrayPozicijaTexta = readCSVData(getLocationOfCSVOutsideOfJar() + "/Backup/DBPozicijaDrugaUplatnica.csv");
         }

         else {
             arrayPozicijaTexta = readCSVData(getLocationOfCSVOutsideOfJar() + "/Backup/DBPozicijaTrecaUplatnica.csv");
         }
         return arrayPozicijaTexta;
     }

     private List<DTPozicija> readCSVData(String lokacija) {
         List<DTPozicija> pozicije = new ArrayList<>();

         try {

             File f = new File(lokacija);
             BufferedReader br = new BufferedReader(new FileReader(f));


             CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

             CSVReader csvReader = new CSVReaderBuilder(br)
                     .withCSVParser(parser)
                     .build();

             List<String[]> allData = csvReader.readAll();

             for (int i = 0; i < allData.size(); i++) {
                 String[] row = allData.get(i);
                 DTPozicija pozicija = new DTPozicija();
                 for (int j = 0; j < 2; j++) {
                     if (j == 0) {
                         pozicija.setPozicijaPoX(row[j]);
                     } else if (j == 1) {
                         pozicija.setPozicijaPoY(row[j]);
                         pozicije.add(pozicija);
                     }
                 }
             }
         } catch (Exception e) {
             e.printStackTrace();
         }

         return pozicije;

     }

     private String vracanjeLokacijeCSVFile(Integer brojUplatnice) throws URISyntaxException {
         String rezultat = null;

        if (brojUplatnice.equals(1)){
            rezultat = getLocationOfCSVOutsideOfJar() + "/Config/DBPozicijaPrvaUplatnica.csv";
        }
        else if (brojUplatnice.equals(2)){
            rezultat = getLocationOfCSVOutsideOfJar() + "/Config/DBPozicijaDrugaUplatnica.csv";
        }
        else if (brojUplatnice.equals(3)){
            rezultat = getLocationOfCSVOutsideOfJar() + "/Config/DBPozicijaTrecaUplatnica.csv";
        }

         return rezultat;
     }

     public void  odabirCSVUplatniceZaSpremanje(List<DTPozicija>  entries ,Integer brojUplatnice) throws IOException, URISyntaxException {

             saveCSVData(entries,vracanjeLokacijeCSVFile(brojUplatnice));

     }


     private void saveCSVData(List<DTPozicija> entries, String lokacija) throws IOException {

         List<String[]> array = convertArray(entries);
         CSVWriter writer = new CSVWriter(new FileWriter(lokacija), ';', CSVWriter.NO_QUOTE_CHARACTER);

         for (int i = 0; i < array.size(); i++) {
             writer.writeNext(array.get(i));
         }

         writer.close();
     }

    private List<String[]> convertArray(List<DTPozicija> entries){
         List<String[]> returnArray = new ArrayList<>();
        for (int i = 0; i < entries.size(); i++) {
            String [] array = new String[2];
            array[0]  = entries.get(i).getPozicijaPoX().toString();
            array[1]  = entries.get(i).getPozicijaPoY().toString();
            returnArray.add(array);
        }
         return returnArray;
    }


}
