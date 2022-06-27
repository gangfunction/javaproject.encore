package dao.movie;

import dao.reserve.deleteReserveList;
import utility.TableCheck;

public class initialProcess {
    public initialProcess() {
        new movieDeleteList();
        if (TableCheck.reserveTableCheck()) {
            new deleteReserveList();
        }
        new movieResetLogin();
    }
}
