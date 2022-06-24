package DTO;

public class MovieDto {
    private static int num;
    private String ranks;
    private String movie_name;

    private static int audience= 30;



    //getter and setter
    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        MovieDto.num = num;
    }

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
    public static void canAudience(){ audience ++;}

}

