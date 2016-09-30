package HibernateExampleMapping.OneTomany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rakeshgupta on 9/3/16.
 */
@Entity
@Table(name = "College_OneToManyMapping2")
public class College {

    @Column
    @Id
    private int collegeID;

    @Column
    private String collegeName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "collegeID", nullable = false)
    private List<Student> studentList = new ArrayList<>();

    public int getCollegeID() {
        return collegeID;
    }

    public void setCollegeID(int collegeID) {
        this.collegeID = collegeID;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
