package service;

import dao.MovieDao;
import dto.MovieCnt;

import java.util.Scanner;

public class Movie {
    static void selectMovie() {
        //영화 검색 기능 추가;
        System.out.println("1. 영화 이름으로 검색");
        System.out.println("2. 영화 장르로 검색");
        Scanner sc = new Scanner(System.in);
        int movie_search = sc.nextInt();
        switch (movie_search) {
            case 1 -> {
                System.out.println("영화 이름을 입력하세요");
                String name = sc.next();
                MovieDao.movie_search("movie_name", name);
            }
            case 2 -> {
                System.out.println("영화 장르를 입력하세요");
                String name = sc.next();
                MovieDao.movie_search("genre", name);
            }
        }
    }
    static void MovieCnt(int i){
        switch(i){
            case 1: MovieCnt.setMovie1_cnt();
            case 2: MovieCnt.setMovie2_cnt();
            case 3: MovieCnt.setMovie3_cnt();
            case 4: MovieCnt.setMovie4_cnt();
            case 5: MovieCnt.setMovie5_cnt();
            case 6: MovieCnt.setMovie6_cnt();
            case 7: MovieCnt.setMovie7_cnt();
            case 8: MovieCnt.setMovie8_cnt();
            case 9: MovieCnt.setMovie9_cnt();
        }
    }



}