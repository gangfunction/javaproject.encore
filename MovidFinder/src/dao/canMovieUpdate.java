package dao;

import dto.Dto;
import dto.MovieDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class canMovieUpdate extends RescanSplit {
    public canMovieUpdate() throws SQLException {
        Connection conn = Dto.getConn();
        String sql = "update movie set audience=? where num =? ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        MovieDto.canAudience();
        pstmt.setInt(1, MovieDto.getAudience());
        pstmt.setInt(2, MovieDto.getPointer());
        pstmt.executeUpdate();
        System.out.println("예약이 취소되었습니다.");
        new audienceCan();
    }
}
