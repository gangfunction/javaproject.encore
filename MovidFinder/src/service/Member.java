package service;

import dao.MemberDao;
import dto.MemberDto;

import java.sql.SQLException;
import java.util.Scanner;

import static dao.MemberDao.showMember;
import static dao.LoginDao.idCheck;
import static dto.MemberDto.id;


public class Member {
    public static void registerProcess() throws SQLException {
        registerUser();
        showMember();
    }
    static void registerUser() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("회원가입");
        //아이디, 비밀번호
        System.out.println("아이디 입력");
        MemberDto.setId(sc.next());
        // 아이디 중복 검사
        if (idCheck(id)) {
            System.out.println("비밀번호 입력");
            String pwd = sc.next();
            System.out.println("관리자 여부 입력 (0: 일반회원, 1: 관리자)");
            // 0과 1을 입력했을때는 불리언 입력을 받지 못한다.
            int admin = sc.nextInt();
            if ( admin == 1) {
                //관리자 코드를 입력하세요
                System.out.println("관리자 코드 입력");
                int admin_code = sc.nextInt();
                if (admin_code == 1234) {
                    MemberDao.ddlRegister(id, pwd, true);
                } else {
                    System.out.println("관리자 코드가 일치하지 않습니다.");
                    System.out.println("1. 다시 시도하시겠습니까? (0: 아니오, 1: 다시 시도)");
                    int select = sc.nextInt();
                    if (select == 0) {
                        System.out.println("일반회원으로 가입을 진행하겠습니다.");
                        MemberDao.ddlRegister(id, pwd, false);
                    } else if (select == 1) {
                        System.out.println("회원가입을 다시 진행하겠습니다.");
                        registerUser();
                    }
                }
            } else {
                MemberDao.ddlRegister(id, pwd, false);
            }
        }else{
            System.out.println("아이디가 중복됩니다.");
            registerUser();
        }
    }

}
