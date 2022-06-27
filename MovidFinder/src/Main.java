<<<<<<< Updated upstream
import java.lang.reflect.Member;
import java.sql.*;
import java.util.Scanner;
=======
import dao.movie.initialProcess;
import service.serviceMenu;

import java.sql.SQLException;
>>>>>>> Stashed changes

public class Main{
    public static void main(String[] args) throws SQLException {
        // 어서오세요 메세지 출력
<<<<<<< Updated upstream
=======
        dto.dto.dbCon();
        new initialProcess();

>>>>>>> Stashed changes
        System.out.println("어서오세요");

        //jdbc를 연결한다.
        dbCon.Con();
        //메뉴선택
        new serviceMenu();
    }

}
public class Menu {
    static void menuPrint() {
        if (!login.logCheck)
        {
            System.out.println("1. 로그인");
        }
        else{
            System.out.println("1. 로그아웃");
        }
        System.out.println("2. 회원가입");
        System.out.println("3. 영화정보");
        if(login.logCheck)
        {
            System.out.println("4. 영화예매");
            System.out.println("5. 예매내역");
        }
        System.out.println("6. 작업중");

    }
    static void menuSelect() throws SQLException {
        if (login.logCheck) {
            System.out.println("로그인 상태입니다.");
        } else {
            System.out.println("로그인 상태가 아닙니다.");
        }
        Scanner sc = new Scanner(System.in);
        menuPrint();
        int select = sc.nextInt();
        switch (select) {
            case 1:
                System.out.println("로그인");
                if (!login.logCheck) {
                    login.loginProcess();
                } else {
                    login.logoutProcess();
                }
                break;
            case 2:
                System.out.println("회원가입");
                registerUser();
                Member.showMember();
                break;
            case 3:
                System.out.println("영화정보");
                Movie.showMovie();
                break;
            case 4:
                System.out.println("영화예매");
                if (login.logCheck) {
                    Booking.booking();
                } else {
                    System.out.println("로그인이 필요합니다.");
                }
                break;
            case 5:
                System.out.println("영화예매내역");
                if (login.logCheck) {
                    Booking.showBooking();
                }else{
                    System.out.println("로그인이 필요합니다.");
                    break;
                }
            case 6:
                Random.countAll();
                break;
            default:
                System.out.println("잘못된 입력");
                break;
        }
    }




}
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

public class Seats {
    static void seatSelectColumn() throws SQLException {
        System.out.println("열을 선택하세요");
        System.out.println("1. A열");
        System.out.println("2. B열");
        System.out.println("3. C열");
        System.out.println("4. D열");
        System.out.println("5. E열");
        Scanner sc = new Scanner(System.in);
        int columnSelect = sc.nextInt();
        switch (columnSelect) {
            case 1 -> seatSelectRow("A");
            case 2 -> seatSelectRow("B");
            case 3 -> seatSelectRow("C");
            case 4 -> seatSelectRow("D");
            case 5 -> seatSelectRow("E");
        }
        //좌석예약한 갯수 표시
        static void seatCount() throws SQLException {
            Connection con=dbCon.dbcon();
            Statement stmt=  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select reserved from seat ");
            int rowCount=rs.getRow();
            System.out.println("예매된 좌석의 갯수는 "+rowCount+"개 입니다.");
            con.close();
            Menu.menuSelect();
        }

        public static void seatSelectRow(String i) throws SQLException {
            // 순서를 선택할수 있는 메소드
            System.out.println("순서를 선택하세요");
            System.out.println("1. 첫번째");
            System.out.println("2. 두번째");
            System.out.println("3. 셋번째");
            System.out.println("4. 네번째");
            System.out.println("5. 다섯번째");
            System.out.println("6. 여섯번째");
            //switch 문으로 순서를 선택할수 있는 메소드를 만들어야한다.
            Scanner sc = new Scanner(System.in);
            int rowSelect = sc.nextInt();
            switch (rowSelect) {
                case 1 -> seatSelect(i, 1);
                case 2 -> seatSelect(i, 2);
                case 3 -> seatSelect(i, 3);
                case 4 -> seatSelect(i, 4);
                case 5 -> seatSelect(i, 5);
                case 6 -> seatSelect(i, 6);
            }

        }

        private static void seatSelect(String i, int i1) throws SQLException {
            //선택환 좌석을 출력하는 메소드
            System.out.println("선택한 좌석은 "+i+i1+"입니다.");
            //선택한 좌석을 예매할 것인지 아니면 다른 좌석을 선택할 것인지 선택할수 있는 메소드
            System.out.println("예매하시겠습니까?(y/n)");
            Scanner sc = new Scanner(System.in);
            String select = sc.next();
            if(select.equals("y")) {
                //예매하는 메소드
                seatReserve(i,i1);
            }else if(select.equals("n")) {
                //다른 좌석을 선택하는 메소드
                seatSelectRow(i);
            }
        }
        //좌석을 예매하는 메소드
        private static void seatReserve(String i, int i1) throws SQLException {
            Connection con=dbCon.dbcon();
            Statement stmt=  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "insert into seat(reserved, seatnumber) values(true ,'"+i+i1+"')";
            stmt.executeUpdate(sql);
            System.out.println("좌석 예약되었습니다.");
            seatCount();
            con.close();
        }
        //예매내용 확인 메소드

    }


