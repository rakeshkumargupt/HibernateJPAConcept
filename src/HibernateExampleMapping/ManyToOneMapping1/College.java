package HibernateExampleMapping.ManyToOneMapping1;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rakeshgupta on 9/4/16.
 */
@Entity
@Table(name = "College_ManyToOneMapping1")
public class College {

    @Column
    @Id
    private int collegeId;


    @Column
    private String collegeName;


    @Column
    private String collegeAdd;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "college")
    private List<Student> list = new ArrayList<>();

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeAdd() {
        return collegeAdd;
    }

    public void setCollegeAdd(String collegeAdd) {
        this.collegeAdd = collegeAdd;
    }
}
