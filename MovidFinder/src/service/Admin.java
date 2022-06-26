package service;

import dto.MemberDto;

import java.sql.SQLException;

import static dao.AdminDao.AdminCheck;

public class Admin {
    public static void adminMenuPrint() {
        System.out.println("1. 전체 회원목록 표시 2. 회원 정보 수정 3. 회원 삭제 4. 영화 삭제 5. 종료");
    }

    public static boolean adCheck() throws SQLException {
        AdminCheck(MemberDto.getId(), MemberDto.getPwd());
        return false;
    }
}
