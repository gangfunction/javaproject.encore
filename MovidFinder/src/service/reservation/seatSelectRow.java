package service.reservation;

import dto.seatDto;

import java.util.Scanner;

public class seatSelectRow{
    protected seatSelectRow() {
        System.out.println("순서를 선택하세요");
        System.out.println("1. 첫번째 2. 두번째 3. 셋번째 4. 네번째 5. 다섯번째 6.여섯번째");
        //switch 문으로 순서를 선택할수 있는 메소드를 만들어야한다.
        Scanner sc = new Scanner(System.in);
        String rowSelect = sc.next();
        seatDto.setRow(rowSelect);
        // 행 정보 저장하기
    }
}
