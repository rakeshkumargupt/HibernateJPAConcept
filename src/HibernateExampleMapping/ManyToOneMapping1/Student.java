package HibernateExampleMapping.ManyToOneMapping1;

import javax.persistence.*;

/**
 * Created by rakeshgupta on 9/4/16.
 */
@Entity
@Table(name = "Student_ManyToOneMapping1")
public class Student {

    @Column
    @Id
    private int studentId;


    @Column
    private String name;


    @Column
    private String mobNo;


    @Column
    private String add;


    @ManyToOne
    @JoinColumn(name = "collegeId", nullable = false)
    private  College college;

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
