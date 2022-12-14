package xyz.pagliares.jdbc.bookstore.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// @TODO Include other RDBMS in addition to MySQL (embedded and remote) such as Postgres, H2 and HSQLDB
public class DatabaseUtility {

    // If you are configuring a connection pool (not shown in this course) in an app server (e.g Glassfish, Payara)
    // and are getting an error with the connection String, try to include ?useSSL=true as shown below:
    // private static final String CONNECTION_STRING ="jdbc:mysql://localhost:3306/hostelapp_jdbc?useSSL=true";
    private static final String USERNAME = "florentino";
    private static final String PASSWORD = "123456";
    private static final String CONNECTION_STRING ="jdbc:mysql://localhost:3306/bookstore_jdbc";

    public static Connection getConnection(RDBMS RDBMS) throws SQLException {

        switch (RDBMS) {
            case MYSQL:
                return DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            default:
                return null;
        }
    }

}
