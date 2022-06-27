package dao;

import dto.Dto;
import dto.MovieDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class movieReserve1{
    public movieReserve1() {
        try {
            String sql = "insert into reservation(movie_name) select movie_name from movie where num =?";
            Connection conn = Dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, MovieDto.getPointer());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
