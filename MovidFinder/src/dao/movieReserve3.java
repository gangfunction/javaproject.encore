package dao;

import dto.Dto;
import dto.MovieDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class movieReserve3 {
    public movieReserve3() {
        try {
            new audienceUpdate();
            String sql = "update movie set audience = ? where movie_name =?";
            Connection conn = Dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, MovieDto.getAudience());
            pstmt.setString(2, MovieDto.getMovieName());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
