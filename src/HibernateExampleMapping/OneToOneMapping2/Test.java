package HibernateExampleMapping.OneToOneMapping2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created by rakeshgupta on 9/2/16.
 */
public class Test {
    public static void main(String args[]) {
        AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
        annotationConfiguration.addAnnotatedClass(Account2.class);
        annotationConfiguration.addAnnotatedClass(Credential2.class);

        annotationConfiguration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();

        Account2 account2 = new Account2();
        account2.setBankId(1000);
        account2.setName("Maharstra Bank");
        account2.setAccType("Credit account");
        account2.setLastUpdate(new java.util.Date());

        Credential2 credential2 = new Credential2();
        credential2.setPassword("98765");
        credential2.setUserName("mbh123");
        credential2.setCredId(222l);

        credential2.setAccount2(account2);

        session.save(credential2);
        session.getTransaction().commit();
    }
}