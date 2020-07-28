package li_thuyet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class ReadATextFile {
    public static void main(String[] args) {
        try {
            File inFile = new File("Hello.txt");
            FileReader reader = new FileReader(inFile);

            BufferedReader reader1 = new BufferedReader(reader);

            String line = null;

            while ((line = reader1.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String toSplit = "50,Zombie,teeth,hands";
        String[] results = toSplit.split(",");
        int count = 0;
        for (String token : results)
            System.out.println(token);
        count++;

        System.out.println(results.length);
    }
}

