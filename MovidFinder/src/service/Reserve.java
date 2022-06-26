package service;

import dao.MovieDao;
import dao.ReserveDao;
import dto.MovieDto;
import dto.ResDto;
import dto.SeatDto;
import vo.SeatEdit;
import vo.SeatShow;

import java.sql.SQLException;
import java.util.Scanner;



//유틸리티 클래스
public class Reserve {
    static void Reservation() {
        try{
            MovieSelect();
            MovieDao.Movie();
            System.out.println(" || "+MovieDto.getMovieName()+" || " + "해당 영화의 좌석 정보입니다.");
            SeatShow.seatShowing();
            timeSelect();
            seatSelectColumn();
            seatSelectRow();
            seatResult();
            SeatEdit.OccupySeats();
            MovieDto.setReserved(true);
            Menu.menuSelect();
        }catch(SQLException e)
        {
        System.out.println("예매에 실패하였습니다.");
        }
    }

    static void MovieSelect() {
        //한번만 insertMovieList 메서드를 호출하면 된다.
        if(ResDto.getCallcnt()==0){
            MovieDao.insertMovieList();
            ResDto.setCallcnt(1);
        }
        //영화목록 보여주기
        MovieDao.showMovieList();
        //영화 선택
        Scanner sc = new Scanner(System.in);
        System.out.println("선택하신 영화의 번호를 입력하세요");
        int movie_id = sc.nextInt();
        //영화선택에 따라 MovieDto num에 저장하기
        MovieDto.setPointer(movie_id);
        MovieDao.audienceSelect();
        //Movie Cnt를 실행한다.
        System.out.println("영화를 선택하셨습니다. 선택하신 영화의 정보는 다음과 같습니다.");
        }

    static void seatSelectColumn() {
        System.out.println("열을 선택하세요");
        System.out.println("1. A열 2. B열 3. C열 4. D열 5. E열");
        Scanner sc = new Scanner(System.in);
        String columnSelect = sc.next();
        switch (columnSelect) {
            case "1":
                SeatDto.setColumn("A");
                break;
            case "2":
                SeatDto.setColumn("B");
                break;
            case "3":
                SeatDto.setColumn("C");
                break;
            case "4":
                SeatDto.setColumn("D");
                break;
            case "5":
                SeatDto.setColumn("E");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                seatSelectColumn();
                break;
        }

    }
    private static void seatSelectRow() {
        System.out.println("순서를 선택하세요");
        System.out.println("1. 첫번째 2. 두번째 3. 셋번째 4. 네번째 5. 다섯번째 6.여섯번째");
        //switch 문으로 순서를 선택할수 있는 메소드를 만들어야한다.
        Scanner sc = new Scanner(System.in);
        String rowSelect = sc.next();
        SeatDto.setRow(rowSelect);
        // 행 정보 저장하기
        }
    private static void seatResult() {
        SeatDto.combi(SeatDto.getColumn(), SeatDto.getRow());
        System.out.println("선택한 좌석은 " + SeatDto.getColumn() + SeatDto.getRow() + "입니다.");
        //선택한 좌석을 예매할 것인지 아니면 다른 좌석을 선택할 것인지 선택할수 있는 메소드
        System.out.println("예매하시겠습니까?(y/n)");
        Scanner sc = new Scanner(System.in);
        String select = sc.next();
        if (select.equals("y")) {
            //예매하는 메소드
            try
            {
                ReserveDao.seatReserve();
            }
            catch(SQLException e){
                System.out.println("예매에 실패하였습니다.");
            }
            System.out.println("예매가 완료되었습니다.");
            //그에 따라 예약수 증가
            MovieDto.setReservation_cnt();
        } else if (select.equals("n")) {
            //다른 좌석을 선택하는 메소드
            seatSelectRow();
        }
    }



    static void timeSelect(){
        Scanner sc = new Scanner(System.in);
        System.out.println("예매 시간을 선택하세요");
        System.out.println("1. 오전 10시");
        System.out.println("2. 오후 2시");
        int select = sc.nextInt();
        if (select == 1) {
            ResDto.setTime("10:00");
            ReserveDao.timeSet();
        } else if (select == 2) {
            ResDto.setTime("14:00");
            ReserveDao.timeSet();
        } else {
            System.out.println("잘못 입력하셨습니다.");
            timeSelect();
        }
    }

}

