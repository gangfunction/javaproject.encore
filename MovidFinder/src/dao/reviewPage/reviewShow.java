package dao.reviewPage;

import dto.dTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class reviewShow {
    protected reviewShow() throws SQLException {
        System.out.println("영화리뷰 출력");
        Connection conn = dTO.getConn();
        String sql = "select * from review";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("num") + "   " + rs.getString("id") + " " + rs.getString("movie_name") + " " + rs.getString("title") + " " + rs.getString("content"));
        }
    }
}
