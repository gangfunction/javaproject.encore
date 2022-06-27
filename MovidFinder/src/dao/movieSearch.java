package dao;

import dto.Dto;
import service.Menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class movieSearch {
    public movieSearch(String movie_search, String name) {
        //영화 검색기능 진입 표시
        System.out.println("영화 검색기능입니다.");
        try {
            Connection conn = Dto.getConn();
            String sql = "select * from box_office where " + movie_search + " like '%" + name + "%'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs;
            rs = pstmt.executeQuery(sql);
            if (rs.next()) {
                System.out.println("----------------------------------------------------");
            }
            while (rs.next()) {
                System.out.println(rs.getString("movie_name"));
            }
            if (rs.next()) {
                System.out.println("----------------------------------------------------");
            }
            Menu.menuSelect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
