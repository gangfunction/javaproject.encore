package dao;

import dto.Dto;
import dto.MovieDto;
import dto.SeatDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RescanSeat {
    //취소할 영화의 좌석을 저장하는 메소드
    RescanSeat() throws SQLException {
        String sql = "select * from reservation where num = ?";
        Connection conn = Dto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, MovieDto.getPointer());
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            SeatDto.setCanSeat(rs.getString("seatnumber"));
            new RescanSplit();
        }
    }
}
