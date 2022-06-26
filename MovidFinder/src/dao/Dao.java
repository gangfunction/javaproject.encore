package dao;

import dto.Dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Dao {

    private static Connection conn;
    public static void initialProcess() throws SQLException {
        MovieDao.deleteMovieList();
        if (ReserveDao.reserveTableCheck())
        {
            ReserveDao.deleteReserveList();
        }
        resetLoginList();
    }


    private static void resetLoginList() throws SQLException {
        Dto.getConn();
        String sql = "update member set isin = 0";
        PreparedStatement pstmt = Dto.getConn().prepareStatement(sql);
        pstmt.executeUpdate();
    }

    public static Connection getConnection()
    {
        if(getConn() == null)
        {
            try {
                String url = "jdbc:mysql://127.0.01:3306/finalwork?serverTimezone=UTC";
                String id = "root";
                String pwd = "1234";
                Class.forName("com.mysql.cj.jdbc.Driver");
                setConn(DriverManager.getConnection(url, id, pwd));

            } catch (Exception e)
            {
                e.printStackTrace();
            }

        }   return getConn();
    }

    public static void close()
    {
        if(getConn() != null)
        {
            try {
                if(!getConn().isClosed())
                    getConn().close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        setConn(null);
    }

    public static Connection getConn() {
        return conn;
    }

    public static void setConn(Connection conn) {
        Dao.conn = conn;
    }
}
