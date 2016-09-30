package HibernateExampleMapping.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created by rakeshgupta on 9/4/16.
 */
public class Application {

    public static  void main(String args[]) {
        AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
        annotationConfiguration.addAnnotatedClass(Event.class);
        annotationConfiguration.addAnnotatedClass(Dlegate.class);
        annotationConfiguration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Dlegate dlegate = new Dlegate();
        dlegate.setdName("zaheer");

        Dlegate dlegate1 = new Dlegate();
        dlegate1.setdName("rakesh");

        Dlegate dlegate2 = new Dlegate();
        dlegate2.setdName("Praveen");

        Event java1 = new Event();
        java1.setEventName("JAva");

        Event c = new Event();
        c.setEventName("C");

        Event c1 = new Event();
        c1.setEventName("c1");

        java1.getList().add(dlegate);
        java1.getList().add(dlegate2);

        c.getList().add(dlegate);
        c.getList().add(dlegate2);

        c1.getList().add(dlegate);
        c1.getList().add(dlegate2);



        c.getList().add(dlegate1);



        session.save(dlegate);
        session.save(dlegate1);
        session.save(dlegate2);
        session.save(java1);
        session.save(c);
        session.save(c1);

        session.getTransaction().commit();


    }


}
