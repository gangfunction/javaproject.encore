package dao;

import dto.Dto;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class resetLoginList {
    public resetLoginList() throws SQLException {
        Dto.getConn();
        String sql = "update member set isin = 0";
        PreparedStatement pstmt = Dto.getConn().prepareStatement(sql);
        pstmt.executeUpdate();
    }
}
