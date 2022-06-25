package DTO;

public class SeatDto {




    static int cnt1=1;
    static int cnt2=1;
    static int cnt3=1;
    static int cnt4=1;
    static int cnt5=1;
    static int cnt6=1;
    static int cnt7=1;
    static int cnt8=1;
    static int cnt9=1;
    //getter and setter
    public static int getCnt1() {
        return cnt1;
    }
    public static void setCnt1(int cnt1) {
        SeatDto.cnt1 = cnt1;
    }
    public static int getCnt2() {
        return cnt2;
    }
    public static void setCnt2(int cnt2) {
        SeatDto.cnt2 = cnt2;
    }
    public static int getCnt3() {
        return cnt3;
    }
    public static void setCnt3(int cnt3) {
        SeatDto.cnt3 = cnt3;
    }
    public static int getCnt4() {
        return cnt4;
    }
    public static void setCnt4(int cnt4) {
        SeatDto.cnt4 = cnt4;
    }
    public static int getCnt5() {
        return cnt5;
    }
    public static void setCnt5(int cnt5) {
        SeatDto.cnt5 = cnt5;
    }
    public static int getCnt6() {
        return cnt6;
    }
    public static void setCnt6(int cnt6) {
        SeatDto.cnt6 = cnt6;
    }
    public static int getCnt7() {
        return cnt7;
    }
    public static void setCnt7(int cnt7) {
        SeatDto.cnt7 = cnt7;
    }
    public static int getCnt8() {
        return cnt8;
    }
    public static void setCnt8(int cnt8) {
        SeatDto.cnt8 = cnt8;
    }
    public static int getCnt9() {
        return cnt9;
    }
    public static void setCnt9(int cnt9) {
        SeatDto.cnt9 = cnt9;
    }


    static String Row="" ;
    static String Column="" ;

    static String Result="";



    //getter and setter

    public static String getRow() {
        return Row;
    }

    public static void setRow(String row) {
        SeatDto.Row = row;
    }

    public static String getColumn() {
        return Column;
    }

    public static void setColumn(String column) {
        SeatDto.Column = column;
    }
    public static String getResult(){
        return Result;
    }

    public static void combi(String i, String j){
        SeatDto.Result=i+j;
    }


}
