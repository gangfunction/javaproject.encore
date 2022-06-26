package dao;

import dto.Dto;
import dto.MemberDto;
import dto.MovieDto;
import dto.SeatDto;
import service.Menu;
import vo.SeatCancel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RescanDao {

    public static void RescanProcess() throws SQLException {
        Rescan();
        //예약을 취소했으니 audience cnt를 하나 증가시켜준다.
        canMovieUpdate();
        SeatCancel.SeatCan();
        CancelUpdate();
        Menu.menuSelect();
    }

    //todo: 첫번쨰 예약한것은 보이지 않는 문제가 있다.
    public static void Rescan() throws SQLException {
        //예약자의 아이디를 입력받아서,  표시해준다.
        String sql= "select * from reservation where id = ? and cancelled = 0";
        Connection conn = Dto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, MemberDto.getId());
        ResultSet rs = pstmt.executeQuery();
        if(MovieDto.getReserved()){
            System.out.println("예약하신 영화의 시간과 이름은 다음과 같습니다.");
        }else{
            System.out.println("예약된 영화가 없습니다.");
            Menu.menuSelect();
        }
        while(rs.next()){
                System.out.println(rs.getString("num") +"   "+ rs.getString("times") + " " + rs.getString("movie_name")+" "+rs.getString("seatnumber"));
        }
        System.out.println("취소하실 영화의 번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        MovieDto.setPointer(num);
        RescanSeat();

    }
    //취소할 영화의 좌석을 저장하는 메소드
    static void RescanSeat() throws SQLException {
        String sql= "select * from reservation where num = ?";
        Connection conn = Dto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, MovieDto.getPointer());
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
            SeatDto.setCanSeat(rs.getString("seatnumber"));
            RescanSplit();
        }
    }
    //저장한 좌석의 글자를 두개로 나누는 메소드
    static void RescanSplit() {
        SeatDto.setColumn(String.valueOf(SeatDto.getCanSeat().charAt(0)));
        SeatDto.setRow(String.valueOf(SeatDto.getCanSeat().charAt(1)));

    }

    public static void canMovieUpdate() throws SQLException {
        Connection conn = Dto.getConn();
        String sql = "update movie set audience=? where num =? ";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        MovieDto.canAudience();
        pstmt.setInt(1,MovieDto.getAudience());
        pstmt.setInt(2,MovieDto.getPointer());
        pstmt.executeUpdate();
        System.out.println("예약이 취소되었습니다.");
        audienceCan();
    }
    static void audienceCan(){
        switch(MovieDto.getPointer()){
            case 1:
                MovieDto.canAudience1();
                break;
            case 2:
                MovieDto.canAudience2();
                break;
            case 3:
                MovieDto.canAudience3();
                break;
            case 4:
                MovieDto.canAudience4();
                break;
            case 5:
                MovieDto.canAudience5();
                break;
            case 6:
                MovieDto.canAudience6();
                break;
            case 7:
                MovieDto.canAudience7();
                break;
            case 8:
                MovieDto.canAudience8();
                break;
            case 9:
                MovieDto.canAudience9();
                break;
            default:
                System.out.println("오류");
                break;
        }
    }



    //예약을 취소했을때 예약을 취소할떄 사용했던 좌석번호를 사용하여 취소했다는것을 업데이트해준다.
    static void CancelUpdate() throws SQLException {
        String sql = "update reservation set cancelled = ? where seatnumber=?";
        Connection conn = Dto.getConn();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, 1);
        pstmt.setString(2, SeatDto.getCanSeat());
        pstmt.executeUpdate();
    }

}
