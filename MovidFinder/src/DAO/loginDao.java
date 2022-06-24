package DAO;

import DTO.DBDto;
import DTO.MemberDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static Service.Menu.menuSelect;

public class loginDao {
    public static void loginCheck(String id, String pwd) throws SQLException {
        //member 테이블에서 아이디와 비밀번호가 일치하는지 확인
        String sql = "select * from member where id=? and pwd=?";
        Connection conn = DBDto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        pstmt.setString(2, pwd);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            System.out.println("로그인 성공");
            loginUpdate(id);
            loginSave(id);
        } else {
            System.out.println("로그인 실패");
            menuSelect();
        }
    }
    public static void loginSave(String id) throws SQLException {
        String sql = "select id, isin from member where isin=1";
        Connection conn = DBDto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            if (rs.getString("id").equals(id)) {
                MemberDto.setId(rs.getString("id"));
                MemberDto.setIsin(rs.getBoolean("isin"));
            }
        }
    }
    private static void loginUpdate(String id) throws SQLException {
        String sql = "update member set isin=? where id=?";
        Connection conn = DBDto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setBoolean(1, true);
        pstmt.setString(2, id);
        pstmt.executeUpdate();
    }




    public static boolean idCheck(String id) {
        try {
            Connection conn = DBDto.getConn();
            String sql = "select * from member where id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }


}
