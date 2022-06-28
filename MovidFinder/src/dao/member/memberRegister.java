package dao.member;

import dto.dto;
import service.serviceMenu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class memberRegister {
    public memberRegister() throws SQLException {
        PreparedStatement pstmt;
        Connection conn = dto.getConn();
        String sql = "insert into member(id,pwd,isin,admin) values(?,?,false,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, dto.getId());
        pstmt.setString(2,dto.getPwd());
        pstmt.setBoolean(3,dto.getAdmin());
        pstmt.executeUpdate();
        new serviceMenu();
    }
}
