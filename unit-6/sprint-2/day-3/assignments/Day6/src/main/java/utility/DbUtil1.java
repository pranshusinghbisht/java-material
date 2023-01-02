package utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbUtil1 {
	
	static EntityManagerFactory emf;
	static {
		emf=Persistence.createEntityManagerFactory("collage-Unit");
	}
	
	public static EntityManager provideEntityManager() {
		
		EntityManager em=emf.createEntityManager();
		
		return em;
		
		
	}

}