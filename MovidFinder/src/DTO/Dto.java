package DTO;

public class Dto{
    private static String id;
    private String pwd;
    private static boolean isin;
    private boolean admin;
    private String title;
    private String content;

    private static boolean logCheck;

    private String movie_search;
    private String name;

    private static int audience_cnt= 30;

    private static int reservation_cnt= 1;


    //getter and setter
    public static int getReservation_cnt() {
        return reservation_cnt;
    }

    public static void setReservation_cnt() {
        reservation_cnt++;
    }
    public static int getAudience() {
        return audience_cnt;
    }
    public static void setAudience(){
        audience_cnt--;
    }

    public static String getId() {return id;}

    public static void setId(String id) {
        Dto.id = id;
    }

    public static void setIsin(boolean isin) {
        Dto.isin = isin;
    }

    public static boolean getisin() {
        return isin;
    }

    public String getPwd() {
        return pwd;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public boolean isAdmin() {
        return admin;
    }


}
