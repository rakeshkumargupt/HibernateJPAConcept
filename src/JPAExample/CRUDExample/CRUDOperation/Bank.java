package JPAExample.CRUDExample.CRUDOperation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

/**
 * Created by rakeshgupta on 9/4/16.
 */
@Entity
@Table(name = "Bank_JPABasic")
public class Bank {

    @Column
    @Id
    private int bankId;

    @Column
    private String bankName;

    @Column
    private BigInteger assests;

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public BigInteger getAssests() {
        return assests;
    }

    public void setAssests(BigInteger assests) {
        this.assests = assests;
    }
}
