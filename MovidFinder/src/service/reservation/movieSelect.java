package service.reservation;

import dao.movie.movieInsertList;
import dao.movie.movieList;
import dto.movieDto;
import dto.resDto;

import java.util.Scanner;

public class movieSelect extends movieInsertList {
    movieSelect() {
        super();
        if (resDto.getCallcnt() == 0) new movieInsertList();
        new movieList();
        Scanner sc = new Scanner(System.in);
        System.out.println("선택하신 영화의 번호를 입력하세요");
        int movie_id = sc.nextInt();
        movieDto.setPointer(movie_id);
        System.out.println("영화를 선택하셨습니다. 선택하신 영화의 정보는 다음과 같습니다.");
    }
}
