import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

    File f1 = new File("f1.txt");
        try {
            f1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
