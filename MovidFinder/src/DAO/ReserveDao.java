package DAO;

import DTO.*;
import Service.Menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReserveDao {
    public static void movieReserve1(int i) {
        try {
            String sql = "insert into reservation(movie_name) select movie_name from movie where num =?";
            Connection conn = DBDto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, i);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //todo: 선택한 영화에 대해서 movie 테이블의  audience 0인지 확인하고 아닐시  수를 하나 줄이고 예매할 좌석을 입력받는다.
    public static void movieReserve2() {
        try{
            String sql= "update movie set audience = ? where num =?";
            Connection conn = DBDto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            MovieDto.setAudience();
            pstmt.setInt(1, MovieDto.getAudience());
            pstmt.setInt(2,ResDto.getReservation_cnt());
            pstmt.executeUpdate();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    //todo: 선택한 영화의 이름을 가져와서 box_office의 movie_name과 일치하는지 확인하고 일치하면 box_offce의 행을 출력한다.
    public static void movieReserve3() {
        try{
            String sql= "select movie_name from movie where num='"+ResDto.getReservation_cnt()+"'";
            Connection conn = DBDto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);
            while (rs.next()) {
                String movie_name = rs.getString("movie_name");
                movieReserve4(movie_name);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    static void movieReserve4(String movie_name) {
        try{
            String sql= "select * from box_office where movie_name='"+movie_name+"'";
            Connection conn = DBDto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);
            if (rs.next()) {
                String movie_name2 = rs.getString("movie_name");
                String year = rs.getString("years");
                String ranks = rs.getString("ranks");
                String genre = rs.getString("genre");
                String director = rs.getString("director");
                System.out.println("영화이름:"+ movie_name2+"\n"+"년도:"+ year+"\n"+"순위:"+ ranks+"\n"+"장르:"+ genre+"\n"+"감독:"+ director+"\n");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




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
            if(!rs.next()) {
                System.out.println("reservation table삭제가 완료되었습니다.");
            };
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //reserve table이 존재하는지 확인한다.
    public static boolean reserveTableCheck() {
        try{
            String sql= "select * from reservation";
            Connection conn = DBDto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);
            if (rs.next()) {
                return true;
            }else{
                System.out.println("reservation table이 존재하지 않습니다.");
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
            System.out.println("reservation table이 생성되었습니다.");
        }catch (SQLException e) {
            System.out.println("reservation table이 이미 존재합니다.");
            Menu.menuSelect();
        }
    };
}
