package dao.movie;

import dao.admin.adminMovieList;
import dto.dto;

import java.sql.*;

public class movieList extends adminMovieList {
    public movieList() {
        try {
            String sql2 = "select movie_name, audience from movie";
            Connection conn = dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql2);
            ResultSet rs = pstmt.executeQuery(sql2);
            int i = 1;
            while (rs.next()) {
                String movie_name = rs.getString("movie_name");
                String audience = rs.getString("audience");
                System.out.println(i++ + "번째 영화" + "  " + "현재남은 좌석수:" + audience + "명   " + "영화이름:" + movie_name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
