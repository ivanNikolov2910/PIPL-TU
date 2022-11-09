package lectures.lec6;

import java.io.*;

public class CopyFile {
    private static final String SRC_NAME = System.getProperty("user.dir") + "\\src\\lectures\\lec6\\src.txt";
    private static final String OUT_NAME = System.getProperty("user.dir") + "\\src\\lectures\\lec6\\out.txt";

    public static void main(String[] args) {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader(SRC_NAME));
            outputStream = new PrintWriter(new FileWriter(OUT_NAME));
            String line;
            while ((line = inputStream.readLine()) != null){
                outputStream.println(line);
            }
            inputStream.close();
            outputStream.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
