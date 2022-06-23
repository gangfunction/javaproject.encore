package DTO;

public class MovieDto {
    private String ranks;
    private String movie_name;

    private static int audience= 30;



    //getter and setter
    public String getRanks() {
        return ranks;
    }

    public void setRanks(String ranks) {
        this.ranks = ranks;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public static int getAudience() {
        return audience;
    }

    public static void setAudience() {
        audience --;
    }

}

