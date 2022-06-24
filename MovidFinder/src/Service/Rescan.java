package Service;

import DAO.RescanDao;
import java.sql.SQLException;

public class Rescan {
    static void RescanProcess() throws SQLException {
        RescanDao.Rescan();
        //예약을 취소했으니 audience cnt를 하나 증가시켜준다.
        RescanDao.canMovieUpdate();
        Menu.menuSelect();
    }
}
