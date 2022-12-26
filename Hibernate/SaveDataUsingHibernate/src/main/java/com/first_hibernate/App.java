package com.first_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started.." );

        //to check my hibernate configuration is correct or not so we will make an object


//        SessionFactory is an interface -> (it is like a connection) -> one project , one session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

/*        System.out.println(factory);
        System.out.println(factory.isClosed());*/




//        class and table
//        then mapping
        //so i created the class as entity
        // and for mapping add property inside configuration file with <mapping class=""> property

//        creating student

        Student st = new Student();
        st.setId(102);
        st.setName("Hrithik");
        st.setCity("Lucknow");

        System.out.println(st);


//take session org.hibernate wala
        //factory give session
      Session session =  factory.openSession();
      /// work inside this session

        Transaction tx = session.beginTransaction();
        session.save(st);
        tx.commit();
//        session.getTransaction().commit();
      session.close();







    }
}
