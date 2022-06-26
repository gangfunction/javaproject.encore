package service;

import dao.RescanDao;
import dao.ReserveDao;
import dto.Dto;
import dto.MemberDto;
import vo.reviewMain;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu{
    static void menuPrint()
    {
        if (MemberDto.getIsin())
        {
            System.out.println("0.게시판 접속  1. 로그아웃 2. 로그아웃  3. 영화검색  4. 영화예매  5. 예매취소 5. 종료");
        }else
        {
            System.out.println( "1. 로그인 2. 회원가입 3. 영화검색 4. 종료");
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
            case 0:{
                System.out.println("게시판 접속");
                reviewMain.menuprint();
                break;}
            case 1:
                if (!MemberDto.getIsin()) {
                    Login.loginProcess();
                } else {
                    Logout.logoutProcess();
                }
            case 2:
                if (MemberDto.getIsin()) {
                    Logout.logoutProcess();
                } else {
                    Member.registerProcess();
                }
            case 3:
                Movie.selectMovie();
            case 4:
                if (MemberDto.getIsin()) {
                    Reserve.Reservation();
                } else {
                    System.out.println("로그인이 필요합니다.");
                }
            case 5:
                if (MemberDto.getIsin()) {
                    RescanDao.RescanProcess();
                }
            case 6:
                ReserveDao.createTableReserve();
                Menu.menuSelect();
                break;
            case 7:
                Dto.getClose();
                break;
            case 8:
                System.out.println("실험");
                reviewMain.menuprint();
                break;

            default:
                System.out.println("잘못된 입력");
                break;
        }
    }
}
