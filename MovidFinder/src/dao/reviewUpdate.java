package dao;

import dto.Dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class reviewUpdate{
    public reviewUpdate() {
        System.out.println("영화리뷰 수정");
        Scanner sc = new Scanner(System.in);
        System.out.println("수정하실 리뷰의 번호를 입력하세요");
        int num = sc.nextInt();
        System.out.println("수정하실 리뷰의 제목을 입력하세요");
        String title = sc.next();
        System.out.println("수정하실 리뷰의 내용을 입력하세요");
        String content = sc.next();
        Connection conn = Dto.getConn();
        String sql = "update review set title = ?, content = ? where num = ?";
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);
            pstmt.setString(2, content);
            pstmt.setInt(3, num);
            pstmt.executeUpdate();
            System.out.println("수정 완료");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
