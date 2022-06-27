package vo;

import dto.seatDto;

import java.util.Arrays;

public class seatReplace {
    seatReplace() {
        switch (seatDto.getColumn()) {
            case "A": {
                if (Arrays.asList(movieDefault.getArr()).contains(seatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getArr()).indexOf(seatDto.getCanSeat());
                    movie.getArr()[tmp] = seatDto.getCanSeat();
                }
                break;
            }
            case "B": {
                if (Arrays.asList(movieDefault.getBrr()).contains(seatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getBrr()).indexOf(seatDto.getCanSeat());
                    movie.getBrr()[tmp] = seatDto.getCanSeat();
                }
                break;
            }
            case "C": {
                if (Arrays.asList(movieDefault.getCrr()).contains(seatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getCrr()).indexOf(seatDto.getCanSeat());
                    movie.getCrr()[tmp] = seatDto.getCanSeat();
                }
                break;
            }
            case "D": {
                if (Arrays.asList(movieDefault.getDrr()).contains(seatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getDrr()).indexOf(seatDto.getCanSeat());
                    movie.getDrr()[tmp] = seatDto.getCanSeat();
                }
                break;
            }
            case "E": {
                if (Arrays.asList(movieDefault.getErr()).contains(seatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getErr()).indexOf(seatDto.getCanSeat());
                    movie.getErr()[tmp] = seatDto.getCanSeat();
                }
                break;
            }
            default:
                System.out.println("영화 정보가 없습니다.cancel 1");
        }
    }
}
