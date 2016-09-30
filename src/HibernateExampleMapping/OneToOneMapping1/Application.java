package HibernateExampleMapping.OneToOneMapping1;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created by rakeshgupta on 9/2/16.
 */
public class Application {

    public static void main(String args[]) {

        AnnotationConfiguration annotationConf = new AnnotationConfiguration();
        annotationConf.addAnnotatedClass(Credential.class);
        annotationConf.addAnnotatedClass(Account.class);
        annotationConf.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = annotationConf.buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Account account = new Account();
        account.setAccType("Saving Account");
        account.setBankId(1600l);
        account.setLastUpdate(new java.util.Date());
        account.setName("State Bank of India");

        Credential credential = new Credential();
        credential.setCredId(10);
        credential.setUserName("Ram123");
        credential.setPassword("12345");
        credential.setAccount(account);


        session.save(credential);
        session.getTransaction().commit();

    }
}
