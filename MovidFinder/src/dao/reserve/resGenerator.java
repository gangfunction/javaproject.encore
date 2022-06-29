package dao.reserve;

import dto.movieDto;

public class resGenerator {
    String[] seat = {"1관", "2관", "3관", "4관", "5관", "6관", "7관", "8관", "9관"};
    static Chair movie1;
    static Chair movie2;
    static Chair movie3;
    static Chair movie4;
    static Chair movie5;
    static Chair movie6;
    static Chair movie7;
    static Chair movie8;
    static Chair movie9;
    public resGenerator() {
        switch (movieDto.getPointer()) {
            case 1 -> {
                if (movie1 == null) {
                    movie1 = new Chair(seat[0]);
                }
                System.out.println(seat[0]);
                new seatEdit(movie1);
                movie1.showing();

            }
            case 2 -> {
                if (movie2 == null) {
                    movie2 = new Chair(seat[1]);
                }
                System.out.println(seat[1]);
                new seatEdit(movie2);
                movie2.showing();

            }
            case 3 -> {
                if (movie3 == null) {
                    movie3 = new Chair(seat[2]);
                }
                System.out.println(seat[2]);
                new seatEdit(movie3);
                movie3.showing();

            }
            case 4 -> {
                if (movie4 == null) {
                    movie4 = new Chair(seat[3]);
                }
                System.out.println(seat[3]);
                new seatEdit(movie4);
                movie4.showing();

            }
            case 5 -> {
                if (movie5 == null) {
                    movie5 = new Chair(seat[4]);
                }
                System.out.println(seat[4]);
                new seatEdit(movie5);
                movie5.showing();

            }
            case 6 -> {
                if (movie6 == null) {
                    movie6 = new Chair(seat[5]);
                }
                System.out.println(seat[5]);
                new seatEdit(movie6);
                movie6.showing();

            }
            case 7 -> {
                if (movie7 == null) {
                    movie7 = new Chair(seat[6]);
                }
                System.out.println(seat[6]);
                new seatEdit(movie7);
                movie7.showing();

            }
            case 8 -> {
                if (movie8 == null) {
                    movie8 = new Chair(seat[7]);
                }
                System.out.println(seat[7]);
                new seatEdit(movie8);
                movie8.showing();

            }
            case 9 -> {
                if (movie9 == null) {
                    movie9 = new Chair(seat[8]);
                }
                System.out.println(seat[8]);
                new seatEdit(movie9);
                movie9.showing();

            }
            default -> System.out.println("예약할 좌석이 없습니다.");
        }
    }
}
