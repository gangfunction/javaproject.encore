package dao;

import dto.Dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class memberUpdate{
    public memberUpdate(String id, String pwd) throws SQLException {
        Connection conn = Dto.getConn();
        String sql = "update member set id = ? ,pwd = ?  where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        pstmt.setString(2, pwd);
        pstmt.setString(3, id);
        pstmt.executeUpdate();
    }
}
