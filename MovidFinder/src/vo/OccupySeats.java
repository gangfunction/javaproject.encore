package vo;

import dto.MovieDto;

public class OccupySeats {
    public OccupySeats() {
        if (MovieDto.getPointer() == 1) {
            new SeatEdit1();
        } else {
            System.out.println("잘못된 입력입니다.10");
        }
    }
}
