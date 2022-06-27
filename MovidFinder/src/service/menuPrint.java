package service;

import dto.memberDto;

public class menuPrint {
    menuPrint() {
        if (memberDto.getIsin()) {
            System.out.println("0.게시판 접속  1. 로그아웃 2. 로그아웃  3. 영화검색  4. 영화예매  5. 예매취소 5. 종료");
        } else {
            System.out.println("1. 로그인 2. 회원가입 3. 영화검색 4. 종료");
        }
    }
}
