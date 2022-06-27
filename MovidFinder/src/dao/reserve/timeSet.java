package dao.reserve;

import dto.dto;
import dto.movieDto;
import dto.resDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class timeSet{
    public timeSet() {
        try {
            String sql = "update reservation set times=? where num=?;";
            Connection conn = dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, resDto.getTime());
            pstmt.setInt(2, movieDto.getReservation_cnt());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
