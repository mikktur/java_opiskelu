package Module6.t2_1.datasource;

import jakarta.persistence.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class MariaDbConnection {
    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;
    public static EntityManager getInstance() {

        if (em==null) {
            if (emf==null) {
                emf = Persistence.createEntityManagerFactory("currencies");
            }
            em = emf.createEntityManager();
        }
        return em;
    }
}


