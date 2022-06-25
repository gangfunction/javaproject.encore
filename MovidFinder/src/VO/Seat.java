package VO;

import DTO.MovieDto;
import DTO.ResDto;

import static VO.Seats.*;

//todo: 영화별로 다른 인스턴스를 생성해서 시트를 할당한다.
public class Seat {
    private static final String[] Arr = {"A1", "A2", "A3", "A4", "A5", "A6"};
    private static final String[] Brr = {"B1", "B2", "B3", "B4", "B5", "B6"};
    private static final String[] Crr = {"C1", "C2", "C3", "C4", "C5", "C6"};
    private static final String[] Drr = {"D1", "D2", "D3", "D4", "D5", "D6"};
    private static final String[] Err = {"E1", "E2", "E3", "E4", "E5", "E6"};


    public String[] getArr() {
        return Arr;
    }

    public void setArr(int i, String j) {
        Seat.Arr[i] = j;
    }

    public String[] getBrr() {
        return Brr;
    }

    public void setBrr(int i, String j) {
        Seat.Brr[i] = j;
    }

    public String[] getCrr() {
        return Crr;
    }

    public void setCrr(int i, String j) {
        Seat.Crr[i] = j;
    }

    public String[] getDrr() {
        return Drr;
    }

    public void setDrr(int i, String j) {
        Seat.Drr[i] = j;

    }

    public String[] getErr() {
        return Err;
    }

    public void setErr(int i, String j) {
        Seat.Err[i] = j;
    }

    public static void seatShowing(){
        System.out.println(ResDto.getMovie_name() + "해당 영화의 좌석 정보입니다.");
        switch(MovieDto.getNum()){
            case 1:
                System.out.println();
                for(int i = 0; i < Arr.length; i++){
                    System.out.print(getMovie1().getArr()[i]+" "+getMovie1().getBrr()[i]+" "+getMovie1().getCrr()[i]+" "+getMovie1().getDrr()[i]+" "+getMovie1().getErr()[i]+"\n");
                }
                break;
            case 2:
                for(int i = 0; i < Arr.length; i++){
                    System.out.print(getMovie2().getArr()[i]+" "+getMovie2().getBrr()[i]+" "+getMovie2().getCrr()[i]+" "+getMovie2().getDrr()[i]+" "+getMovie2().getErr()[i]+"\n");
                }
                break;
            case 3:
                for(int i = 0; i < Arr.length; i++){
                    System.out.print(getMovie3().getArr()[i]+" "+getMovie3().getBrr()[i]+" "+getMovie3().getCrr()[i]+" "+getMovie3().getDrr()[i]+" "+getMovie3().getErr()[i]+"\n");
                }
                break;
            case 4:
                for(int i = 0; i < Arr.length; i++){
                    System.out.print(getMovie4().getArr()[i]+" "+getMovie4().getBrr()[i]+" "+getMovie4().getCrr()[i]+" "+getMovie4().getDrr()[i]+" "+getMovie4().getErr()[i]+"\n");
                }
                break;
            case 5:
                for(int i = 0; i < Arr.length; i++){
                    System.out.print(getMovie5().getArr()[i]+" "+getMovie5().getBrr()[i]+" "+getMovie5().getCrr()[i]+" "+getMovie5().getDrr()[i]+" "+getMovie5().getErr()[i]+"\n");
                }
                break;
            case 6:
                for(int i = 0; i < Arr.length; i++){
                    System.out.print(getMovie6().getArr()[i]+" "+getMovie6().getBrr()[i]+" "+getMovie6().getCrr()[i]+" "+getMovie6().getDrr()[i]+" "+getMovie6().getErr()[i]+"\n");
                }
                break;
            case 7:
                for(int i = 0; i < Arr.length; i++){
                    System.out.print(getMovie7().getArr()[i]+" "+getMovie7().getBrr()[i]+" "+getMovie7().getCrr()[i]+" "+getMovie7().getDrr()[i]+" "+getMovie7().getErr()[i]+"\n");
                }
                break;
            case 8:
                for(int i = 0; i < Arr.length; i++){
                    System.out.print(getMovie8().getArr()[i]+" "+getMovie8().getBrr()[i]+" "+getMovie8().getCrr()[i]+" "+getMovie8().getDrr()[i]+" "+getMovie8().getErr()[i]+"\n");
                }
                break;
            case 9:
                for(int i = 0; i < Arr.length; i++){
                    System.out.print(getMovie9().getArr()[i]+" "+getMovie9().getBrr()[i]+" "+getMovie9().getCrr()[i]+" "+getMovie9().getDrr()[i]+" "+getMovie9().getErr()[i]+"\n");
                }
                break;

        }


    }


}
