package dao;

import dto.Dto;
import dto.MemberDto;
import dto.MovieDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ReviewDao{
    public static void reviewInsert() {
            Scanner sc = new Scanner(System.in);
            System.out.println("영화리뷰 입력");
            memberWatched();
            WatchedSelect();
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
                pstmt.setString(4,MovieDto.getMovieName());
                pstmt.executeUpdate();
                System.out.println("등록 완료");
            } catch (SQLException e) {
                e.printStackTrace();
            }

      }
      static void memberWatched(){
            System.out.println("회원님이 시청하셨던 영화는 다음과 같습니다.");
            Connection conn = Dto.getConn();
            String sql = "select * from reservation where id = ?";
            PreparedStatement pstmt;
            try {
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, MemberDto.getId());
                ResultSet rs = pstmt.executeQuery();
                if(!rs.next()){
                    System.out.println("시청하신 영화가 없으시군요? 프로그램을 종료하겠습니다.");
                    System.exit(0);
                }
                while (rs.next()) {
                    System.out.println(rs.getString("num")+" 번째 예약하셨던 "+rs.getString("movie_name")+" 영화입니다.");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
      }
      static void WatchedSelect(){
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

      public static void reviewSelect() throws SQLException {
          System.out.println("영화리뷰 출력");
          Connection conn = Dto.getConn();
          String sql="select * from review";
          PreparedStatement pstmt = conn.prepareStatement(sql);
          ResultSet rs = pstmt.executeQuery();
          while(rs.next()){
              System.out.println(rs.getString("num")+"   "+rs.getString("id")+" "+rs.getString("movie_name")+" "+rs.getString("title")+" "+rs.getString("content"));
          }
      }

      public static void reviewUpdate() {
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

      public static void reviewDelete() {
            System.out.println("영화리뷰 삭제");
            Scanner sc = new Scanner(System.in);
            System.out.println("삭제하실 리뷰의 번호를 입력하세요");
            int num = sc.nextInt();
            Connection conn = Dto.getConn();
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