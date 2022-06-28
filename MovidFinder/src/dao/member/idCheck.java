package dao.member;

import dto.dto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class idCheck {
    public idCheck() {
        String sql = "select * from member where id = '" + dto.getId() + "'";
        try {
            Connection conn = dto.getConn();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                dto.setDoubleCheck(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dto.setDoubleCheck(false);
    }
}
