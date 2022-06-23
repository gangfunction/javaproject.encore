package DTO;

public class MemberDto {
    public static String id;
    static String pwd;
    private static boolean isin;
    private boolean admin;

    //getter and setter
    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        MemberDto.id = id;
    }

    public static String getPwd() {
        return pwd;
    }

    public static void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public static boolean getIsin() {
        return isin;
    }
    public static void setIsin(boolean isin) {
        MemberDto.isin = true;
    }

    public static void myPage() {
    }

    public boolean isAdmin() {
        return admin;
    }

    public static void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
