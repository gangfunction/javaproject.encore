package dao;

import dto.Dto;
import dto.MemberDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class adminCheck {
    public adminCheck(String id, String pwd) throws SQLException {
        Connection conn = Dto.getConn();
        String sql = "select * from member where id= ? and pwd = ? and admin = true";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        pstmt.setString(2, pwd);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            MemberDto.setAdmin(true);
        }


    }
}
