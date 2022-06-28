package dao.admin;

import dto.dto;
import service.serviceMenu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class adminCreateTable {
     protected adminCreateTable() throws SQLException {
        try {
            String sql = "create table reservation(num int primary key auto_increment, movie_name varchar(20), reserved boolean, seatnumber varchar(20), times varchar(20), id varchar(20))";
            Connection conn = dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.execute(sql);
        } catch (SQLException e) {
            new serviceMenu();
        }
    }
}
