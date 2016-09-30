package HibernateExampleMapping.RetrievingTables;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import java.util.List;

/**
 * Created by rakeshgupta on 9/3/16.
 */
public class GettingEmployeeData {

    public  static  void main(String args[]) {
        AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
        annotationConfiguration.addAnnotatedClass(Employee.class);
        annotationConfiguration.configure();

        SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Query query = session.createQuery("from Employee");

        List<Employee> list = query.list();

        for(Employee employee : list) {

            System.out.println("Employee Adddress : " + employee.getEmpAdd());
            System.out.println("Employee Id : " + employee.getEmpId());
            System.out.println("Employee name : " + employee.getEmpName());
            System.out.println("Employee Mobile no :" + employee.getMobNo());

        }

       session.getTransaction().commit();

    }
}
