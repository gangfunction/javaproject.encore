package service;

import dao.Movie;
import dto.MovieDto;
import utility.timeSelect;
import vo.seatShowing;

import java.sql.SQLException;


public class Reservation {
    Reservation() {
        try{
            new MovieSelect();
            new Movie();
            System.out.println(" || "+MovieDto.getMovieName()+" || " + "해당 영화의 좌석 정보입니다.");
            new seatShowing();
            new timeSelect();
            new seatSelectColumn();
            new seatSelectRow();
            new seatResult();
            MovieDto.setReserved(true);
            Menu.menuSelect();
        }catch(SQLException e)
        {
        System.out.println("예매에 실패하였습니다.");
        }
    }


}

