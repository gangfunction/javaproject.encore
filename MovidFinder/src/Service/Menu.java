package Service;

import DAO.ReserveDao;
import DTO.DBDto;
import DTO.MemberDto;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu{
    static void menuPrint() {
        if (MemberDto.getIsin()) {
            System.out.println("1. 로그아웃 2. 마이페이지 3. 영화정보 4. 영화예매 5. 예매취소 6. 종료");
        }else{
            System.out.println("1. 로그인 2. 회원가입 3. 영화정보 4. 종료");
        }
    }

    public static void menuSelect() throws SQLException {
        System.out.println("-------------------------------");
        if (MemberDto.getIsin()) {
            System.out.println("아이디 : " + MemberDto.getId());
            System.out.println("-------------------------------");
        } else {
            System.out.println("로그인이 필요합니다.");
            System.out.println("-------------------------------");
        }
        Scanner sc = new Scanner(System.in);
        menuPrint();
        int select = sc.nextInt();
        switch (select) {
            case 1:
                System.out.println("로그인");
                if (!MemberDto.getIsin()) {
                    login.loginProcess();
                } else {
                    logout.logoutProcess();
                }
            case 2:
                if (MemberDto.getIsin()) {
                    System.out.println("마이페이지");
                    MemberDto.myPage();
                } else {
                    ServiceMember.registerProcess();
                }
            case 3:
                System.out.println("영화정보");
                Movie.selectMovie();
            case 4:
                System.out.println("영화예매");
                if (MemberDto.getIsin()) {
                    Reservation.MovieSelect();
                } else {
                    System.out.println("로그인이 필요합니다.");
                }
            case 5:
                System.out.println("예매취소");
                if (MemberDto.getIsin()) {
                    Rescan.RescanProcess();
                } else {
                    System.out.println("로그인이 필요합니다.");
                }
            case 6:
                System.out.println("복구");
                ReserveDao.createTableReserve();
                Menu.menuSelect();
                break;
            case 7:
                System.out.println("종료");
                DBDto.getClose();
                break;
            case 8:
                System.out.println("실험");

            default:
                System.out.println("잘못된 입력");
                break;
        }
    }



}
