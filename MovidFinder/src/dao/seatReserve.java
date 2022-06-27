package dao;

import dto.Dto;
import dto.MemberDto;
import dto.MovieDto;
import dto.SeatDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class seatReserve {
    public seatReserve() throws SQLException {
        try {
            Connection conn = Dto.getConn();
            //movieRerserve에서 영화 정보를 가져온다.
            String sql = "update reservation set reserved=? ,seatnumber=?, id=? where num =? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setBoolean(1, true);
            pstmt.setString(2, SeatDto.getResult());
            pstmt.setString(3, MemberDto.getId());
            pstmt.setInt(4, MovieDto.getReservation_cnt());
            pstmt.executeUpdate();
            System.out.println("좌석 예약되었습니다.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
