import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    static void menuPrint() {
        if (!login.logCheck) {
            System.out.println("1. 로그인");
        } else {
            System.out.println("1. 로그아웃");
        }
        System.out.println("2. 회원가입");
        System.out.println("3. 영화정보");
        if (login.logCheck) {
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
                Member.registerProcess();
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
                } else {
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
