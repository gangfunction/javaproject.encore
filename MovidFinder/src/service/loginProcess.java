package service;

import dao.loginCheck;
import dto.Dto;

import java.sql.SQLException;
import java.util.Scanner;


public class loginProcess {
    //로그인 처리 db
    loginProcess() throws SQLException {
        Dto.getConn();
        Scanner sc = new Scanner(System.in);
        System.out.println("로그인 정보를 입력하세요");
        System.out.println("아이디 : ");
        String id = sc.next();
        System.out.println("비밀번호 : ");
        String pwd = sc.next();
        new loginCheck(id, pwd);
        if (adCheck(id, pwd)) {
            Menu.menuSelect();
        } else {
            System.out.println("관리자 로그인 성공");
            new adminMenuPrint();
        }
    }// 로그인 처리

    private boolean adCheck(String id, String pwd) {
        return id.equals("admin") && pwd.equals("admin");
    }
}

