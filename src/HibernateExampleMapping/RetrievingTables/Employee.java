package HibernateExampleMapping.RetrievingTables;

import javax.persistence.*;

/**
 * Created by rakeshgupta on 9/3/16.
 */
@Entity
@Table(name = "VitalLabsEmployee")
public class Employee {

    @Column
    @Id
    private long empId;

    @Column
    private String empName;

    @Column
    private String empAdd;

    @Column
    private String mobNo;

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAdd() {
        return empAdd;
    }

    public void setEmpAdd(String empAdd) {
        this.empAdd = empAdd;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
}
