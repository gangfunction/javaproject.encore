package dao;

import dto.Dto;
import dto.SeatDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CancelUpdate extends audienceCan {
    //예약을 취소했을때 예약을 취소할떄 사용했던 좌석번호를 사용하여 취소했다는것을 업데이트해준다.
    public CancelUpdate() throws SQLException {
        String sql = "update reservation set cancelled = ? where seatnumber=?";
        Connection conn = Dto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, 1);
        pstmt.setString(2, SeatDto.getCanSeat());
        pstmt.executeUpdate();
    }
}
