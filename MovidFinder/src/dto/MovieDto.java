package dto;

public class MovieDto {
    public static String movie_name;
    public static boolean reserved = false;
    private static int pointer;
    private static int audience1= 30;
    private static int audience2= 30;
    private static int audience3= 30;
    private static int audience4= 30;
    private static int audience5= 30;
    private static int audience6= 30;
    private static int audience7= 30;
    private static int audience8= 30;
    private static int audience9= 30;

    private static int useAudience= 30;
    public static int getAudience(){
        return useAudience;
    }
    public static void setAudience(int audience){
        MovieDto.useAudience= audience;
    }
    static int reservation_cnt = 0;

    //todo movie namelist를 배열로 설정한다.


    //getter and setter
    public static int getPointer() {
        return pointer;
    }

    public static void setPointer(int num) {
        MovieDto.pointer = num;
    }

    public static int getAudience1() {
        return audience1;
    }
    public static int getAudience2() {
        return audience2;
    }
    public static int getAudience3() {
        return audience3;
    }
    public static int getAudience4() {
        return audience4;
    }
    public static int getAudience5() {
        return audience5;
    }
    public static int getAudience6() {
        return audience6;
    }
    public static int getAudience7() {
        return audience7;
    }
    public static int getAudience8() {
        return audience8;
    }
    public static int getAudience9() {
        return audience9;
    }


    public static void setAudience1() {
        audience1 --;
    }
    public static void canAudience1(){ audience1 ++;}
    public static void setAudience2() {
        audience2 --;
    }
    public static void canAudience2(){ audience2 ++;}
    public static void setAudience3() {
        audience3 --;
    }
    public static void canAudience3(){ audience3 ++;}
    public static void setAudience4() {
        audience4 --;
    }
    public static void canAudience4(){ audience4 ++;}
    public static void setAudience5() {
        audience5 --;
    }
    public static void canAudience5(){ audience5 ++;}
    public static void setAudience6() {
        audience6 --;
    }
    public static void canAudience6(){ audience6 ++;}
    public static void setAudience7() {
        audience7 --;
    }
    public static void canAudience7(){ audience7 ++;}
    public static void setAudience8() {
        audience8 --;
    }
    public static void canAudience8(){ audience8 ++;}
    public static void setAudience9() {
        audience9 --;
    }
    public static void canAudience9(){ audience9 ++;}



    //getter and setter
    public static String getMovieName() {
        return movie_name;
    }

    public static void setMovieName(String movie_name) {
        MovieDto.movie_name = movie_name;
    }

    public static boolean getReserved() {
        return reserved;
    }

    public static void setReserved(boolean reserved) {
        MovieDto.reserved = reserved;
    }


    public static int getReservation_cnt() {
        return reservation_cnt;
    }

    public static void setReservation_cnt() {
        reservation_cnt ++;
    }

    public static void canAudience() {
        useAudience ++;
    }
}

