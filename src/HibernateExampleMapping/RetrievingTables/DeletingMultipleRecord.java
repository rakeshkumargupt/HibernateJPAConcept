package HibernateExampleMapping.RetrievingTables;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import java.util.List;
import java.util.Scanner;

/**
 * Created by rakeshgupta on 9/3/16.
 */
public class DeletingMultipleRecord {
    public static void main(String args[]){
        AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
        annotationConfiguration.addAnnotatedClass(Employee.class);
        annotationConfiguration.configure();

        SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Query query = session.createQuery("from Employee");
        List<Employee> list = query.list();

        System.out.println("Enter empId seperated by space to delete data");
        String value = new Scanner(System.in).nextLine();
        String  arr[] = value.split(" ");

       for (Employee employee : list){
           int empIdNew = (int)employee.getEmpId();
           for (int i=0;i<arr.length;i++){
               if(empIdNew == Integer.parseInt(arr[i])){
                   session.delete(employee);
                   System.out.println("Employee with id : " + Integer.parseInt(arr[i])
                           + " is successfully deleted");
               }
           }
       }

    session.getTransaction().commit();
    }

}
