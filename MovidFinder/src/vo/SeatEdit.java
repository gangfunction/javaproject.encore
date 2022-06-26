package vo;

import dto.MovieDto;
import dto.SeatDto;
import vo.theater.*;

import java.util.Arrays;

public class SeatEdit{
    public static void OccupySeats() {
        switch (MovieDto.getPointer()) {
            case 1:
                SeatEdit.SeatEdit1();
                break;
            case 2:
                SeatEdit.SeatEdit2();
                break;

            case 3:
                SeatEdit.SeatEdit3();
                break;
            case 4:
                SeatEdit.SeatEdit4();
                break;
            case 5:
                SeatEdit.SeatEdit5();
                break;
            case 6:
                SeatEdit.SeatEdit6();
                break;
            case 7:
                SeatEdit.SeatEdit7();
                break;
            case 8:
                SeatEdit.SeatEdit8();
                break;
            case 9:
                SeatEdit.SeatEdit9();
                break;
            default:
                System.out.println("잘못된 입력입니다.10");
        }
    }



    private static void SeatEdit1(){

        switch (SeatDto.getColumn()) {
            case "A" -> {
                if (Arrays.asList(movie1.getArr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie1.getArr()).indexOf(SeatDto.getResult());
                    movie1.setArr(tmp, "NO");}}
            case "B" -> {
                if (Arrays.asList(movie1.getBrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie1.getBrr()).indexOf(SeatDto.getResult());
                    movie1.setBrr(tmp, "NO");}}
            case "C" -> {
                if (Arrays.asList(movie1.getCrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie1.getCrr()).indexOf(SeatDto.getResult());
                    movie1.setCrr(tmp, "NO");}}
            case "D" -> {
                if (Arrays.asList(movie1.getDrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie1.getDrr()).indexOf(SeatDto.getResult());
                    movie1.setDrr(tmp, "NO");}}
            case "E" -> {
                if (Arrays.asList(movie1.getErr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie1.getErr()).indexOf(SeatDto.getResult());
                    movie1.setErr(tmp, "NO");}}
            default -> System.out.println("잘못된 입력입니다.1");
        }
    }
    private static void SeatEdit2(){
            switch (SeatDto.getColumn()) {
                case "A" -> {
                    if (Arrays.asList(movie2.getArr()).contains(SeatDto.getResult())) {
                        int tmp = Arrays.asList(movie2.getArr()).indexOf(SeatDto.getResult());
                        movie2.setArr(tmp, "NO");
                    }
                }
                case "B" -> {
                    if (Arrays.asList(movie2.getBrr()).contains(SeatDto.getResult())) {
                        int tmp = Arrays.asList(movie2.getBrr()).indexOf(SeatDto.getResult());
                        movie2.setBrr(tmp, "NO");
                    }
                }
                case "C" -> {
                    if (Arrays.asList(movie2.getCrr()).contains(SeatDto.getResult())) {
                        int tmp = Arrays.asList(movie2.getCrr()).indexOf(SeatDto.getResult());
                        movie2.setCrr(tmp, "NO");
                    }
                }
                case "D" -> {
                    if (Arrays.asList(movie2.getDrr()).contains(SeatDto.getResult())) {
                        int tmp = Arrays.asList(movie2.getDrr()).indexOf(SeatDto.getResult());
                        movie2.setDrr(tmp, "NO");
                    }
                }
                case "E" -> {
                    if (Arrays.asList(movie2.getErr()).contains(SeatDto.getResult())) {
                        int tmp = Arrays.asList(movie2.getErr()).indexOf(SeatDto.getResult());
                        movie2.setErr(tmp, "NO");
                    }
                }
                default -> System.out.println("잘못된 입력입니다.2");
            }
        }
    private static void SeatEdit3(){
        switch (SeatDto.getColumn()) {
            case "A" -> {
                if (Arrays.asList(movie3.getArr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie3.getArr()).indexOf(SeatDto.getResult());
                    movie3.setArr(tmp, "NO");
                }
            }
            case "B" -> {
                if (Arrays.asList(movie3.getBrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie3.getBrr()).indexOf(SeatDto.getResult());
                    movie3.setBrr(tmp, "NO");
                }
            }
            case "C" -> {
                if (Arrays.asList(movie3.getCrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie3.getCrr()).indexOf(SeatDto.getResult());
                    movie3.setCrr(tmp, "NO");
                }
            }
            case "D" -> {
                if (Arrays.asList(movie3.getDrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie3.getDrr()).indexOf(SeatDto.getResult());
                    movie3.setDrr(tmp, "NO");
                }
            }
            case "E" -> {
                if (Arrays.asList(movie3.getErr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie3.getErr()).indexOf(SeatDto.getResult());
                    movie3.setErr(tmp, "NO");
                }
            }
            default -> System.out.println("잘못된 입력입니다.3");
        }
    }
    private static void SeatEdit4() {
        switch (SeatDto.getColumn()) {
            case "A" -> {
                if (Arrays.asList(movie4.getArr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie4.getArr()).indexOf(SeatDto.getResult());
                    movie4.setArr(tmp, "NO");
                }
            }
            case "B" -> {
                if (Arrays.asList(movie4.getBrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie4.getBrr()).indexOf(SeatDto.getResult());
                    movie4.setBrr(tmp, "NO");
                }
            }
            case "C" -> {
                if (Arrays.asList(movie4.getCrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie4.getCrr()).indexOf(SeatDto.getResult());
                    movie4.setCrr(tmp, "NO");
                }
            }
            case "D" -> {
                if (Arrays.asList(movie4.getDrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie4.getDrr()).indexOf(SeatDto.getResult());
                    movie4.setDrr(tmp, "NO");
                }
            }
            case "E" -> {
                if (Arrays.asList(movie4.getErr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie4.getErr()).indexOf(SeatDto.getResult());
                    movie4.setErr(tmp, "NO");
                }
            }
            default -> System.out.println("잘못된 입력입니다.4");
        }
    }
    private static void SeatEdit5(){
        switch (SeatDto.getColumn()) {
            case "A" -> {
                if (Arrays.asList(movie5.getArr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie5.getArr()).indexOf(SeatDto.getResult());
                    movie5.setArr(tmp, "NO");
                }
            }
            case "B" -> {
                if (Arrays.asList(movie5.getBrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie5.getBrr()).indexOf(SeatDto.getResult());
                    movie5.setBrr(tmp, "NO");
                }
            }
            case "C" -> {
                if (Arrays.asList(movie5.getCrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie5.getCrr()).indexOf(SeatDto.getResult());
                    movie5.setCrr(tmp, "NO");
                }
            }
            case "D" -> {
                if (Arrays.asList(movie5.getDrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie5.getDrr()).indexOf(SeatDto.getResult());
                    movie5.setDrr(tmp, "NO");
                }
            }
            case "E" -> {
                if (Arrays.asList(movie5.getErr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie5.getErr()).indexOf(SeatDto.getResult());
                    movie5.setErr(tmp, "NO");
                }
            }
            default -> System.out.println("잘못된 입력입니다.5");
        }
    }
    private static void SeatEdit6(){
        switch (SeatDto.getColumn()) {
            case "A" -> {
                if (Arrays.asList(movie6.getArr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie6.getArr()).indexOf(SeatDto.getResult());
                    movie6.setArr(tmp, "NO");
                }
            }
            case "B" -> {
                if (Arrays.asList(movie6.getBrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie6.getBrr()).indexOf(SeatDto.getResult());
                    movie6.setBrr(tmp, "NO");
                }
            }
            case "C" -> {
                if (Arrays.asList(movie6.getCrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie6.getCrr()).indexOf(SeatDto.getResult());
                    movie6.setCrr(tmp, "NO");
                }
            }
            case "D" -> {
                if (Arrays.asList(movie6.getDrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie6.getDrr()).indexOf(SeatDto.getResult());
                    movie6.setDrr(tmp, "NO");
                }
            }
            case "E" -> {
                if (Arrays.asList(movie6.getErr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie6.getErr()).indexOf(SeatDto.getResult());
                    movie6.setErr(tmp, "NO");
                }
            }
            default -> System.out.println("잘못된 입력입니다.6");
        }}
    private static void SeatEdit7(){
        switch (SeatDto.getColumn()) {
            case "A" -> {
                if (Arrays.asList(movie7.getArr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie7.getArr()).indexOf(SeatDto.getResult());
                    movie7.setArr(tmp, "NO");
                }
            }
            case "B" -> {
                if (Arrays.asList(movie7.getBrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie7.getBrr()).indexOf(SeatDto.getResult());
                    movie7.setBrr(tmp, "NO");
                }
            }
            case "C" -> {
                if (Arrays.asList(movie7.getCrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie7.getCrr()).indexOf(SeatDto.getResult());
                    movie7.setCrr(tmp, "NO");
                }
            }
            case "D" -> {
                if (Arrays.asList(movie7.getDrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie7.getDrr()).indexOf(SeatDto.getResult());
                    movie7.setDrr(tmp, "NO");
                }
            }
            case "E" -> {
                if (Arrays.asList(movie7.getErr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie7.getErr()).indexOf(SeatDto.getResult());
                    movie7.setErr(tmp, "NO");
                }
            }
            default -> System.out.println("잘못된 입력입니다.7");
        }
    }
    private static void SeatEdit8() {
        switch (SeatDto.getColumn()) {
            case "A" -> {
                if (Arrays.asList(movie8.getArr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie8.getArr()).indexOf(SeatDto.getResult());
                    movie8.setArr(tmp, "NO");
                }
            }
            case "B" -> {
                if (Arrays.asList(movie8.getBrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie8.getBrr()).indexOf(SeatDto.getResult());
                    movie8.setBrr(tmp, "NO");
                }
            }
            case "C" -> {
                if (Arrays.asList(movie8.getCrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie8.getCrr()).indexOf(SeatDto.getResult());
                    movie8.setCrr(tmp, "NO");
                }
            }
            case "D" -> {
                if (Arrays.asList(movie8.getDrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie8.getDrr()).indexOf(SeatDto.getResult());
                    movie8.setDrr(tmp, "NO");
                }
            }
            case "E" -> {
                if (Arrays.asList(movie8.getErr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie8.getErr()).indexOf(SeatDto.getResult());
                    movie8.setErr(tmp, "NO");
                }
            }
            default -> System.out.println("잘못된 입력입니다.8");
        }
    }
    private static void SeatEdit9(){
        switch (SeatDto.getColumn()) {
            case "A" -> {
                if (Arrays.asList(movie9.getArr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie9.getArr()).indexOf(SeatDto.getResult());
                    movie9.setArr(tmp, "NO");
                }
            }
            case "B" -> {
                if (Arrays.asList(movie9.getBrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie9.getBrr()).indexOf(SeatDto.getResult());
                    movie9.setBrr(tmp, "NO");
                }
            }
            case "C" -> {
                if (Arrays.asList(movie9.getCrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie9.getCrr()).indexOf(SeatDto.getResult());
                    movie9.setCrr(tmp, "NO");
                }
            }
            case "D" -> {
                if (Arrays.asList(movie9.getDrr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie9.getDrr()).indexOf(SeatDto.getResult());
                    movie9.setDrr(tmp, "NO");
                }
            }
            case "E" -> {
                if (Arrays.asList(movie9.getErr()).contains(SeatDto.getResult())) {
                    int tmp = Arrays.asList(movie9.getErr()).indexOf(SeatDto.getResult());
                    movie9.setErr(tmp, "NO");
                }
            }
            default -> System.out.println("잘못된 입력입니다.9");
        }
    }


}