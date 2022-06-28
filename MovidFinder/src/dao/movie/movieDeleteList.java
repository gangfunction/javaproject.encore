package dao.movie;

import dto.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class movieDeleteList{
    protected movieDeleteList() {
        try {
            PreparedStatement pstmt;
            Connection conn = dto.getConn();
            String sql = "truncate movie";
            pstmt = conn.prepareStatement(sql);
            pstmt.execute(sql);
            String sql2 = "select * from movie";
            ResultSet rs = pstmt.executeQuery(sql2);
            if (!rs.next()) {
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
