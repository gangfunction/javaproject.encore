package dao;

import dto.Dto;
import dto.MemberDto;
import dto.MovieDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class reviewInsert {
    public reviewInsert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("영화리뷰 입력");
        new memberWatched();
        new watchedSelect();
        System.out.println("제목을 입력하세요");
        String title = sc.next();
        System.out.println("내용을 입력하세요");
        String content = sc.next();
        Connection conn = Dto.getConn();
        // 회원이 봤던 영화 메소드를 호출한다.
        String sql = "insert into review(id,title,content,movie_name) values(?,?,?,?)";
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, MemberDto.getId());
            pstmt.setString(2, title);
            pstmt.setString(3, content);
            pstmt.setString(4, MovieDto.getMovieName());
            pstmt.executeUpdate();
            System.out.println("등록 완료");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
