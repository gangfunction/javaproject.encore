package dao.login;

import dto.dTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static dto.memberDTO.id;

public class logoutUpdate {
    protected logoutUpdate() throws SQLException {
        String sql= "update member set isin=? where id=?";
        Connection conn = dTO.getConn();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setBoolean(1, false);
        stmt.setString(2, id);
        stmt.executeUpdate();
        System.out.println("로그아웃 완료");
    }
}
