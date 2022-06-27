package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class getConnection {
    private static Connection conn;
    protected getConnection() {
        if (getConnection.getConnect() == null) {
            try {
                String url = "jdbc:mysql://127.0.01:3306/finalwork?serverTimezone=UTC";
                String id = "root";
                String pwd = "1234";
                Class.forName("com.mysql.cj.jdbc.Driver");
                getConnection.setConnect(DriverManager.getConnection(url, id, pwd));

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }



    public static Connection getConnect() {
        return conn;
    }

    public static void setConnect(Connection conn) {
        getConnection.conn = conn;
    }
}
