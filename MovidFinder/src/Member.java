import java.sql.*;
import java.util.Scanner;

public class Member{
     public static void registerProcess() throws SQLException {
        registerUser();
        showMember();
     }
     private static void registerUser() throws SQLException {
        Scanner sc;
        System.out.println("회원가입");
        //아이디, 비밀번호
        System.out.println("아이디 입력");
        sc = new Scanner(System.in);
        String id = sc.nextLine();
        // 아이디 중복 검사
        if (idCheck(id)) {
            return;
        }
        System.out.println("비밀번호 입력");
        String pwd = sc.nextLine();
        Member.ddlRegister(id, pwd);
    }
    //id 중복 검사
    public static boolean idCheck(String id) throws SQLException {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mywork?serverTimezone=UTC&useLegacyDatetimeCode=false", "root", "1234");
            String sql = "select * from member where id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("아이디가 중복됩니다.");
                // 다른 아이디를 입력하던지 메뉴로 돌아가서 선택할수있게 해준다.
                Scanner sc = new Scanner(System.in);
                int toSelect = sc.nextInt();
                switch (toSelect) {
                    case 1:
                        registerUser();
                        break;
                    case 2:
                        Menu.menuSelect();
                        break;
                    default:
                        System.out.println("잘못 입력하셨습니다.");
                        break;
                }
            }else{
                System.out.println("아이디가 사용가능합니다.");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;}

    //만약에 member 테이블이 없다면 생성해준다.

    public static void ddlRegister(String id, String pwd) throws SQLException {
        PreparedStatement pstmt;
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mywork?serverTimezone=UTC&useLegacyDatetimeCode=false", "root", "1234");
        String sql = "insert into member(id,pwd,isin,type) values(?,?,false,false)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,id);
        pstmt.setString(2,pwd);
        pstmt.executeUpdate();
    }

    //가입한 회원정보 표시
    private static void showMember() {
        System.out.println("회원정보");
        dbCon.Con();
        String sql = "select * from member";
        //sql 실행
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mywork?serverTimezone=UTC&useLegacyDatetimeCode=false", "root", "1234");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("id") + " " + rs.getString("pwd"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
