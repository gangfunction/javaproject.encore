package service;

import dao.LogoutDao;
import dto.MemberDto;

import java.sql.SQLException;

public class Logout {
    static void logoutProcess() throws SQLException {
        System.out.println("로그아웃 처리");
        MemberDto.setIsin(false);
        LogoutDao.logoutUpdate();
        Menu.menuSelect();
    }
}
