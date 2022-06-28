package dao.admin;

import dto.dto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class adminMemberList {
    protected adminMemberList() {
        try{
            String sql = "select * from member ";
            PreparedStatement pstmt = dto.getConn().prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getString("id") + " " + rs.getString("name") + " " + rs.getString("pwd") + " " + rs.getString("email") + " " + rs.getString("phone") + " " + rs.getString("admin"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
