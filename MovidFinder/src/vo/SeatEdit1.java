package vo;

import dto.SeatDto;

import java.util.Arrays;

public class SeatEdit1 extends OccupySeats {
    SeatEdit1() {

        switch (SeatDto.getColumn()) {
            case "A" -> {
                if (Arrays.asList(movie1.getArr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie1.getArr()).indexOf(SeatDto.getResult());
                    movie1.setArr(tmp, "NO");
                }
            }
            case "B" -> {
                if (Arrays.asList(movie1.getBrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie1.getBrr()).indexOf(SeatDto.getResult());
                    movie1.setBrr(tmp, "NO");
                }
            }
            case "C" -> {
                if (Arrays.asList(movie1.getCrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie1.getCrr()).indexOf(SeatDto.getResult());
                    movie1.setCrr(tmp, "NO");
                }
            }
            case "D" -> {
                if (Arrays.asList(movie1.getDrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie1.getDrr()).indexOf(SeatDto.getResult());
                    movie1.setDrr(tmp, "NO");
                }
            }
            case "E" -> {
                if (Arrays.asList(movie1.getErr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie1.getErr()).indexOf(SeatDto.getResult());
                    movie1.setErr(tmp, "NO");
                }
            }
            default -> System.out.println("잘못된 입력입니다.1");
        }
    }
}
