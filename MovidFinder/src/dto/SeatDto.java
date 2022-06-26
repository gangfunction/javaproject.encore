package dto;

public class SeatDto {

    private static String Row="";
    static String Column="" ;
    static String Result="";

    static String CanSeat="";

    public static String getCanSeat() {
        return CanSeat;
    }
    public static void setCanSeat(String canSeat) {
        SeatDto.CanSeat = canSeat;
    }

    static int seatPointer = 0;


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

    public static int getSeatPointer() {
        return seatPointer;
    }

    public static void setSeatPointer(int num) {
        SeatDto.seatPointer = num;
    }

}
