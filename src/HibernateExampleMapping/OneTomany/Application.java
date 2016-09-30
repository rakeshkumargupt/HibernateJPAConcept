package HibernateExampleMapping.OneTomany;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created by rakeshgupta on 9/3/16.
 */
public class Application {
    public  static  void main(String args[]){

        AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
        annotationConfiguration.addAnnotatedClass(Student.class);
        annotationConfiguration.addAnnotatedClass(College.class);
        annotationConfiguration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        College college = new College();
        college.setCollegeID(10);
        college.setCollegeName("IERT Allahabad");

        Student student = new Student();
        student.setStudentName("Rakesh Gupta");
        student.setStudentId(10);

        Student student1 = new Student();
        student1.setStudentId(11);
        student1.setStudentName("Pawan Kumar");

        college.getStudentList().add(student);
        college.getStudentList().add(student1);

        session.save(college);

        session.getTransaction().commit();



    }
}
