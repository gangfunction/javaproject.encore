package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RandomDao {

    public static void countAll() throws SQLException {
        String sql = "SELECT COUNT(*) FROM box_office";
        Connection conn = Dao.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery(sql);
        while (rs.next()) {
            int count = rs.getInt(1);
            System.out.println("전체 영화의 개수는 " + count + "개 입니다.");
        }
        randomMovie();
    }

    //count의 갯수를 빼고 랜덤으로 10개의 영화를 가능하게 표시한다.
    public static void randomMovie() throws SQLException {
        System.out.println("현재 상영중인 영화들만 출력합니다.");
        Connection conn = Dao.getConn();
        String sql = "SELECT movie_name FROM box_office order by rand()LIMIT 10";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery(sql);
        System.out.println("현재 상영중인 영화는 다음과 같습니다.");
        while (rs.next()) {
            System.out.println(rs.getString("movie_name"));
        }
    }
}





