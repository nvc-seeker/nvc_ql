package vns.nvc.nvcql.ql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PostgresConnection {

    private static final String HOST = "localhost";
    private static final String PORT = "5433";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin";
    private static final String DATABASE = "postgres";
    private static final String SCHEMA = "dynamic_data";

    public static Connection getConnection() throws SQLException {
        Properties props = new Properties();

        String urlStr = String.format("jdbc:postgresql://%s:%s/%s", HOST, PORT, DATABASE);
        //props.setProperty("database", DATABASE);
        props.setProperty("currentSchema", SCHEMA);
        props.setProperty("user", USER);
        props.setProperty("password", PASSWORD);

        return DriverManager.getConnection(urlStr, props);
    }

}
