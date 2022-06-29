package dao.login;

import dto.dto;
import dto.memberDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginSave {
    protected loginSave() throws SQLException {
        String sql = "select id, isin from member where isin=1";
        Connection conn = dto.getConn();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            if (rs.getString("id").equals(dto.getId())) {
                memberDto.setId(rs.getString("id"));
                memberDto.setIsin(rs.getBoolean("isin"));
            }
        }
    }
}
