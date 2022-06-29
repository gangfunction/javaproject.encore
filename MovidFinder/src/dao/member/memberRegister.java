package dao.member;

import dto.dto;
import service.serviceMenu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class memberRegister {
    public memberRegister() throws SQLException {
        PreparedStatement stmt;
        Connection conn = dto.getConn();
        String sql = "insert into member(id,pwd,isin,admin) values(?,?,true,?)";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, dto.getId());
        stmt.setString(2,dto.getPwd());
        stmt.setBoolean(3,dto.getAdmin());
        stmt.executeUpdate();
        new serviceMenu();
    }
}
