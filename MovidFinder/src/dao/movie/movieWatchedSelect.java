package dao.movie;

import dto.dto;
import dto.movieDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class movieWatchedSelect {
    public movieWatchedSelect() {
        System.out.println("표시된 순서중 번호를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Connection conn = dto.getConn();
        String sql = "select * from reservation where num = ?";
        PreparedStatement stmt;
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, num);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                movieDto.setMovieName(rs.getString("movie_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
