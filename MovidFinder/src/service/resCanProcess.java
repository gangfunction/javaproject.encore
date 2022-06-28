package service;

import dao.reserve.resCan;
import dao.reserve.seatCancelUpdate;
import dto.movieDto;
import vo.seatCan;

import java.sql.SQLException;


public class resCanProcess {
    public resCanProcess() throws SQLException {
        new resCan();
        movieDto.setDaoPointer(1);
        new seatCan();
        new seatCancelUpdate();
        new serviceMenu();
    }
}
