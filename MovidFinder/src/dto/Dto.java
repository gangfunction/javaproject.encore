package dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Dto {

    // jdbc 드라이버에서 mysql 접속하기 위한 정보를 저장하는 클래스
    private static Connection connect;
    public static Connection getConn() {
        return connect;
    }
    public static void setConn(Connection connect) {
        Dto.connect = connect;
    }

    // jdbc 드라이버로 mysql finalwork 데이터베이스에 연결

    public static void dbCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버 로드 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로드 실패");
            e.printStackTrace();
        }
        try {
            Connection conn =(DriverManager.getConnection("jdbc:mysql://localhost:3306/finalwork?serverTimezone=UTC&useLegacyDatetimeCode=false", "root", "1234"));
            setConn(conn);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




}
