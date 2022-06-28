package dao.movie;

import dto.dto;
import dto.movieDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class movieCanUpdate {
    protected movieCanUpdate() throws SQLException {
        Connection conn = dto.getConn();
        String sql = "update movie set audience=? where num =? ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        movieDto.canAudience();
        pstmt.setInt(1, movieDto.getAudience());
        pstmt.setInt(2, movieDto.getPointer());
        pstmt.executeUpdate();
        System.out.println("예약이 취소되었습니다.");
    }
}
