package HibernateExample;

import javax.persistence.*;

@Entity
@SecondaryTable(name = "StudentDetails")
public class Student {

    private int id;
    private String name;
    private String branch;
    private String college;
    private boolean isAlcohalic;
    private String mobNo;

    @Column
    @Embedded
    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Column
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Column
    public boolean isAlcohalic() {
        return isAlcohalic;
    }

    public void setAlcohalic(boolean isAlcohalic) {
        this.isAlcohalic = isAlcohalic;
    }

}
