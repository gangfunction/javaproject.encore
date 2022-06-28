package utility;

import dao.showMember;
import service.registerUser;

import java.sql.SQLException;

public class regProcess {
    public static void registerProcess() throws SQLException {
        new registerUser();
        new showMember();
    }

    public static boolean idCheck(String id) {
        return !showMember.idCheck(id);
    }
}
