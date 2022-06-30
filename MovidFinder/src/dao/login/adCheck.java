package dao.login;

import dto.memberDto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class adCheck {
    adCheck(){
        try{
            String sql= "select admin from member where id = ? and pwd=?";
            PreparedStatement stmt = dto.dto.getConn().prepareStatement(sql);
            stmt.setString(1, memberDto.getId() );
            stmt.setString(2, memberDto.getPwd() );
            ResultSet rs = stmt.executeQuery();
            if(rs.next() && rs.getInt("admin") == 1){
                System.out.println("관리자입니다.");
                memberDto.setAdmin(true);
            }else{
                memberDto.setAdmin(false);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
