import java.sql.SQLException;
import java.util.Scanner;

public class Movie {
    static void showMovie() throws SQLException {
        System.out.println("1. 영화 인기순위(10개)");
        System.out.println("2. 영화 검색");
        // 인기순위 10개의 영화정보 출력 또는 영화 검색 기능 추가
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> View.top10();
            case 2 -> View.searchMovie();
        }

    }

}
