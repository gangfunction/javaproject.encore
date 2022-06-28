package utility;

import dao.timeSet;
import dto.ResDto;

import java.util.Scanner;

public class timeSelect {
    public timeSelect() {
        Scanner sc = new Scanner(System.in);
        System.out.println("예매 시간을 선택하세요");
        System.out.println("1. 오전 10시");
        System.out.println("2. 오후 2시");
        int select = sc.nextInt();
        if (select == 1) {
            ResDto.setTime("10:00");
            new timeSet();
        } else if (select == 2) {
            ResDto.setTime("14:00");
            new timeSet();
        } else {
            System.out.println("잘못 입력하셨습니다.");
            new timeSelect();
        }
    }
}
