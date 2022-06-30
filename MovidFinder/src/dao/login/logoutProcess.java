package dao.login;

import dto.memberDTO;
import service.serviceMenu;

import java.sql.SQLException;

public class logoutProcess {
    logoutProcess() throws SQLException {
        System.out.println("로그아웃 처리");
        if(memberDTO.getIsin()){
            memberDTO.setIsin(false);
            new logoutUpdate();
        }else{
            System.out.println("로그인이 되어있지 않습니다.");
        }
        new serviceMenu();

    }
}
