import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbCon {
    static void Con() {
        System.out.println("연결중...");

        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql?serverTimezone=UTC&useLegacyDatetimeCode=false", "root", "1234");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //mysql의 mywork를 사용한다.
        try {
            conn.prepareStatement("use mywork").executeQuery();
            System.out.println("연결성공");
        } catch (SQLException e) {
            System.out.println("연결실패");
        }

    }

    static Connection dbcon() throws SQLException {
        System.out.println("연결중...");

        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.01:3306/mywork?serverTimezone=UTC&useLegacyDatetimeCode=false", "root", "1234");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
    //db에 있는 모든 테이블 출력하기

}
