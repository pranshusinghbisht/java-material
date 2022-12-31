package com.unidirectional.usecases;

import com.unidirectional.utility.EMUtil;

import javax.persistence.EntityManager;

public class bidirectional {
    public static void main(String[] args) {

      EntityManager em = EMUtil.provideEntityManager();



      em.getTransaction().begin();
      em.getTransaction().commit();
      em.close();
        System.out.println("done...");


/*
 jpa_address              |
| jpda_student             |
| jpda_student_jpa_address (extra table created for manage)
*/


        // to avoid this we use mappedby() in student now it becomes bi directional ----> with this one extra table is foormed
    }
}
