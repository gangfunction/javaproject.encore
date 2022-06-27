package service;

import dao.review.reviewMain;
import dto.memberDto;
import service.reservation.reservation;

import java.sql.SQLException;
import java.util.Scanner;

public class serviceMenu {

    public serviceMenu() throws SQLException {
        System.out.println("-------------------------------");
        if (memberDto.getIsin()) {
            System.out.println("아이디 : " + memberDto.getId());
            System.out.println("-------------------------------");
        } else {
            System.out.println("로그인이 필요합니다.");
            System.out.println("-------------------------------");
        }
        Scanner sc = new Scanner(System.in);
        new menuPrint();
        int select = sc.nextInt();
        switch (select) {
            case 0:{
                new reviewMain();
                break;}
            case 1:
                if (!memberDto.getIsin()) {
                    new loginProcess();
                } else {
                    new logoutProcess();
                }
            case 2:
                if (memberDto.getIsin()) {
                    new logoutProcess();
                } else {
                    new regProcess();
                }
            case 3:
                new selectMovie();
            case 4:
                if (memberDto.getIsin()) {
                    new reservation();
                }
            case 5:
                if (memberDto.getIsin()) {
                    new resCanProcess();
                }
            case 6:
                new serviceMenu();
                break;
            case 7:
                break;
            case 8:
                System.out.println("실험");
                new menuPrint();
                break;

            default:
                System.out.println("잘못된 입력");
                break;
        }
    }


}
