package dao.movie;

import dto.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class movieInsertList {
    public movieInsertList() {
        try {
            System.out.println("현재 상영중인 영화를 출력합니다.");
            String sql = "insert into movie(movie_name, ranks) select movie_name, ranks FROM box_office order by rand()LIMIT 9";
            Connection conn = dto.getConn();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
