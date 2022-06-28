package dao.member;

import dto.dto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class memberShow extends idCheck {
    public memberShow() {
        System.out.println("회원정보");
        String sql = "select * from member where id = '" + dto.getId() + "'";
        //sql 실행
        try {
            Connection conn = dto.getConn();
            Statement stmt = conn.createStatement();
            ResultSet rs = Objects.requireNonNull(stmt).executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("id") + " " + rs.getString("pwd"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
