package service;

import dao.movie.movieSearch;

import java.util.Scanner;

public class selectMovie {
    selectMovie() {
        //영화 검색 기능 추가;
        System.out.println("1. 영화 이름으로 검색");
        System.out.println("2. 영화 장르로 검색");
        Scanner sc = new Scanner(System.in);
        int movie_search = sc.nextInt();
        switch (movie_search) {
            case 1 -> {
                System.out.println("영화 이름을 입력하세요");
                new movieSearch();
            }
            case 2 -> {
                System.out.println("영화 장르를 입력하세요");
                new movieSearch();
            }
        }
    }


}