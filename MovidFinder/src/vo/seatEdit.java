package vo;

import dto.seatDto;

import java.util.Arrays;

public class seatEdit {
    seatEdit() {

        switch (seatDto.getColumn()) {
            case "A" -> {
                if (Arrays.asList(movie.getArr()).contains(seatDto.getResult())) {
                    int tmp = Arrays.asList(movie.getArr()).indexOf(seatDto.getResult());
                    movie.setArr(tmp, "NO");
                }
            }
            case "B" -> {
                if (Arrays.asList(movie.getBrr()).contains(seatDto.getResult())) {
                    int tmp = Arrays.asList(movie.getBrr()).indexOf(seatDto.getResult());
                    movie.setBrr(tmp, "NO");
                }
            }
            case "C" -> {
                if (Arrays.asList(movie.getCrr()).contains(seatDto.getResult())) {
                    int tmp = Arrays.asList(movie.getCrr()).indexOf(seatDto.getResult());
                    movie.setCrr(tmp, "NO");
                }
            }
            case "D" -> {
                if (Arrays.asList(movie.getDrr()).contains(seatDto.getResult())) {
                    int tmp = Arrays.asList(movie.getDrr()).indexOf(seatDto.getResult());
                    movie.setDrr(tmp, "NO");
                }
            }
            case "E" -> {
                if (Arrays.asList(movie.getErr()).contains(seatDto.getResult())) {
                    int tmp = Arrays.asList(movie.getErr()).indexOf(seatDto.getResult());
                    movie.setErr(tmp, "NO");
                }
            }
            default -> System.out.println("잘못된 입력입니다.1");
        }
    }
}
