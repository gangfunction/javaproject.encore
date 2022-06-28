package dao.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static dto.dto.getConn;

public class adminMovieList {
    protected adminMovieList(){
        try{
            Connection conn= getConn();
            String sql = "select * from box_office";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                System.out.println("----------------------------------------------------");
                System.out.println("영화이름: " + rs.getString("movie_name") + "\n" + "년도: " + rs.getString("years") + "\n" + "순위: " + rs.getString("ranks") + "\n" + "장르: " + rs.getString("genre") + "\n" + "감독: " + rs.getString("director") + "\n");
                System.out.println("----------------------------------------------------");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
