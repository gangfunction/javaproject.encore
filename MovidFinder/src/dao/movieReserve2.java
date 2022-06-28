package dao;

import dto.Dto;
import dto.MovieDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class movieReserve2 extends movieReserve1 {
    //영화 이름을 받아와서 현재 선택한 영화로 저장하는 메소드 생성
    public movieReserve2() {
        try {
            String sql = "select movie_name from reservation where num=?";
            Connection conn = Dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, MovieDto.getPointer());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                MovieDto.setMovieName(rs.getString("movie_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
