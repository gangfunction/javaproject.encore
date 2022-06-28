package dao;

import dto.Dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertMovieList {
    public insertMovieList() {
        try {
            System.out.println("현재 상영중인 영화를 출력합니다.");
            String sql = "insert into movie(movie_name, ranks) select movie_name, ranks FROM box_office order by rand()LIMIT 9";
            Connection conn = Dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
