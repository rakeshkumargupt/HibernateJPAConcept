package HibernateExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import java.util.Date;

public class TestAccount {

    public static void main(String[] args) {
        AnnotationConfiguration annotationConf = new AnnotationConfiguration();
        System.out.print("");
        annotationConf.addAnnotatedClass(Account.class);
        annotationConf.addAnnotatedClass(Transaction.class);
        annotationConf.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = annotationConf.buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Account acocunt = new Account();
        acocunt.setBankId("100");
        acocunt.setName("PNB India");
        acocunt.setLastUpdate(new Date());

        Transaction transaction = new Transaction();
        transaction.setTransId(1);
        transaction.setClosingBal(5000);
        transaction.setAccount(acocunt);

        session.save(transaction);
        session.getTransaction().commit();


    }

}
