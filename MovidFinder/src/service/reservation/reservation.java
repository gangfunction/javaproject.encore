package service.reservation;

import dao.movie.movieReserve;
import dto.movieDto;
import service.*;
import utility.timeSelect;
import vo.seatShowing;

import java.sql.SQLException;


public class reservation {
    public reservation() {
        try{
            new movieSelect();
            new movieReserve();
            System.out.println(" || "+ movieDto.getMovieName()+" || " + "해당 영화의 좌석 정보입니다.");
            new seatShowing();
            new timeSelect();
            new seatSelectColumn();
            new seatSelectRow();
            new seatResult();
            movieDto.setReserved(true);
            new serviceMenu();
        }catch(SQLException e)
        {
        System.out.println("예매에 실패하였습니다.");
        }
    }


}

