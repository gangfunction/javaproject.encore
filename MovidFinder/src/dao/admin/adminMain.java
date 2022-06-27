package dao.admin;

import java.sql.SQLException;

public class adminMain {
    public static void main(String[] args) throws SQLException {
        System.out.println("관리자 메뉴에 오신 것을 환영합니다.");
        new adminMenuPrint();
        new adminMenuSelect();

    }
}
