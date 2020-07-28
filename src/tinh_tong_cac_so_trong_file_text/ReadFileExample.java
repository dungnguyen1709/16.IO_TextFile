package tinh_tong_cac_so_trong_file_text;

import java.io.*;


public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader( new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null ){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("sum = " + sum);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText("folder/number.txt");
    }
}
