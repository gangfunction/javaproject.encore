package dao.rescan;

import dao.rescan.rescanSeat;
import dto.dto;
import dto.memberDto;
import dto.movieDto;
import service.serviceMenu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class resCan {
    //todo: 첫번쨰 예약한것은 보이지 않는 문제가 있다.
    public resCan() throws SQLException {
        //예약자의 아이디를 입력받아서,  표시해준다.
        String sql = "select * from reservation where id = ? and cancelled = 0";
        Connection conn = dto.getConn();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, memberDto.getId());
        ResultSet rs = stmt.executeQuery();
        if (movieDto.getReserved()) {
            System.out.println("예약하신 영화의 시간과 이름은 다음과 같습니다.");
        } else {
            System.out.println("예약된 영화가 없습니다.");
            new serviceMenu();
        }
        while (rs.next()) {
            System.out.println(rs.getString("num") + "   " + rs.getString("times") + " " + rs.getString("movie_name") + " " + rs.getString("seatnumber"));
        }
        System.out.println("취소하실 영화의 번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        movieDto.setPointer(num);

    }
}
