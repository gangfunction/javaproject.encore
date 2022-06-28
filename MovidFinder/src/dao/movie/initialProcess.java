package dao.movie;

import dao.reserve.deleteReserveList;
import service.movieDeleteList;

public class initialProcess {
    public initialProcess() {
        new movieDeleteList();
        new deleteReserveList();
        new movieResetLogin();
    }
}
