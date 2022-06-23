package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Dao {
    private static Connection conn =null;
    private final PreparedStatement pstmt = null;
    private final ResultSet rs = null;
    public static Connection getConn() {
        conn=dbCon.getConnection();
        return conn;
    }

}
