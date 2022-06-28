package vo;

import dto.MovieDto;

public class seatShowing {
    public seatShowing() {
        switch (MovieDto.getPointer()) {
            case 1:
                new seattheater1();
                break;
            default:
                System.out.println("영화 정보가 없습니다.");
        }
    }
}
