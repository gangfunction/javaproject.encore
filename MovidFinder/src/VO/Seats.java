package VO;

import java.util.Arrays;

public class Seats {
    private static final Seat movie1 = new Seat();
    private static final Seat movie2 = new Seat();
    private static final Seat movie3 = new Seat();
    private static final Seat movie4 = new Seat();
    private static final Seat movie5 = new Seat();
    private static final Seat movie6 = new Seat();
    private static final Seat movie7 = new Seat();
    private static final Seat movie8 = new Seat();
    private static final Seat movie9 = new Seat();


    //getter and setter
    public static Seat getMovie1() {
        return movie1;
    }
    public static Seat getMovie2() {
        return movie2;
    }

    public static Seat getMovie3() {
        return movie3;
    }
    public static Seat getMovie4() {
        return movie4;
    }

    public static Seat getMovie5() {
        return movie5;
    }

    public static Seat getMovie6() {
        return movie6;
    }

    public static Seat getMovie7() {
        return movie7;
    }

    public static Seat getMovie8() {
        return movie8;
    }

    public static Seat getMovie9() {
        return movie9;
    }


    //스위치 문을 만들어서 영화의 카운트를 읽어들이고 만약에 카운트가 1이면 영화좌석을 더이상 생성하지 않는다.


    public static void SeatReplace(int i, String j, String k) {
        switch (i) {
            case 1 -> AnySeats(j, k, movie1);
            case 2 -> AnySeats(j, k, movie2);
            case 3 -> AnySeats(j, k, movie3);
            case 4 -> AnySeats(j, k, movie4);
            case 5 -> AnySeats(j, k, movie5);
            case 6 -> AnySeats(j, k, movie6);
            case 7 -> AnySeats(j, k, movie7);
            case 8 -> AnySeats(j, k, movie8);
            case 9 -> AnySeats(j, k, movie9);
            default -> System.out.println("Error");

        }


    }

    public static void AnySeats(String j, String k, Seat movie1) {
        switch (j) {
            case "A" -> {
                if (Arrays.asList(movie1.getArr()).contains(k)) {
                    int tmp = getTmp(movie1.getArr(), k);
                    movie1.setArr(tmp, "NO");
                }
            }
            case "B" -> {
                if (Arrays.asList(movie1.getBrr()).contains(k)) {
                    int tmp = getTmp(movie1.getBrr(), k);
                    movie1.setBrr(tmp, "NO");
                }
            }
            case "C" -> {
                if (Arrays.asList(movie1.getCrr()).contains(k)) {
                    int tmp = getTmp(movie1.getCrr(), k);
                    movie1.setCrr(tmp, "NO");
                }
            }
            case "D" -> {
                if (Arrays.asList(movie1.getDrr()).contains(k)) {
                    int tmp = getTmp(movie1.getDrr(), k);
                    movie1.setDrr(tmp, "NO");
                }
            }
            case "E" -> {
                if (Arrays.asList(movie1.getErr()).contains(k)) {
                    int tmp = getTmp(movie1.getErr(), k);
                    movie1.setErr(tmp, "NO");
                }
            }
        }
    }

    public static int getTmp(String[] movie7, String k) {
        return Arrays.asList(movie7).indexOf(k);
    }



}



