package usecase;

import javax.persistence.EntityManager;

import model.Collage;
import model.Student;
import utility.DbUtil1;

public class GetCollage {
	
	public static void main(String[]args) {
		EntityManager em=DbUtil1.provideEntityManager();
		
		Student student=em.find(Student.class,5);
		
		
        Collage collage= student.getClg();
		
		System.out.println(collage);
	}

}
