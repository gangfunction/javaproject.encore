package dao;

import dto.MovieDto;

public class audienceCan{
    audienceCan() {
        switch (MovieDto.getPointer()) {
            case 1:
                MovieDto.canAudience1();
                break;
            case 2:
                MovieDto.canAudience2();
                break;
            case 3:
                MovieDto.canAudience3();
                break;
            case 4:
                MovieDto.canAudience4();
                break;
            case 5:
                MovieDto.canAudience5();
                break;
            case 6:
                MovieDto.canAudience6();
                break;
            case 7:
                MovieDto.canAudience7();
                break;
            case 8:
                MovieDto.canAudience8();
                break;
            case 9:
                MovieDto.canAudience9();
                break;
            default:
                System.out.println("오류");
                break;
        }
    }
}
