package dao.login;

import dto.memberDTO;

import java.sql.SQLException;

public class accessProcess {
    public accessProcess() throws SQLException {
        if (memberDTO.getIsin()) {
            new logoutProcess();
        } else {
            new loginProcess();
        }

    }
}
