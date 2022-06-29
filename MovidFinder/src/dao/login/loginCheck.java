package dao.login;

import dto.dto;
import service.serviceMenu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class loginCheck  {
    protected loginCheck() throws SQLException {
        //member 테이블에서 아이디와 비밀번호가 일치하는지 확인
        String sql = "select * from member where id=? and pwd=?";
        Connection conn = dto.getConn();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, dto.getId());
        stmt.setString(2, dto.getPwd());
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            System.out.println("로그인 성공");
            new loginUpdate();
            new loginSave();
        } else {
            System.out.println("로그인 실패");
            new serviceMenu();
        }
    }
}
