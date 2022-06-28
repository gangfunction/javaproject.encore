package dao.login;

import dto.dto;
import service.serviceMenu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static dto.dto.getId;
import static dto.memberDto.getPwd;


public class loginCheck  {
    protected loginCheck() throws SQLException {
        //member 테이블에서 아이디와 비밀번호가 일치하는지 확인
        String sql = "select * from member where id=? and pwd=?";
        Connection conn = dto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, getId());
        pstmt.setString(2, getPwd());
        ResultSet rs = pstmt.executeQuery();
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
