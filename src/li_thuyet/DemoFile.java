package li_thuyet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        File file = new File("folder");
        System.out.println(file.exists());
        System.out.println(file.mkdir());

        File file1 = new File(file, "test.txt");
        if (!file1.exists()) {
            file1.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file1);
        fileWriter.write("avc");
        fileWriter.flush();


    }
}
