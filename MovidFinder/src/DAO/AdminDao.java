package DAO;

import DTO.DBDto;
import DTO.MemberDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDao {
    public static void AdminCheck(String id, String pwd) {
        // TODO Auto-generated method stub
        Connection conn = DBDto.getConn();
        String sql = "select * from member where id= ? and pwd = ? and admin = true";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            pstmt.setString(2, pwd);
            ResultSet rs = pstmt.executeQuery(sql);
            if (rs.next()) {
                System.out.println("로그인 성공");
                MemberDto.setAdmin(true);
            } else {
                System.out.println("로그인 실패");
            }

    } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
