package Service;

import DAO.loginDao;

import java.sql.*;
import java.util.Scanner;

import static DAO.MemberDao.showMember;
import static DAO.loginDao.idCheck;


public class ServiceMember{
    public static void registerProcess() throws SQLException {
        registerUser();
        showMember();
    }
    static void registerUser() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("회원가입");
        //아이디, 비밀번호
        System.out.println("아이디 입력");
        String id = sc.next();
        // 아이디 중복 검사
        if (idCheck(id)) {
            System.out.println("비밀번호 입력");
            String pwd = sc.next();
            loginDao.ddlRegister(id, pwd);
        }else{
            System.out.println("아이디가 중복됩니다.");
            registerUser();
        }
    }

}
