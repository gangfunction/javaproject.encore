package vo;

import dto.MovieDto;
import dto.SeatDto;
import vo.theater.*;

import java.util.Arrays;

public class SeatCancel {
    public static void SeatCan() {
        switch (MovieDto.getPointer()) {
            case 1: {
                SeatCancel.SeatCan1();
                break;
            }
            case 2: {
                SeatCancel.SeatCan2();
                break;
            }
            case 3: {
                SeatCancel.SeatCan3();
                break;
            }
            case 4: {
                SeatCancel.SeatCan4();
                break;
            }
            case 5: {
                SeatCancel.SeatCan5();
                break;
            }
            case 6: {
                SeatCancel.SeatCan6();
                break;
            }
            case 7: {
                SeatCancel.SeatCan7();
                break;
            }
            case 8: {
                SeatCancel.SeatCan8();
                break;
            }
            case 9: {
                SeatCancel.SeatCan9();
                break;
            }
            default:
                System.out.println("영화 정보가 없습니다.");
        }
    }

    private static void SeatCan1() {
        switch (SeatDto.getColumn()) {
            case "A": {
                if (Arrays.asList(movieDefault.getArr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getArr()).indexOf(SeatDto.getCanSeat());
                    movie1.getArr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "B": {
                if (Arrays.asList(movieDefault.getBrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getBrr()).indexOf(SeatDto.getCanSeat());
                    movie1.getBrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "C": {
                if (Arrays.asList(movieDefault.getCrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getCrr()).indexOf(SeatDto.getCanSeat());
                    movie1.getCrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "D": {
                if (Arrays.asList(movieDefault.getDrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getDrr()).indexOf(SeatDto.getCanSeat());
                    movie1.getDrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "E": {
                if (Arrays.asList(movieDefault.getErr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getErr()).indexOf(SeatDto.getCanSeat());
                    movie1.getErr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            default:
                System.out.println("영화 정보가 없습니다.cancel 1");
        }
    }

    public static void SeatCan2() {
        switch (SeatDto.getColumn()) {
            case "A": {
                if (Arrays.asList(movieDefault.getArr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getArr()).indexOf(SeatDto.getCanSeat());
                    movie2.getArr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "B": {
                if (Arrays.asList(movieDefault.getBrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getBrr()).indexOf(SeatDto.getCanSeat());
                    movie2.getBrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "C": {
                if (Arrays.asList(movieDefault.getCrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getCrr()).indexOf(SeatDto.getCanSeat());
                    movie2.getCrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "D": {
                if (Arrays.asList(movieDefault.getDrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getDrr()).indexOf(SeatDto.getCanSeat());
                    movie2.getDrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "E": {
                if (Arrays.asList(movieDefault.getErr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getErr()).indexOf(SeatDto.getCanSeat());
                    movie2.getErr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            default:
                System.out.println("영화 정보가 없습니다.cancel 2");
        }
    }

    public static void SeatCan3() {
        switch (SeatDto.getColumn()) {
            case "A": {
                if (Arrays.asList(movieDefault.getArr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getArr()).indexOf(SeatDto.getCanSeat());
                    movie3.getArr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "B": {
                if (Arrays.asList(movieDefault.getBrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getBrr()).indexOf(SeatDto.getCanSeat());
                    movie3.getBrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "C": {
                if (Arrays.asList(movieDefault.getCrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getCrr()).indexOf(SeatDto.getCanSeat());
                    movie3.getCrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "D": {
                if (Arrays.asList(movieDefault.getDrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getDrr()).indexOf(SeatDto.getCanSeat());
                    movie3.getDrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "E": {
                if (Arrays.asList(movieDefault.getErr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getErr()).indexOf(SeatDto.getCanSeat());
                    movie3.getErr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            default:
                System.out.println("영화 정보가 없습니다.cancel 3");
        }
    }

    public static void SeatCan4() {
        switch (SeatDto.getColumn()) {
            case "A": {
                if (Arrays.asList(movieDefault.getArr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getArr()).indexOf(SeatDto.getCanSeat());
                    movie4.getArr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "B": {
                if (Arrays.asList(movieDefault.getBrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getBrr()).indexOf(SeatDto.getCanSeat());
                    movie4.getBrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "C": {
                if (Arrays.asList(movieDefault.getCrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getCrr()).indexOf(SeatDto.getCanSeat());
                    movie4.getCrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "D": {
                if (Arrays.asList(movieDefault.getDrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getDrr()).indexOf(SeatDto.getCanSeat());
                    movie4.getDrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "E": {
                if (Arrays.asList(movieDefault.getErr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getErr()).indexOf(SeatDto.getCanSeat());
                    movie4.getErr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            default:
                System.out.println("영화 정보가 없습니다.cancel 4");
        }
    }

    public static void SeatCan5() {
        switch (SeatDto.getColumn()) {
            case "A": {
                if (Arrays.asList(movieDefault.getArr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getArr()).indexOf(SeatDto.getCanSeat());
                    movie5.getArr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "B": {
                if (Arrays.asList(movieDefault.getBrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getBrr()).indexOf(SeatDto.getCanSeat());
                    movie5.getBrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "C": {
                if (Arrays.asList(movieDefault.getCrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getCrr()).indexOf(SeatDto.getCanSeat());
                    movie5.getCrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "D": {
                if (Arrays.asList(movieDefault.getDrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getDrr()).indexOf(SeatDto.getCanSeat());
                    movie5.getDrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "E": {
                if (Arrays.asList(movieDefault.getErr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getErr()).indexOf(SeatDto.getCanSeat());
                    movie5.getErr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            default:
                System.out.println("영화 정보가 없습니다.cancel 5");
        }
    }

    public static void SeatCan6() {
        switch (SeatDto.getColumn()) {
            case "A": {
                if (Arrays.asList(movieDefault.getArr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getArr()).indexOf(SeatDto.getCanSeat());
                    movie6.getArr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "B": {
                if (Arrays.asList(movieDefault.getBrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getBrr()).indexOf(SeatDto.getCanSeat());
                    movie6.getBrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "C": {
                if (Arrays.asList(movieDefault.getCrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getCrr()).indexOf(SeatDto.getCanSeat());
                    movie6.getCrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "D": {
                if (Arrays.asList(movieDefault.getDrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getDrr()).indexOf(SeatDto.getCanSeat());
                    movie6.getDrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "E": {
                if (Arrays.asList(movieDefault.getErr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getErr()).indexOf(SeatDto.getCanSeat());
                    movie6.getErr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            default:
                System.out.println("영화 정보가 없습니다.cancel 6");
        }
    }

    public static void SeatCan7() {
        switch (SeatDto.getColumn()) {
            case "A": {
                if (Arrays.asList(movieDefault.getArr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getArr()).indexOf(SeatDto.getCanSeat());
                    movie7.getArr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "B": {
                if (Arrays.asList(movieDefault.getBrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getBrr()).indexOf(SeatDto.getCanSeat());
                    movie7.getBrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "C": {
                if (Arrays.asList(movieDefault.getCrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getCrr()).indexOf(SeatDto.getCanSeat());
                    movie7.getCrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "D": {
                if (Arrays.asList(movieDefault.getDrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getDrr()).indexOf(SeatDto.getCanSeat());
                    movie7.getDrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "E": {
                if (Arrays.asList(movieDefault.getErr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getErr()).indexOf(SeatDto.getCanSeat());
                    movie7.getErr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            default:
                System.out.println("영화 정보가 없습니다.cancel 7");
        }
    }

    public static void SeatCan8() {
        switch (SeatDto.getColumn()) {
            case "A": {
                if (Arrays.asList(movieDefault.getArr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getArr()).indexOf(SeatDto.getCanSeat());
                    movie8.getArr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "B": {
                if (Arrays.asList(movieDefault.getBrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getBrr()).indexOf(SeatDto.getCanSeat());
                    movie8.getBrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "C": {
                if (Arrays.asList(movieDefault.getCrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getCrr()).indexOf(SeatDto.getCanSeat());
                    movie8.getCrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "D": {
                if (Arrays.asList(movieDefault.getDrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getDrr()).indexOf(SeatDto.getCanSeat());
                    movie8.getDrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "E": {
                if (Arrays.asList(movieDefault.getErr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getErr()).indexOf(SeatDto.getCanSeat());
                    movie8.getErr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            default:
                System.out.println("영화 정보가 없습니다.cancel 8");
        }
    }

    public static void SeatCan9() {
        switch (SeatDto.getColumn()) {
            case "A": {
                if (Arrays.asList(movieDefault.getArr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getArr()).indexOf(SeatDto.getCanSeat());
                    movie9.getArr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "B": {
                if (Arrays.asList(movieDefault.getBrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getBrr()).indexOf(SeatDto.getCanSeat());
                    movie9.getBrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "C": {
                if (Arrays.asList(movieDefault.getCrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getCrr()).indexOf(SeatDto.getCanSeat());
                    movie9.getCrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "D": {
                if (Arrays.asList(movieDefault.getDrr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getDrr()).indexOf(SeatDto.getCanSeat());
                    movie9.getDrr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            case "E": {
                if (Arrays.asList(movieDefault.getErr()).contains(SeatDto.getCanSeat())) {
                    int tmp = Arrays.asList(movieDefault.getErr()).indexOf(SeatDto.getCanSeat());
                    movie9.getErr()[tmp] = SeatDto.getCanSeat();
                }
                break;
            }
            default:
                System.out.println("영화 정보가 없습니다.cancel 9");
        }
    }
}