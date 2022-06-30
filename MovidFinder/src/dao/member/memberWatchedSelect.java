package dao.member;

import dto.dto;
import dto.movieDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class memberWatchedSelect {
    public memberWatchedSelect() {
        System.out.println("표시된 순서중 번호를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        movieDto.setPointer(sc.nextInt());
        String sql = "select * from reservation where num = ?";
        try {
            Connection conn = dto.getConn();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, movieDto.getPointer());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getString("movie_name"));
                movieDto.setMovieName(rs.getString("movie_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
