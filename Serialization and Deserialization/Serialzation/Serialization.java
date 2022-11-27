package Serialzation;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FileOutputStream fas = null;
        try {
            fas = new FileOutputStream("file.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fas);

            Doctor doc = new Doctor(25, "Pranshu");

            oos.writeObject(doc);
            System.out.println("Object Serialized Saved");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("File not found or Not available");
        }
    }
}
