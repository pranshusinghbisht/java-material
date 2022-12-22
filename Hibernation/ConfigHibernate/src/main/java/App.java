import org.hibernate.SessionFactory;
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

        System.out.println(factory);
	System.out.println(factory.isClosed());

//        factory.getCurrentSession();



    }
}
