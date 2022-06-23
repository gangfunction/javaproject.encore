package DAO;

import java.sql.*;

public class dbCon{
    private static Connection conn;
    public static Connection getConnection()
    {
        if(conn == null)
        {
            try {
                String url = "jdbc:mysql://127.0.01:3306/mywork?serverTimezone=UTC";
                String id = "root";
                String pwd = "1234";

                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, id, pwd);

            } catch (Exception e)
            {
                System.out.println(e.toString());
            }
        }   return conn;
    }
    public static Connection getConnection(String url, String id, String pwd )
    {
        if(conn == null)
        {
            try {
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
}