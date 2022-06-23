package Service;

import DAO.loginDao;
import DTO.AdminDto;
import DTO.DBDto;
import DTO.MemberDto;

import java.sql.SQLException;
import java.util.Scanner;



public class login {

    //로그인 처리 db
    static void loginProcess() throws SQLException {
        DBDto.getConn();
        Scanner sc = new Scanner(System.in);
        System.out.println("로그인 정보를 입력하세요");
        System.out.println("아이디 : ");
        MemberDto.setId(sc.next());
        System.out.println("비밀번호 : ");
        MemberDto.setPwd(sc.next());
        loginDao.loginCheck(MemberDto.getId(), MemberDto.getPwd());
        if(AdminDto.adCheck()){
            System.out.println("관리자 로그인 성공");
            AdminMenu.menuSelect();
        }else{
            Menu.menuSelect();
        }
    }// 로그인 처리




}
