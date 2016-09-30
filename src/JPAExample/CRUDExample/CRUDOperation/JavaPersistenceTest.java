package JPAExample.CRUDExample.CRUDOperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.math.BigInteger;


/**
 * Created by rakeshgupta on 9/4/16.
 */
public class JavaPersistenceTest {

    public static void main(String args[]){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("connector");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
           EntityTransaction entityTransaction =  entityManager.getTransaction();
            entityTransaction.begin();

        Bank bank = new Bank();
        bank.setAssests(new BigInteger("89457349758347"));
        bank.setBankId(1000);
        bank.setBankName("State Bank of Maharastra");

        entityManager.persist(bank);
        entityTransaction.commit();

    }

}
