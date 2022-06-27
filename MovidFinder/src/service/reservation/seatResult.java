package service.reservation;

import dto.movieDto;
import dto.seatDto;
import service.reservation.seatSelectRow;
import vo.occupySeats;

import java.util.Scanner;

public class seatResult {
    protected seatResult() {
        seatDto.combi(seatDto.getColumn(), seatDto.getRow());
        System.out.println("선택한 좌석은 " + seatDto.getColumn() + seatDto.getRow() + "입니다.");
        //선택한 좌석을 예매할 것인지 아니면 다른 좌석을 선택할 것인지 선택할수 있는 메소드
        System.out.println("예매하시겠습니까?(y/n)");
        Scanner sc = new Scanner(System.in);
        String select = sc.next();
        if (select.equals("y")) {
            //예매하는 메소드
            new occupySeats();
            System.out.println("예매가 완료되었습니다.");
            //그에 따라 예약수 증가
            movieDto.setReservation_cnt();
        } else if (select.equals("n")) {
            //다른 좌석을 선택하는 메소드
            new seatSelectRow();
        }
    }
}
