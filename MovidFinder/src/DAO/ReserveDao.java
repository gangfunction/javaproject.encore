package DAO;

import DTO.*;
import Service.Menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReserveDao {


    public static void seatReserve(String i, String i1) throws SQLException {
        Connection conn = DBDto.getConn();
        //movieRerserve에서 영화 정보를 가져온다.

        String sql = "update reservation set reserved=? ,seatnumber=?, id=? where num =? ";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setBoolean(1,true);
        pstmt.setString(2,i+i1);
        pstmt.setString(3, MemberDto.getId());
        pstmt.setInt(4, ResDto.getReservation_cnt());
        pstmt.executeUpdate();
        System.out.println("좌석 예약되었습니다.");
    }

    public static void timeSet(int i) {
        try{
            String sql= "update reservation set times=? where num=?;";
            Connection conn = DBDto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            String Stime = null;
            if (i==1){
                Stime = "10:00";
            }
            if (i==2){
                Stime = "14:00";
            }
            pstmt.setString(1, Stime);
            pstmt.setInt(2, ResDto.getReservation_cnt());
            pstmt.executeUpdate();

         } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
        public static void showReserve(){
        try{
            String sql= "select * from reservation where num='"+ResDto.getReservation_cnt()+"'";
            Connection conn = DBDto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getRow());
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void deleteReserveList(){
        try{
            reserveTableCheck();
            Connection conn = DBDto.getConn();
            PreparedStatement pstmt;
            String sql= "truncate reservation";
            pstmt= conn.prepareStatement(sql);
            pstmt.execute(sql);
            String sql2 = "select * from reservation";
            ResultSet rs=pstmt.executeQuery(sql2);
            rs.next();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //reservation  table이 존재하는지 확인한다.
    public static boolean reserveTableCheck() {
        try{
            String sql= "select * from reservation";
            Connection conn = DBDto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);
            if (rs.next()) {
                return true;
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
    public static void createTableReserve() throws SQLException {
        try{
            String sql= "create table reservation(num int primary key auto_increment, movie_name varchar(20), reserved boolean, seatnumber varchar(20), times varchar(20), id varchar(20))";
            Connection conn = DBDto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.execute(sql);
        }catch (SQLException e) {
            Menu.menuSelect();
        }
    }
}
