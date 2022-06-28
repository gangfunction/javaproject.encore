package dao.movie;

import service.serviceMenu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class movieSearch {
    public movieSearch() {
        //영화 검색기능 진입 표시
        System.out.println("영화 검색기능입니다.");
        System.out.println("영화명을 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        try {
            Connection conn = dto.dto.getConn();
            String sql = "select * from box_office where movie_name "+ "like '%"  + name+ "%'";
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
            new serviceMenu();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
