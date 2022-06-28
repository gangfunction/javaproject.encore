package dao;

import dto.Dto;
import dto.MovieDto;
import dto.ResDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class timeSet{
    public timeSet() {
        try {
            String sql = "update reservation set times=? where num=?;";
            Connection conn = Dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, ResDto.getTime());
            pstmt.setInt(2, MovieDto.getReservation_cnt());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
