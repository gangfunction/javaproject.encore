package dao.reviewPage;

import dao.member.memberWatched;
import dao.movie.movieWatchedSelect;
import dto.dto;
import dto.memberDto;
import dto.movieDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class reviewInsert {
    protected reviewInsert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("영화리뷰 입력");
        new memberWatched();
        new movieWatchedSelect();
        System.out.println("제목을 입력하세요");
        String title = sc.next();
        System.out.println("내용을 입력하세요");
        String content = sc.next();
        Connection conn = dto.getConn();
        // 회원이 봤던 영화 메소드를 호출한다.
        String sql = "insert into review(id,title,content,movie_name) values(?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, memberDto.getId());
            stmt.setString(2, title);
            stmt.setString(3, content);
            stmt.setString(4, movieDto.getMovieName());
            stmt.executeUpdate();
            System.out.println("등록 완료");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
