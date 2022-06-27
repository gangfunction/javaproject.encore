package dao;

import dto.Dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class memberList {
    public memberList() throws SQLException {
        Connection conn = Dto.getConn();
        String sql = "select * from member";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("id") + " " + rs.getString("name") + " " + rs.getString("pwd") + " " + rs.getString("email") + " " + rs.getString("phone") + " " + rs.getString("admin"));
        }
    }
}
