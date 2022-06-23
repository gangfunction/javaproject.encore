package DTO;

import DAO.dbCon;

import java.sql.Connection;

public class DBDto {
    private static Connection conn;

    public static Connection getConn() {
        return dbCon.getConnection();
    }
    public static void setConn() {
        DBDto.conn = conn;
    }

    public static Connection getClose(){
        dbCon.close();
        return conn;

}}
