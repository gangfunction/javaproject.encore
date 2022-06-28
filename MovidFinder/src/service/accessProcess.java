package service;

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
