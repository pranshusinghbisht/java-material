package usecase;

import java.util.List;

import javax.persistence.EntityManager;

import model.Collage;
import model.Student;
import utility.DbUtil1;

public class Main {

	public static void main(String[] args) {

	      EntityManager em=DbUtil1.provideEntityManager();
	      
	      Collage collage=em.find(Collage.class,6);
	      
	    
	     
	    List<Student> studentsList= collage.getStudents();
	    

	       for(Student s:studentsList) {
	    	   
	    	   System.out.println(s);
	       }
	    
	    

		}

	}


