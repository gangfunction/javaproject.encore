package dao.reviewPage;

import dto.memberDto;
import dto.movieDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class reviewInsert {
    reviewInsert() {
        String sql = "insert into review(id,title,content,movie_name) values(?,?,?,?)";
        PreparedStatement stmt;
        try {
            Connection conn = dto.dto.getConn();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, memberDto.getId());
            stmt.setString(2, reviewDto.getTitle());
            stmt.setString(3, reviewDto.getContent());
            stmt.setString(4, movieDto.getMovieName());
            stmt.executeUpdate();
            System.out.println("등록 완료");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
