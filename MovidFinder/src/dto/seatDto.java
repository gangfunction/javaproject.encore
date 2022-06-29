package dto;

public class seatDto {

    private static int seatPointer;

    public static int getSeatPointer() {
        return seatPointer;
    }

    public static void setSeatPointer(int seatPointer) {
        seatDto.seatPointer = seatPointer;
    }

    private static String Row="";
    static String Column="" ;
    static String Result="";

    static String CanSeat="";

    public static String getCanSeat() {
        return CanSeat;
    }
    public static void setCanSeat(String canSeat) {
        seatDto.CanSeat = canSeat;
    }


    //getter and setter


    public static String getRow() {
        return Row;
    }

    public static void setRow(String row) {
        seatDto.Row = row;
    }

    public static String getColumn() {
        return Column;
    }

    public static void setColumn(String column) {
        seatDto.Column = column;
    }
    public static String getResult(){
        return Result;
    }

    public static void setResult(String i, String j){
        seatDto.Result=i+j;
    }

}
