package dao;

import dto.Dto;
import service.Menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ddlRegister{
    public ddlRegister(String id, String pwd, Boolean admin) throws SQLException {
        PreparedStatement pstmt;
        Connection conn = Dto.getConn();
        String sql = "insert into member(id,pwd,isin,admin) values(?,?,false,?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,id);
        pstmt.setString(2,pwd);
        pstmt.setBoolean(3,admin);
        pstmt.executeUpdate();
        Menu.menuSelect();
    }
}
