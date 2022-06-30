package dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dTO {

    // jdbc 드라이버에서 mysql 접속하기 위한 정보를 저장하는 클래스
    private static Connection connect;
    public static Connection getConn() {
        dbCon();
        return connect;
    }
    public static void setConn(Connection connect) {
        dTO.connect = connect;
    }

    // jdbc 드라이버로 mysql final work 데이터베이스에 연결

    public static void dbCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection conn =(DriverManager.getConnection("jdbc:mysql://localhost:3306/finalwork?serverTimezone=UTC&useLegacyDatetimeCode=false", "root", "1234"));
            setConn(conn);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static String getId() {
        return memberDTO.getId();
    }

    public static String getPwd() {
        return memberDTO.getPwd();
    }
    public static void setId(String next) {
        memberDTO.setId(next);
    }

    public static void setPwd(String next) {
        memberDTO.setPwd(next);
    }

    public static boolean getAdmin() {
        return memberDTO.getAdmin();
    }
    public static void setAdmin(boolean next) {
        memberDTO.setAdmin(next);
    }

    public static void setPointer(int next) {
        movieDTO.setPointer(next);
    }

}
