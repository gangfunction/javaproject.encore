package dao.login;

import dto.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static dto.memberDto.id;

public class loginUpdate{
    protected loginUpdate() throws SQLException {
        String sql = "update member set isin=? where id=?";
        Connection conn = dto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setBoolean(1, true);
        pstmt.setString(2, id);
        pstmt.executeUpdate();
    }


}
