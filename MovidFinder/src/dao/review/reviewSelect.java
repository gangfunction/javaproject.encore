package dao.review;

import dto.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class reviewSelect {
    protected reviewSelect() throws SQLException {
        System.out.println("영화리뷰 출력");
        Connection conn = dto.getConn();
        String sql = "select * from review";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("num") + "   " + rs.getString("id") + " " + rs.getString("movie_name") + " " + rs.getString("title") + " " + rs.getString("content"));
        }
    }
}
