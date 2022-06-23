package DTO;


import static DAO.AdminDao.*;

public class AdminDto {
    public static boolean adCheck(){
        AdminCheck(MemberDto.id, MemberDto.pwd);
        return false;
    }
}
