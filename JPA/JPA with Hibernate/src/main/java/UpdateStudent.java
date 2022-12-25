import entities.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class UpdateStudent {

    public static void main(String[] args) {
        //        #update


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
        EntityManager em = emf.createEntityManager();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter roll to update the marks : ");

        int roll = sc.nextInt();

        Student student = em.find(Student.class, roll);

        System.out.println("Enter the marks : ");
        int newMarks = sc.nextInt();

        em.getTransaction().begin();

        student.setMarks(newMarks);

        em.getTransaction().commit();

        System.out.println("I am done");

        em.close();
    }
    }
