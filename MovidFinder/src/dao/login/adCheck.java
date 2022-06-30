package dao.login;

import dto.dTO;
import dto.memberDTO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class adCheck {
    adCheck(){
        try{
            String sql= "select admin from member where id = ? and pwd=?";
            PreparedStatement stmt = dTO.getConn().prepareStatement(sql);
            stmt.setString(1, memberDTO.getId() );
            stmt.setString(2, memberDTO.getPwd() );
            ResultSet rs = stmt.executeQuery();
            if(rs.next() && rs.getInt("admin") == 1){
                System.out.println("관리자입니다.");
                memberDTO.setAdmin(true);
            }else{
                memberDTO.setAdmin(false);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
