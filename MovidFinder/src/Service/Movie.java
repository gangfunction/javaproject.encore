package Service;

import DAO.MovieDao;
import Service.Menu;

import java.sql.SQLException;
import java.util.Scanner;
//todo: 영화목록 보여주기

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


}