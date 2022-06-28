package service;

import dao.admin.adminMain;
import dao.login.loginMain;
import dto.memberDto;

import java.sql.SQLException;
import java.util.Scanner;


public class loginProcess {
    //로그인 처리 db
    loginProcess() throws SQLException {
        System.out.println("로그인 처리");
        Scanner sc = new Scanner(System.in);
        System.out.println("로그인 정보를 입력하세요");
        System.out.println("아이디 : ");
        memberDto.setId(sc.next());
        System.out.println("비밀번호 : ");
        memberDto.setPwd(sc.next());
        memberDto.setLoginCheck(1);
        new loginMain();
        new adCheck();
        memberDto.setIsin(true);
        if (memberDto.getAdmin()) {
            System.out.println("관리자 로그인 성공");
            adminMain.main();
            } else {
                System.out.println("일반 회원 로그인");
                new serviceMain();
            }
        }


}// 로그인 처리



