package HibernateExampleMapping.OneToOneMapping2;

import javax.persistence.*;

/**
 * Created by rakeshgupta on 9/2/16.
 */

@Entity
@Table(name = "Credential2_OneToOneMapping2")
public class Credential2 {

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
    private Account2 account2;

    public Account2 getAccount2() {
        return account2;
    }

    public void setAccount2(Account2 account2) {
        this.account2 = account2;
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
