package dao;

import dto.Dto;
import dto.MovieDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class movieReserve4 {

    public movieReserve4()
    {
        try
        {
            String sql = "select * from box_office where movie_name='" + MovieDto.getMovieName() + "'";
            Connection conn = Dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);
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
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
