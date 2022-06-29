package service;

import dao.member.memberRegister;
import dto.memberDto;

import java.sql.SQLException;

public class PageorRegister {
    public PageorRegister() throws SQLException {
        if(memberDto.getIsin()){
            new myPage();
            new serviceMenu();
        }
        else{
            new memberRegister();
            new serviceMenu();
        }
    }
}
