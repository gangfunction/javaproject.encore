import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class View {
    static PreparedStatement pstmt;

    static void top10() throws SQLException {
        String sql;
        Connection conn = dbCon.dbcon();
        sql = "create view box_office_view as select movie_name, ranks from box_office order by ranks limit 10";
        pstmt = conn.prepareStatement(sql);
        pstmt.executeUpdate();
        //처리된 결과를 출력한다.
        sql = "select * from box_office_view";
        pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("movie_name"));
        }
        //표시했던 뷰를 삭제한다
        sql = "drop view box_office_view";
        pstmt = conn.prepareStatement(sql);
        pstmt.executeUpdate();
        //연결을 끊는다.
        conn.close();
        Menu.menuSelect();

    }

    public static void searchMovie() throws SQLException {
        //영화 검색 기능 추가;
        System.out.println("1. 영화 이름으로 검색");
        System.out.println("2. 영화 장르로 검색");
        System.out.println("3. 영화 개봉일자로 검색");
        System.out.println("4. 영화 감독으로 검색");
        Scanner sc = new Scanner(System.in);
        int movie_search = sc.nextInt();
        switch (movie_search) {
            case 1:
                System.out.println("영화 이름을 입력하세요");
                String name = sc.next();
                View.movie_name("movie_name", name);
                break;
            case 2:
                System.out.println("영화 장르를 입력하세요");
                name = sc.next();
                View.movie_name("genre", name);
                break;

            case 3:
                System.out.println("영화 개봉일을 입력하세요");
                name = sc.next();
                View.movie_name("release_date", name);
                break;

            case 4:
                System.out.println("영화 감독을 입력하세요");
                name = sc.next();
                View.movie_name("director", name);
                break;

            default:
                System.out.println("잘못 입력하셨습니다.");
                break;

        }
    }

    private static void movie_name(String movie_search,String name) throws SQLException {
        //영화 검색기능 진입 표시
        System.out.println("영화 검색기능입니다.");
        try {
            Connection conn = dbCon.dbcon();
            String sql;
            sql="select * from box_office where "+movie_search+" like '%"+name+"%'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs;
            rs = pstmt.executeQuery(sql);
            System.out.println("검색을 수행했습니다.");
            while (rs.next()) {
                System.out.println(rs.getString("movie_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Menu.menuSelect();
    }

}
