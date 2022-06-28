package service.reservation;

import dto.seatDto;

import java.util.Scanner;

public class seatSelectColumn{
    seatSelectColumn() {
        System.out.println("열을 선택하세요");
        System.out.println("1. A열 2. B열 3. C열 4. D열 5. E열");
        Scanner sc = new Scanner(System.in);
        String columnSelect = sc.next();
        switch (columnSelect) {
            case "1":
                seatDto.setColumn("A");
                break;
            case "2":
                seatDto.setColumn("B");
                break;
            case "3":
                seatDto.setColumn("C");
                break;
            case "4":
                seatDto.setColumn("D");
                break;
            case "5":
                seatDto.setColumn("E");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                new seatSelectColumn();
                break;
        }

    }
}
