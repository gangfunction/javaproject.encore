package dao;

import dto.Dto;
import dto.MemberDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AdminDao {
    public static void AdminCheck(String id, String pwd) throws SQLException {
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
    //전체 멤버 조회
    public static void memberList() throws SQLException {
        Connection conn = Dto.getConn();
        String sql = "select * from member";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("id") + " " + rs.getString("name") + " " + rs.getString("pwd") + " " + rs.getString("email") + " " + rs.getString("phone") + " " + rs.getString("admin"));
        }
    }
    //멤버 삭제
    public static void memberDelete(String id) throws SQLException {
        Connection conn = Dto.getConn();
        String sql = "delete from member where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        pstmt.executeUpdate();
    }
    //멤버 수정
    public static void memberUpdate(String id, String pwd) throws SQLException {
        Connection conn = Dto.getConn();
        String sql = "update member set id = ? ,pwd = ?  where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        pstmt.setString(2, pwd);
        pstmt.setString(3, id);
        pstmt.executeUpdate();
    }
}
