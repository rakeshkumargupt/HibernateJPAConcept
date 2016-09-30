package HibernateExampleMapping.OneToManyMapping1;

/**
 * Created by rakeshgupta on 9/3/16.
 */
import javax.persistence.*;

/**
 * Created by rakeshgupta on 9/2/16.
 */

@Entity
@Table(name = "Credential3_OneToManyMapping1")
public class Credential3 {

    @Column
    private long credId;

    @Column
    @Id
    private long userId;

    @Column
    private String userName;

    @Column
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "accId")
    private Account3 account3;

    public Account3 getAccount3() {
        return account3;
    }

    public void setAccount2(Account3 account2) {
        this.account3 = account2;
    }

    public long getCredId() {
        return credId;
    }

    public void setCredId(long credId) {
        this.credId = credId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

