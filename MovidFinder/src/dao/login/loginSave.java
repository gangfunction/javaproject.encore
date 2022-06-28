package dao.login;

import dto.dto;
import dto.memberDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginSave {
    public loginSave(String id) throws SQLException {
        String sql = "select id, isin from member where isin=1";
        Connection conn = dto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            if (rs.getString("id").equals(id)) {
                memberDto.setId(rs.getString("id"));
                memberDto.setIsin(rs.getBoolean("isin"));
            }
        }
    }
}
