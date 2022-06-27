package dao;

import dto.Dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static dto.MemberDto.id;

public class loginUpdate{
    loginUpdate() throws SQLException {
        String sql = "update member set isin=? where id=?";
        Connection conn = Dto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setBoolean(1, true);
        pstmt.setString(2, id);
        pstmt.executeUpdate();
    }


}
