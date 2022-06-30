package dao.rescan;

import dto.dto;
import dto.movieDto;
import dto.seatDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class resCanSeat {
    resCanSeat() {
        System.out.println("취소하실 영화의 번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        movieDto.setPointer(num);
        String sql = "select * from reservation where num = ?";
        try{
        Connection conn = dto.getConn();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, movieDto.getPointer());
        ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
            seatDto.setResult(rs.getString("seatnumber"));
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
