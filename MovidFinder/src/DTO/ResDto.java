package DTO;

public class ResDto {
    private String movie_name;
    private String id;
    private String times;
    private String seatnumber;
    private boolean reserved;

    private static int reservation_cnt = 1;

    //getter and setter
    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
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

    public boolean getReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public static int getReservation_cnt() {
        return reservation_cnt;
    }

    public static void setReservation_cnt() {
        reservation_cnt++;
    }

}
