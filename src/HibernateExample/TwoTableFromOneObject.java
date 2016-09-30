package HibernateExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class TwoTableFromOneObject {

    public static void main(String[] args) {

        AnnotationConfiguration anoObj = new AnnotationConfiguration();
        anoObj.addAnnotatedClass(Application.class);
        anoObj.configure("hibernate.cfg.xml");

        //	new SchemaExport(anoObj).create(true, true);
        SessionFactory sessionFactory = anoObj.buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Application application = new Application();
        application.setAddress("Prayad Alahabad");
        application.setEmpName("Rajat Singh");
        application.setMobNo((long) 99999);

        session.persist(application);

        Application app2 = (Application) session.load(Application.class, 1);
        app2.setEmpName("Zaheer Ahamed");
        session.save(app2);

        session.getTransaction().commit();


    }

}
