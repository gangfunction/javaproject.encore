package dao;

import dto.MovieDto;

public class audienceSelect extends movieReserve2 {
    public audienceSelect() {
        switch (MovieDto.getPointer()) {
            case 1:
                MovieDto.setAudience(MovieDto.getAudience1());
                break;
            case 2:
                MovieDto.setAudience(MovieDto.getAudience2());
                break;
            case 3:
                MovieDto.setAudience(MovieDto.getAudience3());
                break;
            case 4:
                MovieDto.setAudience(MovieDto.getAudience4());
                break;
            case 5:
                MovieDto.setAudience(MovieDto.getAudience5());
                break;
            case 6:
                MovieDto.setAudience(MovieDto.getAudience6());
                break;
            case 7:
                MovieDto.setAudience(MovieDto.getAudience7());
                break;
            case 8:
                MovieDto.setAudience(MovieDto.getAudience8());
                break;
            case 9:
                MovieDto.setAudience(MovieDto.getAudience9());
                break;
            default:
                System.out.println("오류");
                break;
        }
    }
}
