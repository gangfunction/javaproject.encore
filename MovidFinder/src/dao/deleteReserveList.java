package dao;

import dto.Dto;
import utility.TableCheck;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class deleteReserveList{
    public deleteReserveList() {
        try {
            TableCheck.reserveTableCheck();
            Connection conn = Dto.getConn();
            PreparedStatement pstmt;
            String sql = "truncate reservation";
            pstmt = conn.prepareStatement(sql);
            pstmt.execute(sql);
            String sql2 = "select * from reservation";
            ResultSet rs = pstmt.executeQuery(sql2);
            rs.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
