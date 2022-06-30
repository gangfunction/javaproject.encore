package dao.login;

import dao.admin.adminMain;
import dto.memberDto;
import service.serviceMenu;

import java.sql.SQLException;
import java.util.Scanner;


public class loginProcess {
    //로그인 처리 db
    protected loginProcess() throws SQLException {
        new loginInput();
        new adCheck();
        new loginCheck();
        memberDto.setIsin(true);
        if (memberDto.getAdmin()) {
            System.out.println("관리자 로그인 성공");
            new loginUpdate();
            new loginSave();
            adminMain.main();
        }
        else
        {
            System.out.println("일반 회원 로그인");
            new serviceMenu();
        }
    }

}// 로그인 처리



