package Service;

import DAO.Dao;
import DAO.loginDao;
import DTO.Dto;

import java.sql.SQLException;
import java.util.Scanner;


public class login {

    void idCheckMenu() throws SQLException {
        if (loginDao.idCheck(Dto.getId())) {
            System.out.println("아이디가 중복됩니다.");
            // 다른 아이디를 입력하던지 메뉴로 돌아가서 선택할수있게 해준다.
            Scanner sc = new Scanner(System.in);
            int toSelect = sc.nextInt();
            switch (toSelect) {
                case 1 -> ServiceMember.registerProcess();
                case 2 -> Menu.menuSelect();
                default -> System.out.println("잘못 입력하셨습니다.");
            }
        }else{
            System.out.println("아이디가 사용가능합니다.");
        }
    }

    //로그인 처리 db
    static void loginProcess() throws SQLException {
        Dao.getConn();
        Scanner sc = new Scanner(System.in);
        System.out.println("로그인 정보를 입력하세요");
        System.out.println("아이디 : ");
        String id = sc.next();
        System.out.println("비밀번호 : ");
        String pwd = sc.next();
        loginDao.loginCheck(id, pwd);
        Menu.menuSelect();
    }// 로그인 처리


    static void logoutProcess() throws SQLException {
        System.out.println("로그아웃 처리");
        Dto.setIsin(false);
        Menu.menuSelect();
    }

}
