package dto;

import dao.Dao;

import java.sql.Connection;

public class Dto {

    public static Connection getConn() {
        return Dao.getConnection();
    }

    public static void getClose(){
        Dao.close();
    }
}
