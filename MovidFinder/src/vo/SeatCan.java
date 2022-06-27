package vo;

import dto.MovieDto;

public class SeatCan {
    public SeatCan() {
        if (MovieDto.getPointer() == 1) {
            new SeatCan1();
        } else {
            System.out.println("영화 정보가 없습니다.");
        }
    }


}
