package Module6.t2_1.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class MariaDbConnection {

    private static Connection conn = null;


    public static Connection getConnection() throws SQLException {
        if (conn == null) {
            // connect if necessary

            conn = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/currencies?user=mikko&password=1234");
            return conn;
        } else {
            return conn;
        }
    }

    public static void terminate() {
        try {
            getConnection().close();
        } catch (SQLException e) {
        }
    }
}

