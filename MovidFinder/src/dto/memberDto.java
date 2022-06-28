package dto;

public class memberDto {
    public static String id;
    public static String pwd;
    private static boolean isin;
    private  static boolean admin;

    private static boolean doubleCheck = false;

    public static boolean getDoubleCheck() {
        return doubleCheck;
    }

    public static void setDoubleCheck(boolean doubleCheck) {
        memberDto.doubleCheck = doubleCheck;
    }

    memberDto(String id, String pwd, boolean isin, boolean admin) {
        memberDto.id =id;
        memberDto.pwd =pwd;
        memberDto.isin =isin;
        memberDto.admin =false;
    }


    //getter and setter
    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        memberDto.id = id;
    }

    public static String getPwd() {
        return pwd;
    }

    public static void setPwd(String pwd) {
        memberDto.pwd = pwd;
    }

    public static boolean getIsin() {
        return isin;
    }
    public static void setIsin(boolean isin) {
        memberDto.isin = isin;
    }

    public static boolean getAdmin() {
        return admin;
    }
    public static void setAdmin(boolean b) {
        memberDto.admin=b;
    }

    static int LoginCheck = 0;
    public static int getLoginCheck() {
        return LoginCheck;
    }
    public static void setLoginCheck(int LoginCheck) {
        memberDto.LoginCheck = LoginCheck;
    }
}
