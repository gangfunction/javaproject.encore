package dao;

import dto.*;
import service.Menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReserveDao {
    public static void seatReserve() throws SQLException
    {
        try
        {
            Connection conn = Dto.getConn();
            //movieRerserve에서 영화 정보를 가져온다.
            String sql = "update reservation set reserved=? ,seatnumber=?, id=? where num =? ";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setBoolean(1,true);
            pstmt.setString(2,SeatDto.getResult());
            pstmt.setString(3, MemberDto.getId());
            pstmt.setInt(4, MovieDto.getReservation_cnt());
            pstmt.executeUpdate();
            System.out.println("좌석 예약되었습니다.");
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void timeSet()
    {
        try
        {
            String sql= "update reservation set times=? where num=?;";
            Connection conn = Dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, ResDto.getTime());
            pstmt.setInt(2, MovieDto.getReservation_cnt());
            pstmt.executeUpdate();

        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void deleteReserveList()
    {
        try
        {
            reserveTableCheck();
            Connection conn = Dto.getConn();
            PreparedStatement pstmt;
            String sql= "truncate reservation";
            pstmt= conn.prepareStatement(sql);
            pstmt.execute(sql);
            String sql2 = "select * from reservation";
            ResultSet rs=pstmt.executeQuery(sql2);
            rs.next();
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
    //reservation  table이 존재하는지 확인한다.
    public static boolean reserveTableCheck()
    {
        try
        {
            String sql= "select * from reservation";
            Connection conn = Dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);
            if (rs.next())
            {
                return true;
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        return false;
    }
    public static void createTableReserve() throws SQLException
    {
        try
        {
            String sql= "create table reservation(num int primary key auto_increment, movie_name varchar(20), reserved boolean, seatnumber varchar(20), times varchar(20), id varchar(20))";
            Connection conn = Dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.execute(sql);
        }
        catch (SQLException e)
        {
            Menu.menuSelect();
        }
    }
}
