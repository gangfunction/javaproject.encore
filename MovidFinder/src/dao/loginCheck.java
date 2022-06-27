package dao;

import dto.Dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static service.Menu.menuSelect;

public class loginCheck {
    public loginCheck(String id, String pwd) throws SQLException {
        //member 테이블에서 아이디와 비밀번호가 일치하는지 확인
        String sql = "select * from member where id=? and pwd=?";
        Connection conn = Dto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        pstmt.setString(2, pwd);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            System.out.println("로그인 성공");
            new loginUpdate();
            new loginSave(id);
        } else {
            System.out.println("로그인 실패");
            menuSelect();
        }
    }
}
