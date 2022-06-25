package Service;

import DAO.MovieProcess;
import DTO.MovieCnt;
import VO.Seat;
import VO.Seats;

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
                MovieProcess.movie_search("movie_name", name);
            }
            case 2 -> {
                System.out.println("영화 장르를 입력하세요");
                String name = sc.next();
                MovieProcess.movie_search("genre", name);
            }
        }
    }
    static void SeatGenCheck(int i){
        switch(i){
            case 1:
                if (MovieCnt.getMovie1_cnt() < 1) {
                    System.out.println("initializing..the theater(1)");
                    MovieCnt.setMovie1_cnt();
                    Seat movie1 = Seats.getMovie1();
                }else{
                    System.out.println("theater(1) is already initialized");
                }
                break;
            case 2:
                if (MovieCnt.getMovie2_cnt() < 1) {
                    System.out.println("initializing..the theater(2)");
                    MovieCnt.setMovie2_cnt();
                    Seat movie2 = Seats.getMovie2();
                }else{
                    System.out.println("theater(2) is already initialized");
                }
                break;
            case 3:
                if (MovieCnt.getMovie3_cnt() < 1) {
                    System.out.println("initializing..the theater(3)");
                    MovieCnt.setMovie3_cnt();
                    Seat movie3 = Seats.getMovie3();
                }else{
                    System.out.println("theater(3) is already initialized");
                }
                break;
            case 4:
                if (MovieCnt.getMovie4_cnt() < 1) {
                    System.out.println("initializing..the theater(4)");
                    MovieCnt.setMovie4_cnt();
                    Seat movie4 = Seats.getMovie4();
                }else{
                    System.out.println("theater(4) is already initialized");
                }
                break;
            case 5:
                if (MovieCnt.getMovie5_cnt() < 1) {
                    System.out.println("initializing..the theater(5)");
                    MovieCnt.setMovie5_cnt();
                    Seat movie5 = Seats.getMovie5();
                }else{
                    System.out.println("theater(5) is already initialized");
                }
                break;
            case 6:
                if (MovieCnt.getMovie6_cnt() < 1) {
                    System.out.println("initializing..the theater(6)");
                    MovieCnt.setMovie6_cnt();
                    Seat movie6 = Seats.getMovie6();
                }else{
                    System.out.println("theater(6) is already initialized");
                }
                break;
            case 7:
                if (MovieCnt.getMovie7_cnt() < 1) {
                    System.out.println("initializing..the theater(7)");
                    MovieCnt.setMovie7_cnt();
                    Seat movie7 = Seats.getMovie7();
                }else{
                    System.out.println("theater(7) is already initialized");
                }
                break;
            case 8:
                if (MovieCnt.getMovie8_cnt() < 1) {
                    System.out.println("initializing..the theater(8)");
                    MovieCnt.setMovie8_cnt();
                    Seat movie8 = Seats.getMovie8();
                }else{
                    System.out.println("theater(8) is already initialized");
                }
                break;
            case 9:
                if (MovieCnt.getMovie9_cnt() < 1) {
                    System.out.println("initializing..the theater(9)");
                    MovieCnt.setMovie9_cnt();
                    Seat movie9 = Seats.getMovie9();
                }else{
                    System.out.println("theater(9) is already initialized");
                }
                break;
            default:
                System.out.println("theater is not exist");
                break;

        }

    }
    //좌석 예약이 끝났을때 MovieCnt를 실행한다.
    static void MovieCnt(int i){

        switch(i){
            case 1:
                MovieCnt.setMovie1_cnt();
                break;
            case 2:
                MovieCnt.setMovie2_cnt();
                break;
            case 3:
                MovieCnt.setMovie3_cnt();
                break;
            case 4:
                MovieCnt.setMovie4_cnt();
                break;
            case 5:
                MovieCnt.setMovie5_cnt();
                break;
            case 6:
                MovieCnt.setMovie6_cnt();
                break;
            case 7:
                MovieCnt.setMovie7_cnt();
                break;
            case 8:
                MovieCnt.setMovie8_cnt();
                break;
            case 9:
                MovieCnt.setMovie9_cnt();
                break;
        }
    }


}