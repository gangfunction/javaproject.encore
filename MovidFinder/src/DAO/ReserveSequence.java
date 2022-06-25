package DAO;

import DTO.DBDto;
import DTO.MovieDto;
import DTO.ResDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReserveSequence {

    public static void movieReserve1(int i) {
        try {
            String sql = "insert into reservation(movie_name) select movie_name from movie where num =?";
            Connection conn = DBDto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, i);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }//todo: 선택한 영화에 대해서 movie 테이블의  audience 0인지 확인하고 아닐시  수를 하나 줄이고 예매할 좌석을 입력받는다.

    public static void movieReserve2() {
        try {
            String sql = "update movie set audience = ? where num =?";
            Connection conn = DBDto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            MovieDto.setAudience();
            pstmt.setInt(1, MovieDto.getAudience());
            pstmt.setInt(2, ResDto.getReservation_cnt());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }//todo: 선택한 영화의 이름을 가져와서 box_office의 movie_name과 일치하는지 확인하고 일치하면 box_offce의 행을 출력한다.

    public static void movieReserve3() {
        try {
            String sql = "select movie_name from movie where num='" + ResDto.getReservation_cnt() + "'";
            Connection conn = DBDto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);
            while (rs.next()) {
                String movie_name = rs.getString("movie_name");
                movieReserve4(movie_name);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void movieReserve4(String movie_name) {
        try {
            String sql = "select * from box_office where movie_name='" + movie_name + "'";
            Connection conn = DBDto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);
            if (rs.next()) {
                String movie_name2 = rs.getString("movie_name");
                String year = rs.getString("years");
                String ranks = rs.getString("ranks");
                String genre = rs.getString("genre");
                String director = rs.getString("director");
                System.out.println("영화이름:" + movie_name2 + "\n" + "년도:" + year + "\n" + "순위:" + ranks + "\n" + "장르:" + genre + "\n" + "감독:" + director + "\n");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}