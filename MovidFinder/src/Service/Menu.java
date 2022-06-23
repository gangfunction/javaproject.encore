package Service;

import DAO.MovieDao;
import DAO.ReserveDao;
import DTO.Dto;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu{
    static void menuPrint() {
        if (!Dto.getisin()) {
            System.out.println("1. 로그인");
        } else {
            System.out.println("1. 로그아웃");
        }
        System.out.println("2. 회원가입");
        System.out.println("3. 영화정보");
        if (Dto.getisin()) {
            System.out.println("4. 영화예매");
            System.out.println("5. 예매내역");
        }
        System.out.println("6. 작업중");
        System.out.println("7. 영화제거");

    }

    public static void menuSelect() throws SQLException {
        if (Dto.getisin()) {
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
                if (!Dto.getisin()) {
                    login.loginProcess();
                } else {
                    login.logoutProcess();
                }
            case 2:
                System.out.println("회원가입");
                ServiceMember.registerProcess();
            case 3:
                System.out.println("영화정보");
                Movie.selectMovie();
            case 4:
                System.out.println("영화예매");
                if (Dto.getisin()) {
                    Booking.booking();
                } else {
                    System.out.println("로그인이 필요합니다.");
                }
            case 5:
                System.out.println("영화예매내역");
                if (Dto.getisin()) {
                    ReserveDao.showReserve();
                } else {
                    System.out.println("로그인이 필요합니다.");
                }
            case 6:
                System.out.println("접속중인 사용자 정보");
                //dto에 입력된 정보를 출력
                System.out.println("아이디 : " + Dto.getId());
                System.out.println("접속 여부 : " + Dto.getisin());
                Menu.menuSelect();
                break;
            case 7:
                System.out.println("영화제거");
                MovieDao.deleteMovieList();
                ReserveDao.deleteReserveList();
                break;
            default:
                System.out.println("잘못된 입력");
                break;
        }
    }



}
