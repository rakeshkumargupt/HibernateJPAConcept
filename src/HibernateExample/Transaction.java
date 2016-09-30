package HibernateExample;

import javax.persistence.*;

@Entity
public class Transaction {
    @Column
    private int transId;

    @Column
    @Id
    private int accId;

    @Column
    private String transType;

    @Column
    private int closingBal;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "accId")
    private Account account;


    public int getTransId() {
        return transId;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public int getClosingBal() {
        return closingBal;
    }

    public void setClosingBal(int closingBal) {
        this.closingBal = closingBal;
    }


}
