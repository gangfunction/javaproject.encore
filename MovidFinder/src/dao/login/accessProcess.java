package dao.login;

import dao.login.loginProcess;
import dao.login.logoutProcess;
import dto.memberDto;

import java.sql.SQLException;

public class accessProcess {
    public accessProcess() throws SQLException {
        if (memberDto.getIsin()) {
            new logoutProcess();
        } else {
            new loginProcess();
        }

    }
}
