package DAO;

import java.sql.SQLException;


public class Dao {

    public static void initialProcess() throws SQLException {
        MovieDao.deleteMovieList();
        if (ReserveDao.reserveTableCheck())
        {
            ReserveDao.deleteReserveList();
        }
        else
        {
            System.out.println("reserve table is empty");
        }
    }

}
