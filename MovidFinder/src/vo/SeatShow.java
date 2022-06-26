package vo;

import dto.MovieDto;
import vo.theater.*;

public class SeatShow {
    public static void seatShowing(){
        switch(MovieDto.getPointer()){
            case 1:
                seattheater1();
                break;
            case 2:
                seattheater2();
                break;
            case 3:
                seattheater3();
                break;
            case 4:
                seattheater4();
                break;
            case 5:
                seattheater5();
                break;
            case 6:
                seattheater6();
                break;
            case 7:
                seattheater7();
                break;
            case 8:
                seattheater8();
                break;
            case 9:
                seattheater9();
                break;
            default:System.out.println("영화 정보가 없습니다.");
        }
    }




    public static void seattheater1() {
        System.out.println("1번 영화 정보입니다.");
        for (int i = 0; i < 6; i++) {
            System.out.print(movie1.getArr()[i] + " " + movie1.getBrr()[i] + " " + movie1.getCrr()[i] + " " + movie1.getDrr()[i] + " " + movie1.getErr()[i] + "\n");
        }
    }

    public static void seattheater2() {
        System.out.println("2번 영화 정보입니다.");

        for (int i = 0; i < 6; i++) {
            System.out.print(movie2.getArr()[i] + " " + movie2.getBrr()[i] + " " + movie2.getCrr()[i] + " " + movie2.getDrr()[i] + " " + movie2.getErr()[i] + "\n");
        }
    }

    public static void seattheater3() {
        System.out.println("3번 영화 정보입니다.");

        for (int i = 0; i < 6; i++) {
            System.out.print(movie3.getArr()[i] + " " + movie3.getBrr()[i] + " " + movie3.getCrr()[i] + " " + movie3.getDrr()[i] + " " + movie3.getErr()[i] + "\n");
        }
    }

    public static void seattheater4() {

        System.out.println("4번 영화 정보입니다.");
        for (int i = 0; i < 6; i++) {
            System.out.print(movie4.getArr()[i] + " " + movie4.getBrr()[i] + " " + movie4.getCrr()[i] + " " + movie4.getDrr()[i] + " " + movie4.getErr()[i] + "\n");
        }
    }

    public static void seattheater5() {
        System.out.println("5번 영화 정보입니다.");

        for (int i = 0; i < 6; i++) {
            System.out.print(movie5.getArr()[i] + " " + movie5.getBrr()[i] + " " + movie5.getCrr()[i] + " " + movie5.getDrr()[i] + " " + movie5.getErr()[i] + "\n");
        }
    }

    public static void seattheater6() {
        System.out.println("6번 영화 정보입니다.");

        for (int i = 0; i < 6; i++) {
            System.out.print(movie6.getArr()[i] + " " + movie6.getBrr()[i] + " " + movie6.getCrr()[i] + " " + movie6.getDrr()[i] + " " + movie6.getErr()[i] + "\n");
        }
    }

    public static void seattheater7() {
        System.out.println("7번 영화 정보입니다.");

        for (int i = 0; i < 6; i++) {
            System.out.print(movie7.getArr()[i] + " " + movie7.getBrr()[i] + " " + movie7.getCrr()[i] + " " + movie7.getDrr()[i] + " " + movie7.getErr()[i] + "\n");
        }
    }

    public static void seattheater8() {
        System.out.println("8번 영화 정보입니다.");

        for (int i = 0; i < 6; i++) {
            System.out.print(movie8.getArr()[i] + " " + movie8.getBrr()[i] + " " + movie8.getCrr()[i] + " " + movie8.getDrr()[i] + " " + movie8.getErr()[i] + "\n");
        }
    }

    public static void seattheater9() {

        System.out.println("9번 영화 정보입니다.");
        for (int i = 0; i < 6; i++) {
            System.out.print(movie9.getArr()[i] + " " + movie9.getBrr()[i] + " " + movie9.getCrr()[i] + " " + movie9.getDrr()[i] + " " + movie9.getErr()[i] + "\n");
        }
    }


}




