package dao.reserve;

import dto.movieDto;

public class movieForAudience {
    public movieForAudience() {
        switch (movieDto.getPointer()) {
            case 1 -> movieDto.setAudience1(movieDto.getAudience());
            case 2 -> movieDto.setAudience2(movieDto.getAudience());
            case 3 -> movieDto.setAudience3(movieDto.getAudience());
            case 4 -> movieDto.setAudience4(movieDto.getAudience());
            case 5 -> movieDto.setAudience5(movieDto.getAudience());
            case 6 -> movieDto.setAudience6(movieDto.getAudience());
            case 7 -> movieDto.setAudience7(movieDto.getAudience());
            case 8 -> movieDto.setAudience8(movieDto.getAudience());
            case 9 -> movieDto.setAudience9(movieDto.getAudience());
            default -> System.out.println("잘못된 입력");
        }
    }
}
