package dao.movie;

import dto.dto;
import dto.movieDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class movieReserve {
    public movieReserve() {
        try {
            Connection conn = dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement("insert into reservation(movie_name) select movie_name from movie where num =?");
            pstmt.setInt(1, movieDto.getPointer());
            pstmt.executeUpdate();
            pstmt = conn.prepareStatement("select movie_name from reservation where num=?");
            pstmt.setInt(1, movieDto.getPointer());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                movieDto.setMovieName(rs.getString("movie_name"));
            }
            pstmt = dto.getConn().prepareStatement("update movie set audience = ? where movie_name = "+ movieDto.getMovieName());
            pstmt.setInt(1, movieDto.getAudience());
            pstmt.executeUpdate();
            pstmt = dto.getConn().prepareStatement("select * from box_office where movie_name='" + movieDto.getMovieName() + "'");
            rs = pstmt.executeQuery("select * from box_office where movie_name='" + movieDto.getMovieName() + "'");
            if (rs.next())
                {
                    String movie_name = rs.getString("movie_name");
                    String year = rs.getString("years");
                    String ranks = rs.getString("ranks");
                    String genre = rs.getString("genre");
                    String director = rs.getString("director");
                    System.out.println("----------------------------------------------------");
                    System.out.println("영화이름: " + movie_name + "\n" + "년도: " + year + "\n" + "순위: " + ranks + "\n" + "장르: " + genre + "\n" + "감독: " + director + "\n");
                    System.out.println("----------------------------------------------------");
                }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
