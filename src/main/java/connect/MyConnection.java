package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class MyConnection {
    private final static String DB_USER = "root";
    private final static String DB_PASSWORD = "root";

    private final static String DB_URL_CONNECTION = "jdbc:mysql://localhost:8889/demo_project_sds";

    private MyConnection(){}

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL_CONNECTION, DB_USER, DB_PASSWORD);
    }
}
