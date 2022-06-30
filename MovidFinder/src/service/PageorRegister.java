package service;

import dao.myPage.myPage;
import dao.register.regProcess;
import dto.memberDto;

import java.sql.SQLException;

public class PageorRegister {
    public PageorRegister() throws SQLException {
        if(memberDto.getIsin()){
            new myPage();
        }
        else{
            new regProcess();
        }
        new serviceMenu();
    }
}
