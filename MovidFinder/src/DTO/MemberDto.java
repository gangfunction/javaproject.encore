package DTO;

public class MemberDto {
    public static String id;
    static String pwd;
    private static boolean isin;
    private static boolean admin;

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
        MemberDto.pwd = pwd;
    }

    public static boolean getIsin() {
        return isin;
    }
    public static void setIsin(boolean isin) {
        MemberDto.isin = isin;
    }

    public static void myPage() {
    }

    public boolean getAdmin() {
        return admin;
    }

    public static void setAdmin(boolean b) {
        MemberDto.admin = b;
    }
}
