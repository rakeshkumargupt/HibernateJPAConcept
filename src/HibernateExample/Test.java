package HibernateExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class Test {

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

        Application application2 = new Application();
        application2.setAddress("Bellandur Bangalore");
        application2.setEmpName("Praveen Singh");
        application2.setMobNo((long) 856590);

        Application application3 = new Application();
        application3.setAddress("Bellandur Bangalore");
        application3.setEmpName("Praveen Singh");
        application3.setMobNo(856590L);


        session.persist(application);
        session.persist(application2);
        session.persist(application3);

        Application application4 = (Application) session.get(Application.class, 1);
        System.out.println(application4.getAddress());
        System.out.println(application4.getEmpId());
        System.out.println(application4.getEmpName());
        System.out.println(application4.getMobNo());

        application4.setMobNo(123456L);

        session.save(application4);

        System.out.println(session.getTransaction().isActive());
        System.out.println(session.getTransaction().wasCommitted());
        System.out.println(session.getTransaction().wasRolledBack());
        session.getTransaction().commit();


    }

}
