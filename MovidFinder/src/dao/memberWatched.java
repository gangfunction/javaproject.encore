package dao;

import dto.Dto;
import dto.MemberDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class memberWatched extends reviewInsert {
    memberWatched() {
        System.out.println("회원님이 시청하셨던 영화는 다음과 같습니다.");
        Connection conn = Dto.getConn();
        String sql = "select * from reservation where id = ?";
        PreparedStatement pstmt;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, MemberDto.getId());
            ResultSet rs = pstmt.executeQuery();
            if (!rs.next()) {
                System.out.println("시청하신 영화가 없으시군요? 프로그램을 종료하겠습니다.");
                System.exit(0);
            }
            while (rs.next()) {
                System.out.println(rs.getString("num") + " 번째 예약하셨던 " + rs.getString("movie_name") + " 영화입니다.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
