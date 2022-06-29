package dao.login;

import dto.memberDto;

import java.sql.SQLException;

public class loginMain {
    public static void main() throws SQLException {
        switch (memberDto.getLoginCheck()) {
            case 1 -> new loginCheck();
            case 2 -> new loginSave();
            case 3 -> new loginUpdate();
            case 4 -> new logoutUpdate();
            default -> System.out.println("오류입니다. ");
        }

    }
}
