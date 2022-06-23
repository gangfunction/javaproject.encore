package DAO;

import DTO.Dto;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static Service.Menu.menuSelect;

public class loginDao {
    public static void loginCheck(String id, String pwd) throws SQLException {
        //member 테이블에서 아이디와 비밀번호가 일치하는지 확인
        String sql = "select * from member where id=? and pwd=?";
        Connection conn = Dao.getConn();
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
    //로그인한 id와 isin을 불러와서 세션에 저장
    public static void loginSave(String id) throws SQLException {
        String sql = "select id, isin from member where isin=1";
        Connection conn = Dao.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            if (rs.getString("id").equals(id)) {
                Dto.setId(rs.getString("id"));
                Dto.setIsin(rs.getBoolean("isin"));
            }
        }
    }
    private static void loginUpdate(String id) throws SQLException {
        String sql = "update member set isin=? where id=?";
        Connection conn = Dao.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setBoolean(1, true);
        pstmt.setString(2, id);
        pstmt.executeUpdate();
    }
    private static void logoutUpdate(String id) throws SQLException {
        String sql= "update member set isin=? where id=?";
        Connection conn = Dao.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setBoolean(1, false);
        pstmt.setString(2, id);
        pstmt.executeUpdate();
    }



    public static boolean idCheck(String id) throws SQLException {
        try {
            Connection conn = Dao.getConn();
            String sql = "select * from member where id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void ddlRegister(String id, String pwd) throws SQLException {
        PreparedStatement pstmt;
        Connection conn =Dao.getConn();
        String sql = "insert into member(id,pwd,isin,type) values(?,?,false,false)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,id);
        pstmt.setString(2,pwd);
        pstmt.executeUpdate();
    }
}
