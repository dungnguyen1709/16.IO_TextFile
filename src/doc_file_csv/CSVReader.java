package doc_file_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) throws IOException {


        String csvFile = "folder/country.csv";
        String line = "";
        String cvsSplitBy = ",";
//        File file = new File("country.csv");
//        file.createNewFile();


        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    }