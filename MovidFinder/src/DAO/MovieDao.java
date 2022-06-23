package DAO;

import Service.Menu;
import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//todo: 상영중인 영화목록을 서비스객체로 전달한다..
public class MovieDao {
    //todo: 영화목록을 10개만 받아와서 상영중인 영화로 할당한다.
    public static void insertMovieList() throws SQLException {
        System.out.println("현재 상영중인 영화를 출력합니다.");
        PreparedStatement pstmt;
        String sql = "insert into movie(movie_name, ranks) select movie_name, ranks FROM box_office order by rand()LIMIT 9" ;
        Connection conn = Dao.getConn();
        pstmt = conn.prepareStatement(sql);
        pstmt.executeUpdate();

        }

    //todo: 현재 상영중인 영화를 출력한다.
    public static void showMovieList(){
        try{
        String sql2 = "select movie_name, audience from movie";
        Connection conn = Dao.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql2);
        ResultSet rs = pstmt.executeQuery(sql2);
        int i=1;
        while (rs.next()) {
            String movie_name = rs.getString("movie_name");
            String audience = rs.getString("audience");
            System.out.println(i++ +"번째 영화"+"  "+ "현재남은 좌석수:"+audience+ "명   "+"영화이름:"+ movie_name );}}
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    //todo: 상영만료 영화 만들기
    public static void deleteMovieList() throws SQLException {
        System.out.println("상영만료 영화를 제거 합니다.");
        PreparedStatement pstmt;
        Connection conn = Dao.getConn();
        String sql = "truncate movie";
        pstmt = conn.prepareStatement(sql);
        pstmt.execute(sql);
        String sql2 = "select * from movie";
        ResultSet rs=pstmt.executeQuery(sql2);
        if(!rs.next()) {
            System.out.println("삭제가 완료되었습니다.");
        }
        Menu.menuSelect();
    }


    public static void movie_search(String movie_search, String name) {
        Scanner sc= new Scanner(System.in);

        //영화 검색기능 진입 표시
        System.out.println("영화 검색기능입니다.");
        try {
            Connection conn = Dao.getConn();
            String sql = "select * from box_office where " + movie_search + " like '%" + name + "%'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs;
            rs = pstmt.executeQuery(sql);
            System.out.println("검색을 수행했습니다.");
            System.out.println("----------------------------------------------------");
            while (rs.next()) {
                System.out.println(rs.getString("movie_name"));
            }
            System.out.println("----------------------------------------------------");
            Menu.menuSelect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void top10() throws SQLException {
        Connection conn = Dao.getConn();
        String sql = "SELECT movie_name FROM box_office order by ranks asc LIMIT 10";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        System.out.println("현재 상영중인 영화는 다음과 같습니다.");
        while (rs.next()) {
            System.out.println(rs.getString("movie_name"));
        }
    }



}
