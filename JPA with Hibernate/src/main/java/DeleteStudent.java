import entities.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class DeleteStudent {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
        EntityManager em = emf.createEntityManager();

        // # delete
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll to delete : ");
        int roll = sc.nextInt();
        Student student = em.find(Student.class, roll);

        em.getTransaction().begin();
        em.remove(student);
        em.getTransaction().commit();

        System.out.println("I am done...");
        em.close();


    }
}
