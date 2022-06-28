package dao.login;

import dto.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static dto.memberDto.id;

public class logoutUpdate {
    protected logoutUpdate() throws SQLException {
        String sql= "update member set isin=? where id=?";
        Connection conn = dto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setBoolean(1, false);
        pstmt.setString(2, id);
        pstmt.executeUpdate();
        System.out.println("로그아웃 완료");
    }
}
