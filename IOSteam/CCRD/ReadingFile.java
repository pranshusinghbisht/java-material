import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) {
        File file = new File("f1.txt");

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
