package DAO;

import DTO.DBDto;
import DTO.MemberDto;
import DTO.MovieDto;
import DTO.ResDto;
import Service.Menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RescanDao {

    public static void Rescan() throws SQLException {
        //예약자의 아이디를 입력받아서,  표시해준다.
        String sql= "select * from reservation where id = ?";
        Connection conn = DBDto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, MemberDto.getId());
        ResultSet rs = pstmt.executeQuery();
        if(ResDto.getReserved()){
            System.out.println("예약하신 영화의 시간과 이름은 다음과 같습니다.");
        }else{
            System.out.println("예약된 영화가 없습니다.");
            Menu.menuSelect();
        }
        while(rs.next()){
                System.out.println(rs.getString("num") + rs.getString("times") + " " + rs.getString("movie_name"));
        }
        System.out.println("취소하실 영화의 번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        resCancelDel(num);

    }
    static void resCancelDel(int i) throws SQLException {
        //예약자의 아이디를 입력받아서,  표시해준다.
        String sql= "delete from reservation where num = ?";
        Connection conn = DBDto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, i);
        pstmt.executeUpdate();


    }
    public static void canMovieUpdate() throws SQLException {
        Connection conn = DBDto.getConn();
        String sql = "update movie set audience=? where num =? ";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        MovieDto.canAudience();
        pstmt.setInt(1,MovieDto.getAudience());
        pstmt.setInt(2,MovieDto.getNum());
        pstmt.executeUpdate();
        System.out.println("예약이 취소되었습니다.");
    }

}
