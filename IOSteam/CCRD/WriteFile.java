import java.io.*;
import java.io.IOException;
    
    public class WriteFile {
        public static void main(String[] args) {

            try {
                FileWriter fw = new FileWriter("f1.txt");
                fw.write("I am the File Writer");
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
