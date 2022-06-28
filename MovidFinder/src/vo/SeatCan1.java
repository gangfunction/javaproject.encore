package vo;

import dto.SeatDto;

import java.util.Arrays;

public class SeatCan1{
    SeatCan1() {
        switch (SeatDto.getColumn()) {
            case "A": {
                if (Arrays.asList(movieDefault.getArr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getArr()).indexOf(SeatDto.getCanSeat());
                    movie1.getArr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "B": {
                if (Arrays.asList(movieDefault.getBrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getBrr()).indexOf(SeatDto.getCanSeat());
                    movie1.getBrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "C": {
                if (Arrays.asList(movieDefault.getCrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getCrr()).indexOf(SeatDto.getCanSeat());
                    movie1.getCrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "D": {
                if (Arrays.asList(movieDefault.getDrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getDrr()).indexOf(SeatDto.getCanSeat());
                    movie1.getDrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "E": {
                if (Arrays.asList(movieDefault.getErr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getErr()).indexOf(SeatDto.getCanSeat());
                    movie1.getErr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            default:
                System.out.println("영화 정보가 없습니다.cancel 1");
        }
    }
}
