package dao.reserve;

import dto.dto;
import dto.movieDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class movieReserve {
    public movieReserve() {
        Scanner sc = new Scanner(System.in);
        System.out.println("선택하신 영화의 번호를 입력하세요");
        int movie_id = sc.nextInt();
        movieDto.setPointer(movie_id);
        System.out.println("영화를 선택하셨습니다. 선택하신 영화의 정보는 다음과 같습니다.");
        try {
            Connection conn = dto.getConn();
            PreparedStatement stmt = conn.prepareStatement("insert into reservation(movie_name) select movie_name from movie where num =?");
            stmt.setInt(1, movieDto.getPointer());
            stmt.executeUpdate();
            stmt = conn.prepareStatement("select movie_name from reservation where num=?");
            stmt.setInt(1, movieDto.getPointer());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                movieDto.setMovieName(rs.getString("movie_name"));
            }
            stmt = conn.prepareStatement("update movie set audience = ? where num = ?");
            stmt.setInt(1, movieDto.getAudience());
            stmt.setInt(2, movieDto.getPointer());
            stmt.executeUpdate();
            stmt = conn.prepareStatement("select * from box_office where movie_name='" + movieDto.getMovieName() + "'");
            rs = stmt.executeQuery();
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
