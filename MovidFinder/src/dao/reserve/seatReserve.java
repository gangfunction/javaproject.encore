package dao.reserve;

import dto.dto;
import dto.memberDto;
import dto.movieDto;
import dto.seatDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class seatReserve {
    protected seatReserve() {
        try {
            Connection conn = dto.getConn();
            String sql = "update reservation set reserved=? ,seatnumber=?, id=? where num =? ";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setBoolean(1, true);
            stmt.setString(2, seatDto.getResult());
            stmt.setString(3, memberDto.getId());
            stmt.setInt(4, movieDto.getReservation());
            stmt.executeUpdate();
            movieDto.setReserved(true);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
