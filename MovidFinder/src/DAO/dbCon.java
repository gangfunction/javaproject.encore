package DAO;

import java.sql.*;

public class dbCon{
    private static Connection conn;
    public static Connection getConnection()
    {
        if(conn == null)
        {
            try {
                String url = "jdbc:mysql://127.0.01:3306/finalwork?serverTimezone=UTC";
                String id = "root";
                String pwd = "1234";

                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, id, pwd);

            } catch (Exception e)
            {
                System.out.println(e);
            }
        }   return conn;
    }

    public static void close()
    {
        if(conn != null)
        {
            try {
                if(!conn.isClosed())
                    conn.close();

            } catch (SQLException e)
            {
                System.out.println(e);
            }
        }
        conn=null;
    }

    public static void auto_increment_init() {
        try {
            String sql = "alter table `review` auto_increment = 1";
            PreparedStatement pstmt = getConnection().prepareStatement(sql);
            String sql2 = "alter table `movie` auto_increment = 1";
            PreparedStatement pstmt2 = getConnection().prepareStatement(sql2);
            pstmt.executeUpdate();
            pstmt2.executeUpdate();
    } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}