package dao.reserve;

import dto.movieDto;

public class audienceForMovie {
    public audienceForMovie() {
        switch (movieDto.getPointer()) {
            case 1 -> movieDto.setForAudience(movieDto.getAudience1());
            case 2 -> movieDto.setForAudience(movieDto.getAudience2());
            case 3 -> movieDto.setForAudience(movieDto.getAudience3());
            case 4 -> movieDto.setForAudience(movieDto.getAudience4());
            case 5 -> movieDto.setForAudience(movieDto.getAudience5());
            case 6 -> movieDto.setForAudience(movieDto.getAudience6());
            case 7 -> movieDto.setForAudience(movieDto.getAudience7());
            case 8 -> movieDto.setForAudience(movieDto.getAudience8());
            case 9 -> movieDto.setForAudience(movieDto.getAudience9());
            default -> System.out.println("잘못된 입력");
        }
    }
}
