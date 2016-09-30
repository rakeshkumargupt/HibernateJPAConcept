package HibernateExampleMapping.OneToManyMapping1;


import HibernateExampleMapping.OneToOneMapping2.Credential2;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rakeshgupta on 9/2/16.
 */
@Entity
@Table(name = "Account3_OneToManyMapping1")
public class Account3 {

    @Column
    @Id
    @GeneratedValue
    private long accId;

    @Column
    private long bankId;

    @Column
    private String accType;

    @Column
    private String name;

    @Column
    private Date lastUpdate;

    @OneToOne(mappedBy = "account3")
    private Credential3 credential3;

    public Credential3 getCredential3() {
        return credential3;
    }

    public void setCredential2(Credential3 credential3) {
        this.credential3 = credential3;
    }

    public long getAccId() {
        return accId;
    }

    public void setAccId(long accId) {
        this.accId = accId;
    }

    public long getBankId() {
        return bankId;
    }

    public void setBankId(long bankId) {
        this.bankId = bankId;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
