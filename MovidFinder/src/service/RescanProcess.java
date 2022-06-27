package service;

import dao.CancelUpdate;
import dao.Rescan;
import dao.canMovieUpdate;
import vo.SeatCan;

import java.sql.SQLException;

import static service.Menu.menuSelect;

public class RescanProcess {
    public RescanProcess() throws SQLException {
        new Rescan();
        new canMovieUpdate();
        new SeatCan();
        new CancelUpdate();
        menuSelect();
    }
}
