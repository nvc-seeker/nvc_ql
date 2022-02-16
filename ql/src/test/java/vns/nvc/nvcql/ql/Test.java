package vns.nvc.nvcql.ql;

import java.sql.Connection;

public class Test {

    public static void main(String[] args) throws Exception {
        Connection conn = PostgresConnection.getConnection();
        System.out.println(conn);
    }
}
