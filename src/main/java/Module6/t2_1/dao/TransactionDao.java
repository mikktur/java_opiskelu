package Module6.t2_1.dao;
import Module6.t2_1.entity.Transaction;
import jakarta.persistence.EntityManager;
import Module6.t2_1.datasource.MariaDbConnection;

import java.sql.SQLException;

public class TransactionDao {

    public void saveTransaction(Transaction transaction) throws SQLException {
        EntityManager em = MariaDbConnection.getInstance();
        em.getTransaction().begin();
        em.persist(transaction);
        em.getTransaction().commit();

    }
}
