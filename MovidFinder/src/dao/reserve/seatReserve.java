package dao.reserve;

import dto.dto;
import dto.memberDto;
import dto.movieDto;
import dto.seatDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class seatReserve {
    public seatReserve() {
        try {
            Connection conn = dto.getConn();
            //movieRerserve에서 영화 정보를 가져온다.
            String sql = "update reservation set reserved=? ,seatnumber=?, id=? where num =? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setBoolean(1, true);
            pstmt.setString(2, seatDto.getResult());
            pstmt.setString(3, memberDto.getId());
            pstmt.setInt(4, movieDto.getReservation_cnt());
            pstmt.executeUpdate();
            System.out.println("좌석 예약되었습니다.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
