package service;

import dao.login.logoutUpdate;
import dto.memberDto;

import java.sql.SQLException;

public class logoutProcess {
    logoutProcess() throws SQLException {
        System.out.println("로그아웃 처리");
        memberDto.setIsin(false);
        new logoutUpdate();
        new serviceMenu();
    }
}
