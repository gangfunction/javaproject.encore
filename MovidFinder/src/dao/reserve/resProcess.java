package dao.reserve;

import dto.memberDto;
import service.*;

import java.sql.SQLException;


public class resProcess {
    public resProcess() {
        if (memberDto.getIsin()) {
            try {
                new movieList();
                new movieReserve();
                new seatSelectPosition();
                new seatResult();
                new seatReserve();
                new resGenerator();
                System.out.println("좌석 예약되었습니다.");
                new serviceMenu();
            } catch (SQLException e) {
                System.out.println("예매에 실패하였습니다.");
            }
        }
    }


}

