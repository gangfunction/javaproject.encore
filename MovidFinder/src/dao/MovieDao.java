package dao;

import dto.Dto;
import dto.MovieDto;
import service.Menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieDao
{
    public static void Movie()
    {
        MovieDao.movieReserve1();
        MovieDao.movieReserve2();
        MovieDao.movieReserve3();
        MovieDao.movieReserve4();

    }

    public static void insertMovieList()
    {
        try
        {
            System.out.println("현재 상영중인 영화를 출력합니다.");
            String sql = "insert into movie(movie_name, ranks) select movie_name, ranks FROM box_office order by rand()LIMIT 9";
            Connection conn = Dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showMovieList()
    {
        try
        {
            String sql2 = "select movie_name, audience from movie";
            Connection conn = Dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql2);
            ResultSet rs = pstmt.executeQuery(sql2);
            int i = 1;
            while (rs.next())
            {
                String movie_name = rs.getString("movie_name");
                String audience = rs.getString("audience");
                System.out.println(i++ + "번째 영화" + "  " + "현재남은 좌석수:" + audience + "명   " + "영화이름:" + movie_name);
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

    }

    public static void deleteMovieList()
    {
        try
        {
            PreparedStatement pstmt;
            Connection conn = Dto.getConn();
            String sql = "truncate movie";
            pstmt = conn.prepareStatement(sql);
            pstmt.execute(sql);
            String sql2 = "select * from movie";
            ResultSet rs = pstmt.executeQuery(sql2);
            if (!rs.next())
            {
                System.out.println();
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void movie_search(String movie_search, String name)
    {
        //영화 검색기능 진입 표시
        System.out.println("영화 검색기능입니다.");
        try {
            Connection conn = Dto.getConn();
            String sql = "select * from box_office where " + movie_search + " like '%" + name + "%'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs;
            rs = pstmt.executeQuery(sql);
            if (rs.next()) {
                System.out.println("----------------------------------------------------");
            }
            while (rs.next()) {
                System.out.println(rs.getString("movie_name"));
            }
            if (rs.next()) {
                System.out.println("----------------------------------------------------");
            }
            Menu.menuSelect();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void movieReserve1()
    {
        try {
            String sql = "insert into reservation(movie_name) select movie_name from movie where num =?";
            Connection conn = Dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, MovieDto.getPointer());
            pstmt.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    //영화 이름을 받아와서 현재 선택한 영화로 저장하는 메소드 생성
    public static void movieReserve2()
    {
        try {
            String sql = "select movie_name from reservation where num=?";
            Connection conn = Dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, MovieDto.getPointer());
            ResultSet rs= pstmt.executeQuery();
            if(rs.next())
            {
                MovieDto.setMovieName(rs.getString("movie_name"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    public static void audienceSelect(){
        switch(MovieDto.getPointer()){
            case 1:
                MovieDto.setAudience(MovieDto.getAudience1());
                break;
            case 2:
                MovieDto.setAudience(MovieDto.getAudience2());
                break;
            case 3:
                MovieDto.setAudience(MovieDto.getAudience3());
                break;
            case 4:
                MovieDto.setAudience(MovieDto.getAudience4());
                break;
            case 5:
                MovieDto.setAudience(MovieDto.getAudience5());
                break;
            case 6:
                MovieDto.setAudience(MovieDto.getAudience6());
                break;
            case 7:
                MovieDto.setAudience(MovieDto.getAudience7());
                break;
            case 8:
                MovieDto.setAudience(MovieDto.getAudience8());
                break;
            case 9:
                MovieDto.setAudience(MovieDto.getAudience9());
                break;
            default:
                System.out.println("오류");
                break;
        }
    }

    public static void movieReserve3()
    {
        try {
            audienceUpdate();
            String sql = "update movie set audience = ? where movie_name =?";
            Connection conn = Dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, MovieDto.getAudience());
            pstmt.setString(2, MovieDto.getMovieName());
            pstmt.executeUpdate();

        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
    static void audienceUpdate(){
        switch(MovieDto.getPointer()){
            case 1:
                MovieDto.setAudience1();
                MovieDto.setAudience(MovieDto.getAudience1());
                break;
            case 2:
                MovieDto.setAudience2();
                MovieDto.setAudience(MovieDto.getAudience2());
                break;
            case 3:
                MovieDto.setAudience3();
                MovieDto.setAudience(MovieDto.getAudience3());
                break;
            case 4:
                MovieDto.setAudience4();
                MovieDto.setAudience(MovieDto.getAudience4());
                break;
            case 5:
                MovieDto.setAudience5();
                MovieDto.setAudience(MovieDto.getAudience5());
                break;
            case 6:
                MovieDto.setAudience6();
                MovieDto.setAudience(MovieDto.getAudience6());
                break;
            case 7:
                MovieDto.setAudience7();
                MovieDto.setAudience(MovieDto.getAudience7());
                break;
            case 8:
                MovieDto.setAudience8();
                MovieDto.setAudience(MovieDto.getAudience8());
                break;
            case 9:
                MovieDto.setAudience9();
                MovieDto.setAudience(MovieDto.getAudience9());
                break;
            default:
                System.out.println("오류");
                break;
        }
    }

    public static void movieReserve4()
    {
        try
        {
            String sql = "select * from box_office where movie_name='" + MovieDto.getMovieName() + "'";
            Connection conn = Dto.getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery(sql);
            if (rs.next())
            {
                String movie_name = rs.getString("movie_name");
                String year = rs.getString("years");
                String ranks = rs.getString("ranks");
                String genre = rs.getString("genre");
                String director = rs.getString("director");
                System.out.println("----------------------------------------------------");
                System.out.println("영화이름: " + movie_name + "\n" + "년도: " + year + "\n" + "순위: " + ranks + "\n" + "장르: " + genre + "\n" + "감독: " + director + "\n");
                System.out.println("----------------------------------------------------");
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
