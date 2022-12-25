import entities.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertStudent {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
        EntityManager em = emf.createEntityManager();

        //insert
        //new state/ transient stage -- u create an object
        Student student = new Student(1,"Hrithik",500);

        em.getTransaction().begin();

        //u attach the object em// persistence stage
        em.persist(student);

        em.getTransaction().commit();
        System.out.println("I am done");

        //detach student object from em -- detach stage
        em.close();
    }
}
