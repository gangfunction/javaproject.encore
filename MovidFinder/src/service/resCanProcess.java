package service;

import dto.memberDto;
import dto.seatDto;

import java.sql.SQLException;


public class resCanProcess {
    public resCanProcess() throws SQLException {
        if(memberDto.getIsin()){
        seatDto.setSeatPointer(1);
        new serviceMenu();
        }
    }
}
