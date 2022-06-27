package dao;

import dto.Dto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class showMember {
    public showMember() {
        System.out.println("회원정보");
        String sql = "select * from member";
        //sql 실행
        try {
            Connection conn = Dto.getConn();
            Statement stmt = conn.createStatement();
            ResultSet rs = Objects.requireNonNull(stmt).executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("id") + " " + rs.getString("pwd"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean idCheck(String id) {
        String sql = "select * from member where id = '" + id + "'";
        try {
            Connection conn = Dto.getConn();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
