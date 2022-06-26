package service;

import dao.LoginDao;
import dto.Dto;
import dto.MemberDto;

import java.sql.SQLException;
import java.util.Scanner;

public class Login {
    //로그인 처리 db
    static void loginProcess() throws SQLException {
        Dto.getConn();
        Scanner sc = new Scanner(System.in);
        System.out.println("로그인 정보를 입력하세요");
        System.out.println("아이디 : ");
        MemberDto.setId(sc.next());
        System.out.println("비밀번호 : ");
        String pwd=sc.next();
        LoginDao.loginCheck(id, pwd);
        if (Admin.adCheck()) {
            System.out.println("관리자 로그인 성공");
            Admin.adminMenuPrint();
        } else {
            Menu.menuSelect();
        }
    }// 로그인 처리
}
