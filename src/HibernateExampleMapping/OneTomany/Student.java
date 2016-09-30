package HibernateExampleMapping.OneTomany;

import javax.persistence.*;
import javax.print.DocFlavor;

/**
 * Created by rakeshgupta on 9/3/16.
 */
@Entity
@Table(name = "Student_OneToManyMapping2")
public class Student {

    @Column
    @Id
    private int studentId;

    @Column
    private String studentName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}
