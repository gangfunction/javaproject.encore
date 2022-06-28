package service;

import dto.memberDto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class adCheck {
    adCheck(){
        try{
            String sql= "select admin from member where id = ? and pwd=?";
            PreparedStatement pstmt = dto.dto.getConn().prepareStatement(sql);
            pstmt.setString(1, memberDto.getId() );
            pstmt.setString(2, memberDto.getPwd() );
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                memberDto.setAdmin(true);
            }
            else {
                memberDto.setAdmin(false);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
