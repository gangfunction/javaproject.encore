import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class login {

    static boolean logCheck;

    //로그인 정보를 입력하세요
    static void loginInfo() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("로그인 정보를 입력하세요");
        System.out.println("아이디 : ");
        String id = sc.next();
        System.out.println("비밀번호 : ");
        String pwd = sc.next();
        loginCheck(id, pwd);
    }

    //로그인 처리 db
    static void loginProcess() throws SQLException {
        dbCon.Con();
        loginInfo();
    }// 로그인 처리

    static void loginCheck(String id, String pwd) throws SQLException {
        //member 테이블에서 아이디와 비밀번호가 일치하는지 확인
        String sql = "select * from member where id=? and pwd=?";
        Connection conn = dbCon.dbcon();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        pstmt.setString(2, pwd);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            System.out.println("로그인 성공");
            //로그인 성공했을때 로그인 상태 출력
            setLogCheck(true);
            Menu.menuSelect();
        } else {
            System.out.println("로그인 실패");
        }
    }

    static void logoutProcess() throws SQLException {
        System.out.println("로그아웃 처리");
        setLogCheck(false);
        Menu.menuSelect();
    }


    static void setLogCheck(boolean logCheck) {
        login.logCheck = logCheck;
    }
}
