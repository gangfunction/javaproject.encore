package dao.reserve;

import dto.seatDto;

public class resCanSplit {
    //저장한 좌석의 글자를 두개로 나누는 메소드
    resCanSplit() {
        seatDto.setColumn(String.valueOf(seatDto.getCanSeat().charAt(0)));
        seatDto.setRow(String.valueOf(seatDto.getCanSeat().charAt(1)));

    }
}
