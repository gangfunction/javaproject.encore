package dao;

import dto.Dto;
import dto.MemberDto;
import dto.MovieDto;
import service.Menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Rescan {
    //todo: 첫번쨰 예약한것은 보이지 않는 문제가 있다.
    public Rescan() throws SQLException {
        //예약자의 아이디를 입력받아서,  표시해준다.
        String sql = "select * from reservation where id = ? and cancelled = 0";
        Connection conn = Dto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, MemberDto.getId());
        ResultSet rs = pstmt.executeQuery();
        if (MovieDto.getReserved()) {
            System.out.println("예약하신 영화의 시간과 이름은 다음과 같습니다.");
        } else {
            System.out.println("예약된 영화가 없습니다.");
            Menu.menuSelect();
        }
        while (rs.next()) {
            System.out.println(rs.getString("num") + "   " + rs.getString("times") + " " + rs.getString("movie_name") + " " + rs.getString("seatnumber"));
        }
        System.out.println("취소하실 영화의 번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        MovieDto.setPointer(num);
        new RescanSeat();

    }
}
