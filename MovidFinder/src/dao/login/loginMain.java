package dao.login;

import dto.memberDto;

import java.sql.SQLException;

public class loginMain {
    public static void main(String[] args) throws SQLException {
        switch(memberDto.getLoginCheck()){
            case 1: new loginCheck(); break;
            case 2: new loginSave(); break;
            case 3: new loginUpdate(); break;
            case 4: new logoutUpdate(); break;
            default: System.out.println("오류입니다. "); break;

        }

    }
}
