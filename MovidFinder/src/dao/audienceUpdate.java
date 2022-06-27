package dao;

import dto.MovieDto;

public class audienceUpdate extends movieReserve3 {
    audienceUpdate() {
        switch (MovieDto.getPointer()) {
            case 1:
                MovieDto.setAudience1();
                MovieDto.setAudience(MovieDto.getAudience1());
                break;
            case 2:
                MovieDto.setAudience2();
                MovieDto.setAudience(MovieDto.getAudience2());
                break;
            case 3:
                MovieDto.setAudience3();
                MovieDto.setAudience(MovieDto.getAudience3());
                break;
            case 4:
                MovieDto.setAudience4();
                MovieDto.setAudience(MovieDto.getAudience4());
                break;
            case 5:
                MovieDto.setAudience5();
                MovieDto.setAudience(MovieDto.getAudience5());
                break;
            case 6:
                MovieDto.setAudience6();
                MovieDto.setAudience(MovieDto.getAudience6());
                break;
            case 7:
                MovieDto.setAudience7();
                MovieDto.setAudience(MovieDto.getAudience7());
                break;
            case 8:
                MovieDto.setAudience8();
                MovieDto.setAudience(MovieDto.getAudience8());
                break;
            case 9:
                MovieDto.setAudience9();
                MovieDto.setAudience(MovieDto.getAudience9());
                break;
            default:
                System.out.println("오류");
                break;
        }
    }
}
