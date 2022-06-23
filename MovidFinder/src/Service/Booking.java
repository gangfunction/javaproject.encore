package Service;

import DAO.MovieDao;
import DAO.ReserveDao;

import java.sql.SQLException;
import java.util.Scanner;

import static DAO.MovieDao.insertMovieList;

public class Booking {
    static int callcnt = 0;
    static void booking() throws SQLException {
        System.out.println("영화를 선택하세요");
        //한번만 insertMovieList 메서드를 호출하면 된다.
        if(callcnt==0){
            System.out.println("인서트 메소드 실행");
            insertMovieList();
            callcnt++;
        }
        //영화목록 보여주기
        MovieDao.showMovieList();
        //영화 선택
        Scanner sc = new Scanner(System.in);
        System.out.println("선택하신 영화의 번호를 입력하세요");
        int movie_id = sc.nextInt();
        System.out.println("영화를 선택하셨습니다. 선택하신 영화의 정보는 다음과 같습니다.");
        switch (movie_id) {
            case 1 -> bookingProcess(1);
            case 2 -> bookingProcess(2);
            default -> System.out.println("영화를 선택하지 않았습니다.");
        }
        //현재 접속자 목록 저장
    }
    static void bookingProcess(int i) throws SQLException {
        ReserveDao.movieReserve1(i);
        ReserveDao.movieReserve2();
        ReserveDao.movieReserve3();
        Reserve.seatSelectProcess();
        timeSelect();
        System.out.println("예매가 완료되었습니다.");
        Menu.menuSelect();
    }
    static void timeSelect(){
        Scanner sc = new Scanner(System.in);
        System.out.println("예매 시간을 선택하세요");
        System.out.println("1. 오전 10시");
        System.out.println("2. 오후 2시");
        int select = sc.nextInt();
        if (select == 1) {
            ReserveDao.timeSet(1);
        } else if (select == 2) {
            ReserveDao.timeSet(2);
        }
    }

    static void showBooking() throws SQLException {
        ReserveDao.showReserve();
    }
    void cancelBooking() throws SQLException {
        System.out.println("예매취소");

    }


}
