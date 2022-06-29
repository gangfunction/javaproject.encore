package dto;

public class movieDto {




    private static int pointer;


    public static String movie_name;
    public static boolean reserved = false;


    private static int useAudience= 30;
    public static int getAudience(){
        return useAudience;
    }

    static int reservation = 0;



    //getter and setter
    public static int getPointer() {
        return pointer;
    }

    public static void setPointer(int num) {
        movieDto.pointer = num;
    }



    //getter and setter
    public static String getMovieName() {
        return movie_name;
    }

    public static void setMovieName(String movie_name) {
        movieDto.movie_name = movie_name;
    }

    public static boolean getReserved() {
        return reserved;
    }

    public static void setReserved(boolean reserved) {
        movieDto.reserved = reserved;
    }


    public static int getReservation() {
        return reservation;
    }

    public static void setReservation() {
        reservation ++;
    }

    public static void canAudience() {
        useAudience ++;
    }
}

