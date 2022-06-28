package dao.reserve;

import dto.dto;
import dto.movieDto;
import dto.seatDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class rescanSeat {
    rescanSeat() throws SQLException {
        String sql = "select * from reservation where num = ?";
        Connection conn = dto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, movieDto.getPointer());
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            seatDto.setCanSeat(rs.getString("seatnumber"));
            new resCanSplit();
        }
    }
}
