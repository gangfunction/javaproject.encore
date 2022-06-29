package dao.rescan;

import dto.dto;
import dto.seatDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class seatCancelUpdate {
    //예약을 취소했을때 예약을 취소할떄 사용했던 좌석번호를 사용하여 취소했다는것을 업데이트해준다.
    public seatCancelUpdate() throws SQLException {
        String sql = "update reservation set cancelled = ? where seatnumber=?";
        Connection conn = dto.getConn();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, 1);
        stmt.setString(2, seatDto.getCanSeat());
        stmt.executeUpdate();
    }
}