package service;

import dao.deleteMovieList;
import dao.deleteReserveList;
import dao.resetLoginList;
import utility.TableCheck;

import java.sql.SQLException;

public class initialProcess {
    public initialProcess() throws SQLException {
        new deleteMovieList();
        if (TableCheck.reserveTableCheck()) {
            new deleteReserveList();
        }
        new resetLoginList();
    }
}
