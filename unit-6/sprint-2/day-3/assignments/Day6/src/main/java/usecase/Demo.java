package usecase;

import javax.persistence.EntityManager;

import model.Collage;
import model.Student;
import utility.DbUtil1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

			EntityManager em=DbUtil1.provideEntityManager();
			
			Collage c1=new Collage("uit","nkjd");
			Collage c2=new Collage("rgpv", "mnnjj");
			
			
			Student s1=new Student("geeta", "2323456789", "abc@gmail.com");
			Student s2=new Student("vimal", "123456789", "xyz@gmail.com");
			Student s3=new Student("gita", "453456789", "asd@gmail.com");
			Student s4=new Student("ravi", "453456789", "aud@gmail.com");
			
			c1.getStudents().add(s1);
			c1.getStudents().add(s2);
			c1.getStudents().add(s3);
			c1.getStudents().add(s4);
			
			s1.setClg(c1);
			s2.setClg(c1);
			s3.setClg(c1);
			s4.setClg(c1);
			
			
			Student s5=new Student("ravina", "2323456789", "hry@gmail.com");
			Student s6=new Student("govind", "123456789", "rfu@gmail.com");
			Student s7=new Student("bansi", "453456789", "wsy@gmail.com");
			Student s8=new Student("varshu", "453456789", "jkl@gmail.com");
			
			c2.getStudents().add(s5);
			c2.getStudents().add(s6);
			c2.getStudents().add(s7);
			c2.getStudents().add(s8);
			
			s5.setClg(c2);
			s6.setClg(c2);
			s7.setClg(c2);
			s8.setClg(c2);
			
			
			em.getTransaction().begin();
			
			em.persist(c1);
			em.persist(c2);
			
			em.getTransaction().commit();
			
			System.out.println("done");
			em.close();

	}

}
