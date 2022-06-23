package DAO;

import DTO.DBDto;

import java.sql.*;
import java.util.Objects;

public class MemberDao {
    public static void showMember() {
        System.out.println("회원정보");
        String sql = "select * from member";
        //sql 실행
        try {
            Connection conn = DBDto.getConn();
            Statement stmt = conn.createStatement();
            ResultSet rs = Objects.requireNonNull(stmt).executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("id") + " " + rs.getString("pwd"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void ddlRegister(String id, String pwd, Boolean admin) throws SQLException {
        PreparedStatement pstmt;
        Connection conn =DBDto.getConn();
        String sql = "insert into member(id,pwd,isin,admin) values(?,?,false,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,id);
        pstmt.setString(2,pwd);
        pstmt.setBoolean(3,admin);
        pstmt.executeUpdate();
    }


}
