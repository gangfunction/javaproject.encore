package DAO;

import DTO.DBDto;
import DTO.MemberDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AdminDao {
    public static void AdminCheck(String id, String pwd) throws SQLException {
        Connection conn = DBDto.getConn();
        String sql = "select * from member where id= ? and pwd = ? and admin = true";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        pstmt.setString(2, pwd);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            MemberDto.setAdmin(true);
        } else {
            System.out.println("로그인 실패");
            }


    }
}
