package service;

import dao.audienceSelect;
import dao.insertMovieList;
import dao.showMovieList;
import dto.MovieDto;
import dto.ResDto;

import java.util.Scanner;

public class MovieSelect{
    MovieSelect() {
        if (ResDto.getCallcnt() == 0) {
            new insertMovieList();
            ResDto.setCallcnt(1);
        }
        new showMovieList();
        Scanner sc = new Scanner(System.in);
        System.out.println("선택하신 영화의 번호를 입력하세요");
        int movie_id = sc.nextInt();
        MovieDto.setPointer(movie_id);
        new audienceSelect();
        System.out.println("영화를 선택하셨습니다. 선택하신 영화의 정보는 다음과 같습니다.");
    }
}
