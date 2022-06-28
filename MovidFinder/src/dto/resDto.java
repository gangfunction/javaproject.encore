package dto;

public class resDto {
    private static String id;

    private static String time="Not yet";

    public static String getTime() {
        return time;
    }

    public static void setTime(String time) {
        resDto.time = time;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        resDto.id = id;
    }

    private static int callcnt=0;

    public static int getCallcnt() {
        return callcnt;
    }
    public static void setCallcnt(int callcnt) {
        resDto.callcnt = callcnt;
    }

}
