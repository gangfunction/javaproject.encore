package dao.rescan;

import dao.rescan.resCanSplit;
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
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, movieDto.getPointer());
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            seatDto.setCanSeat(rs.getString("seatnumber"));
            new resCanSplit();
        }
    }
}
