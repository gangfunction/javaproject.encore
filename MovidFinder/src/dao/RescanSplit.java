package dao;

import dto.SeatDto;

public class RescanSplit{
    //저장한 좌석의 글자를 두개로 나누는 메소드
    RescanSplit() {
        SeatDto.setColumn(String.valueOf(SeatDto.getCanSeat().charAt(0)));
        SeatDto.setRow(String.valueOf(SeatDto.getCanSeat().charAt(1)));

    }
}
