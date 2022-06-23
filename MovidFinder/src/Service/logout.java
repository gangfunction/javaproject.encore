package Service;

import DAO.logoutDao;
import DTO.MemberDto;

import java.sql.SQLException;

public class logout {
    static void logoutProcess() throws SQLException {
        System.out.println("로그아웃 처리");
        MemberDto.setIsin(false);
        logoutDao.logoutUpdate();
        Menu.menuSelect();
    }
}
