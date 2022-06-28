package service;

import dto.movieDto;
import vo.seatTheater;

public class seatShowing{
    public seatShowing(){
        if (movieDto.getPointer() == 1) {
            new seatTheater();
        } else {
            System.out.println("영화 정보가 없습니다.");
        }
    }
}
