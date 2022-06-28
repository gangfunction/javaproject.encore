package dao.member;

import dto.dto;
import service.serviceMenu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class memberRegister {
    public memberRegister(String id, String pwd, Boolean admin) throws SQLException {
        PreparedStatement pstmt;
        Connection conn = dto.getConn();
        String sql = "insert into member(id,pwd,isin,admin) values(?,?,false,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,id);
        pstmt.setString(2,pwd);
        pstmt.setBoolean(3,admin);
        pstmt.executeUpdate();
        new serviceMenu();
    }
}
