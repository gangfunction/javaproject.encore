package DTO;

public class ResDto {
    private static String movie_name;
    private String id;
    private String times;
    private String seatnumber;
    private static boolean reserved = false;

    private static int reservation_cnt = 1;

    public static void setMovieName(String movie_name) {
        ResDto.movie_name = movie_name;
    }

    //getter and setter
    public static String getMovie_name() {
        return movie_name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(String seatnumber) {
        this.seatnumber = seatnumber;
    }

    public static boolean getReserved() {
        return reserved;
    }

    public static void setReserved(boolean reserved) {
        ResDto.reserved = reserved;
    }

    public static int getReservation_cnt() {
        return reservation_cnt;
    }

    public static void setReservation_cnt() {
        reservation_cnt++;
    }

}
