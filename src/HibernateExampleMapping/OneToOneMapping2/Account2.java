package HibernateExampleMapping.OneToOneMapping2;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rakeshgupta on 9/2/16.
 */
@Entity
@Table(name = "Account2_OneToOneMapping2")
public class Account2 {

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

    @OneToOne(mappedBy = "account2")
    private Credential2 credential2;

    public Credential2 getCredential2() {
        return credential2;
    }

    public void setCredential2(Credential2 credential2) {
        this.credential2 = credential2;
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