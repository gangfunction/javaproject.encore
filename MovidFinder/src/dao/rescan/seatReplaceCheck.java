package dao.rescan;

import dto.seatDto;

import java.util.Arrays;

public class seatReplaceCheck {
    protected seatReplaceCheck(String[] Drr, String[] Drr1) {
        if (Arrays.asList(Drr).contains(seatDto.getCanSeat())) {
            int tmp = Arrays.asList(Drr).indexOf(seatDto.getCanSeat());
            Drr1[tmp] = seatDto.getCanSeat();
        }
    }
    public seatReplaceCheck() {

    }
}
