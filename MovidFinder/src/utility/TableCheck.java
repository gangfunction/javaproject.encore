package utility;

import dto.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableCheck {
    //reservation  table이 존재하는지 확인한다.
    public static boolean reserveTableCheck() {
        try {
            String sql = "select * from reservation";
            Connection conn = dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
