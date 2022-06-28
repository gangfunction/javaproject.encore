package dao.review;

import dto.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class reviewDelete{
    protected reviewDelete() {
        System.out.println("영화리뷰 삭제");
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제하실 리뷰의 번호를 입력하세요");
        int num = sc.nextInt();
        Connection conn = dto.getConn();
        String sql = "delete from review where num = ?";
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, num);
            pstmt.executeUpdate();
            System.out.println("삭제 완료");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
