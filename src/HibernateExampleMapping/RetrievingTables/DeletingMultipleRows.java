package HibernateExampleMapping.RetrievingTables;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import java.util.List;

/**
 * Created by rakeshgupta on 9/3/16.
 */
public class DeletingMultipleRows {
    public  static void main(String args[]){
        AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
        annotationConfiguration.addAnnotatedClass(Employee.class);
        annotationConfiguration.configure();

        SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Query query = session.createQuery("from Employee");
        List<Employee> list = query.list();

        for (Employee employee : list){
             int v = (int) employee.getEmpId();
            for (int i=0;i<5;i++) {
                if (v == i)
                    session.delete(list.get(i));
            }
        }

//        int j =0;
//        while(j==4) {
//
//            Employee employee = (Employee) session.load(Employee.class, i);
//            session.delete(employee);
//            j++;
//            }

        session.getTransaction().commit();
    }
}
