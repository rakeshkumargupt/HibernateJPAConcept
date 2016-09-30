package HibernateExampleMapping.RetrievingTables;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import java.util.Scanner;

/**
 * Created by rakeshgupta on 9/3/16.
 */
public class EmployeeData {
    public static void main(String args[]){
        AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
        annotationConfiguration.addAnnotatedClass(Employee.class);
        annotationConfiguration.configure();

        SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
        Session session =sessionFactory.getCurrentSession();

        session.beginTransaction();
        boolean condition = true;
        Scanner scanner = new Scanner(System.in);
        String check = null;
        int i = 1;
        Employee employee;
        while (condition) {
             employee = new Employee();
            employee.setEmpId(i);
            System.out.println("Please Enter your name");
            employee.setEmpName(scanner.nextLine());
            System.out.println("Enter you Mobile no: ");
            employee.setMobNo(scanner.nextLine());
            System.out.println("Enter you Address: ");
            employee.setEmpAdd(scanner.nextLine());
            System.out.println("Please enter your 1 for next or 0 for stop");
             check = scanner.nextLine();
            if(Integer.parseInt(check)==1)
            condition = true;
            else
                condition = false;
            session.save(employee);
            i++;
        }

        session.getTransaction().commit();
    }
}
