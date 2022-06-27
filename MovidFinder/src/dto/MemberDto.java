package dto;

public class MemberDto {
    public static String id;
    public static String pwd;
    private static boolean isin;

    MemberDto(String id, String pwd, boolean isin){
        MemberDto.id =id;
        MemberDto.pwd =pwd;
        MemberDto.isin =isin;
    }


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

    public static void setAdmin(boolean b) {
    }
}
