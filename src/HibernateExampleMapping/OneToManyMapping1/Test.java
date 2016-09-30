package HibernateExampleMapping.OneToManyMapping1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import javax.print.DocFlavor;

/**
 * Created by rakeshgupta on 9/3/16.
 */
public class Test {

    public static void main(String args[]){
        AnnotationConfiguration annotationConfiguration= new AnnotationConfiguration();
        annotationConfiguration.addAnnotatedClass(Account3.class);
        annotationConfiguration.addAnnotatedClass(Credential3.class);

        annotationConfiguration.configure();

        SessionFactory sessionFactory= annotationConfiguration.buildSessionFactory();
        Session session= sessionFactory.getCurrentSession();

        session.beginTransaction();

    }

}
