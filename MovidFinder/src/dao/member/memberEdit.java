package dao.member;

import dao.admin.adminMemberEdit;
import dto.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class memberEdit extends adminMemberEdit {
    public memberEdit() throws SQLException {
        super();
        Scanner sc = new Scanner(System.in);
        Connection conn = dto.getConn();
        System.out.println("비밀번호 변경파트입니다.");
        System.out.println("아이디를 입력해주세요.");
        String id = sc.nextLine();
        System.out.println("변경하실 비밀번호를 입력해주세요.");
        String pwd = sc.nextLine();
        String sql = "update member set pwd = ?  where id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, pwd);
        stmt.setString(2, id);
        stmt.executeUpdate();
        System.out.println("비밀번호 변경이 완료되었습니다.");
    }
}
