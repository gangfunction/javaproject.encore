package dao.admin;

import dto.dto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class adminMemberEdit {
    protected adminMemberEdit() {
        try{
            String sql = "select * from member ";
            PreparedStatement pstmt = dto.getConn().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getString("id") + " " + rs.getString("name") + " " + rs.getString("pwd") + " " + rs.getString("email") + " " + rs.getString("phone") + " " + rs.getString("admin"));
            }// 업데이트 할 이름의 아이디를 입력받는다.
            System.out.println("수정할 행의 아이디를 입력하세요.");
            Scanner sc = new Scanner(System.in);
            String id = sc.nextLine();
            //어떤 것을 수정하시겠습니까?
            System.out.println("수정할 항목을 선택하세요.");
            System.out.println("1. 비밀번호");
            System.out.println("2. 어드민 여부");
            String select = sc.nextLine();
            switch(select){
                case "1":
                    System.out.println("변경할 비밀번호를 입력하세요.");
                    String pwd = sc.nextLine();
                    String sql2 = "update member set pwd=? where id=?";
                    PreparedStatement pstmt2 = dto.getConn().prepareStatement(sql2);
                    pstmt2.setString(1, pwd);
                    pstmt2.setString(2, id);
                    pstmt2.executeUpdate();
                    break;
                case "2":
                    System.out.println("변경할 어드민 여부를 입력하세요.");
                    boolean admin = sc.nextBoolean();
                    String sql3 = "update member set admin=? where id=?";
                    PreparedStatement pstmt3 = dto.getConn().prepareStatement(sql3);
                    pstmt3.setBoolean(1, admin);
                    pstmt3.setString(2, id);
                    pstmt3.executeUpdate();
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
            } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
