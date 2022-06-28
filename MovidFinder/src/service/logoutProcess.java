package service;

import dao.logoutUpdate;
import dto.MemberDto;

import java.sql.SQLException;

public class logoutProcess {
    logoutProcess() throws SQLException {
        System.out.println("로그아웃 처리");
        MemberDto.setIsin(false);
        new logoutUpdate();
        Menu.menuSelect();
    }
}
