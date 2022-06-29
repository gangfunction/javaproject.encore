package service;

import dao.login.loginMain;
import dto.memberDto;

import java.sql.SQLException;

public class logoutProcess {
    logoutProcess() throws SQLException {
        System.out.println("로그아웃 처리");
        if(memberDto.getIsin()){
            memberDto.setIsin(false);
            memberDto.setLoginCheck(4);
            loginMain.main();
        }else{
            System.out.println("로그인이 되어있지 않습니다.");
        }
        new serviceMenu();

    }
}
