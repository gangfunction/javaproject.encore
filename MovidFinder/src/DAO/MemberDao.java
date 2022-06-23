package DAO;

import java.sql.*;
import java.util.Objects;

public class MemberDao {
    public static void showMember() {
        System.out.println("회원정보");
        String sql = "select * from member";
        //sql 실행
        try {
            Connection conn = Dao.getConn();
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
