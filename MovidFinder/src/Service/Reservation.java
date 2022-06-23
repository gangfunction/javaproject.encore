package Service;

import DAO.MovieDao;
import DAO.ReserveDao;
import DTO.ResDto;

import java.sql.SQLException;
import java.util.Scanner;

import static DAO.MovieDao.insertMovieList;

public class Reservation {

    static void MovieSelect() throws SQLException {
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
            case 3 -> bookingProcess(3);
            case 4 -> bookingProcess(4);
            case 5 -> bookingProcess(5);
            case 6 -> bookingProcess(6);
            case 7 -> bookingProcess(7);
            case 8 -> bookingProcess(8);
            case 9 -> bookingProcess(9);
            default -> System.out.println("영화를 선택하지 않았습니다.");
        }
        //현재 접속자 목록 저장
    }
    static void bookingProcess(int i) throws SQLException {
        ReserveDao.movieReserve1(i);
        ReserveDao.movieReserve2();
        ReserveDao.movieReserve3();
        timeSelect();
        Reservation.seatSelect();
        System.out.println("예매가 완료되었습니다.");
        Menu.menuSelect();
    }
    static void seatSelect() throws SQLException {
        System.out.println("열을 선택하세요");
        System.out.println("1. A열 2. B열 3. C열 4. D열 5. E열");
        Scanner sc = new Scanner(System.in);
        int columnSelect = sc.nextInt();
        switch (columnSelect) {
            case 1 -> seatSelectRow("A");
            case 2 -> seatSelectRow("B");
            case 3 -> seatSelectRow("C");
            case 4 -> seatSelectRow("D");
            case 5 -> seatSelectRow("E");
        }

    }
    private static void seatSelectRow(String i) throws SQLException {
        System.out.println("순서를 선택하세요");
        System.out.println("1. 첫번째 2. 두번째 3. 셋번째 4. 네번째 5. 다섯번째 6.여섯번째");
        //switch 문으로 순서를 선택할수 있는 메소드를 만들어야한다.
        Scanner sc = new Scanner(System.in);
        String rowSelect = sc.next();
        switch (rowSelect) {
            case "1" -> seatResult(i, "1");
            case "2" -> seatResult(i, "2");
            case "3" -> seatResult(i, "3");
            case "4" -> seatResult(i, "4");
            case "5" -> seatResult(i, "5");
            case "6" -> seatResult(i, "6");
        }
    }

    private static void seatResult(String i, String j) throws SQLException {
        //선택환 좌석을 출력하는 메소드
        System.out.println("선택한 좌석은 " + i + j + "입니다.");
        //선택한 좌석을 예매할 것인지 아니면 다른 좌석을 선택할 것인지 선택할수 있는 메소드
        System.out.println("예매하시겠습니까?(y/n)");
        Scanner sc = new Scanner(System.in);
        String select = sc.next();
        if (select.equals("y")) {
            //예매하는 메소드
            ReserveDao.seatReserve(i, j);
            System.out.println("예매가 완료되었습니다.");
            ResDto.setReservation_cnt();
            Menu.menuSelect();
        } else if (select.equals("n")) {
            //다른 좌석을 선택하는 메소드
            seatSelectRow(i);
        }
    }


   static int callcnt = 0;


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

