package dao;

import dto.Dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class memberDelete {
    public memberDelete(String id) throws SQLException {
        Connection conn = Dto.getConn();
        String sql = "delete from member where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        pstmt.executeUpdate();
    }
}
