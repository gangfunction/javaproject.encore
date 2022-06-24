package DTO;


import java.sql.SQLException;

import static DAO.AdminDao.*;

public class AdminDto {
    public static boolean adCheck() throws SQLException {
        AdminCheck(MemberDto.getId(), MemberDto.getPwd());
        return false;
    }
}
