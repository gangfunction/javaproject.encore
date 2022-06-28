package service;

import dao.movie.movieReserve;
import dto.memberDto;
import dto.movieDto;

import java.sql.SQLException;


public class resProcess {
    public resProcess() {
        if (memberDto.getIsin()) {
            try {
                new movieSelect();
                new movieReserve();
                System.out.println(" || " + movieDto.getMovieName() + " || " + "해당 영화의 좌석 정보입니다.");
                new seatShowing();
                new seatSelectColumn();
                new seatSelectRow();
                new seatResult();
                movieDto.setReserved(true);
                new serviceMenu();
            } catch (SQLException e) {
                System.out.println("예매에 실패하였습니다.");
            }
        }
    }


}

