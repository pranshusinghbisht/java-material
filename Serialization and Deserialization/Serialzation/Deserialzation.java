package Serialzation;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialzation{
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("file.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            Doctor doc = (Doctor)obj;
//            System.out.println(obj);
            System.out.println("Doctor name and Id is below");
            doc.display();
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("File Not Found");
        }
    }
}
