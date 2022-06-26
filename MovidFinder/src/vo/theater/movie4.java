package vo.theater;

public class movie4 {
    private static final String[] Arr = {"A1", "A2", "A3", "A4", "A5", "A6"};
    private static final String[] Brr = {"B1", "B2", "B3", "B4", "B5", "B6"};
    private static final String[] Crr = {"C1", "C2", "C3", "C4", "C5", "C6"};
    private static final String[] Drr = {"D1", "D2", "D3", "D4", "D5", "D6"};
    private static final String[] Err = {"E1", "E2", "E3", "E4", "E5", "E6"};


    public static String[] getArr() {
        return Arr;
    }

    public static void setArr(int i, String j) {
        movie4.getArr()[i] = j;
    }

    public static String[] getBrr() {
        return Brr;
    }

    public static void setBrr(int i, String j) {
        movie4.getBrr()[i] = j;
    }

    public static String[] getCrr() {
        return Crr;
    }

    public static void setCrr(int i, String j) {
        movie4.getCrr()[i] = j;
    }

    public static String[] getDrr() {
        return Drr;
    }

    public static void setDrr(int i, String j) {
        movie4.getDrr()[i] = j;

    }

    public static String[] getErr() {
        return Err;
    }

    public static void setErr(int i, String j) {
        movie4.getErr()[i] = j;
    }

}
