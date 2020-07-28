package li_thuyet;

import java.io.FileWriter;
import java.io.IOException;

public class WriteATextFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Hello.txt");
            writer.write("Hello!");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

//        String toSplit = "50,Zombie,teeth,hands";
//        String[] results = toSplit.split(",");
//        for (String token : results) {
//            System.out.println(token);
        }
    }
