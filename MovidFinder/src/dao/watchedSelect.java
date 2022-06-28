package dao;

import dto.Dto;
import dto.MovieDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class watchedSelect{
    watchedSelect() {
        System.out.println("표시된 순서중 번호를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Connection conn = Dto.getConn();
        String sql = "select * from reservation where num = ?";
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, num);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                MovieDto.setMovieName(rs.getString("movie_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
