package vo;

import dto.movieDto;

public class seatShowing {
    public seatShowing() {
        if (movieDto.getPointer() == 1) {
            new seatTheater();
        } else {
            System.out.println("영화 정보가 없습니다.");
        }
    }
}
