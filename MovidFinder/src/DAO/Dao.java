package DAO;

import DTO.DBDto;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Dao {

    public static void initialProcess() throws SQLException {
        MovieDao.deleteMovieList();
        if (ReserveDao.reserveTableCheck())
        {
            ReserveDao.deleteReserveList();
        }
        resetLoginList();
    }


    //todo: 프로그램을 시작할때 접속자의 수를 초기화한다.
    private static void resetLoginList() throws SQLException {
        DBDto.getConn();
        String sql = "update member set isin = 0";
        PreparedStatement pstmt = DBDto.getConn().prepareStatement(sql);
        pstmt.executeUpdate();
    }
}
