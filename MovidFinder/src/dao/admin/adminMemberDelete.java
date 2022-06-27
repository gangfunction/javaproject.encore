package dao.admin;

import dto.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static dto.memberDto.id;

public class adminMemberDelete {
    protected adminMemberDelete() throws SQLException {
        Connection conn = dto.getConn();
        String sql = "delete from member where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        pstmt.executeUpdate();
    }
}
