package dao.rescan;

import dto.memberDto;
import service.serviceMenu;

import java.sql.SQLException;


public class resCanProcess {
    public resCanProcess() throws SQLException {
        if(memberDto.getIsin()){
            new resShow();
            new resCanSeat();
            new seatCancelUpdate();
            new moviePointer();
            new serviceMenu();
        }
    }
}
