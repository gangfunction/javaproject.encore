package DAO;

import DTO.Dto;

import java.sql.*;

public class ReserveDao {
    public static void movieReserve1(int i) {
        try {
            String sql = "insert into reserve(movie_name) select movie_name from movie where num =?";
            Connection conn = Dao.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            System.out.println("insert문에서 사용되는 인자는 " + i + "입니다.");
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
            Connection conn = Dao.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            Dto.setAudience();
            pstmt.setInt(1, Dto.getAudience());
            pstmt.setInt(2,Dto.getReservation_cnt());
            pstmt.executeUpdate();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    //todo: 선택한 영화의 이름을 가져와서 box_office의 movie_name과 일치하는지 확인하고 일치하면 box_offce의 행을 출력한다.
    public static void movieReserve3() {
        try{
            String sql= "select movie_name from movie where num='"+Dto.getReservation_cnt()+"'";
            Connection conn = Dao.getConn();
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
            Connection conn = Dao.getConn();
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
        Connection conn = Dao.getConn();
        //movieRerserve에서 영화 정보를 가져온다.

        String sql = "update reserve set reserved=? ,seatnumber=?, id=? where num =? ";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setBoolean(1,true);
        pstmt.setString(2,i+i1);
        pstmt.setString(3,Dto.getId());
        pstmt.setInt(4,Dto.getReservation_cnt());
        Dto.setReservation_cnt();
        pstmt.executeUpdate();
        System.out.println("좌석 예약되었습니다.");
        seatCount();
    }

    //좌석 예약한 갯수 표시
    private static void seatCount() throws SQLException {
        Connection conn = Dao.getConn();
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery("select reserved from reserve ");
        int rowCount = rs.getRow();
        System.out.println("예매된 좌석의 갯수는 " + rowCount + "개 입니다.");
    }

    public static void timeSet(int i) {
        try{
            String sql= "update reserve set time=? where num=?";
            Connection conn = Dao.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            if(i==1){
                pstmt.setString(1, "10:00");
            }else{
                pstmt.setString(1, "14:00");
            }
            pstmt.setInt(2, Dto.getReservation_cnt());
            pstmt.executeUpdate();
            System.out.println("예매 시간 업데이트 완료");
            Dto.setReservation_cnt();
            System.out.println("예약자 수 증가");
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showReserve(){
        try{
            String sql= "select * from reserve where num='"+Dto.getReservation_cnt()+"'";
            Connection conn = Dao.getConn();
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
            String sql= "truncate reserve";
            Connection conn = Dao.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
            System.out.println("reserve table 내용삭제 완료");
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
