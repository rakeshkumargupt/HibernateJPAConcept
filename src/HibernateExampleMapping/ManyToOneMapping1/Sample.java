package HibernateExampleMapping.ManyToOneMapping1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created by rakeshgupta on 9/4/16.
 */
public class Sample {

    public  static  void main(String  args[]) {
        AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
        annotationConfiguration.addAnnotatedClass(Student.class);
        annotationConfiguration.addAnnotatedClass(College.class);
        annotationConfiguration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        College college = new College();
        college.setCollegeName("IIIT Allahabad");
        college.setCollegeAdd("Allahabad");
        college.setCollegeId(11);


        Student student = new Student();
        student.setMobNo("2343243");
        student.setStudentId(10);
        student.setName("AAAAAA");
        student.setAdd("Bangalore");

        Student student1 = new Student();
        student1.setMobNo("67676");
        student1.setStudentId(11);
        student1.setName("BBBBB");
        student1.setAdd("Mangalore");



        student.setCollege(college);
        student1.setCollege(college);

        college.getList().add(student);
        college.getList().add(student1);

        session.save(college);
        session.getTransaction().commit();


    }
}
