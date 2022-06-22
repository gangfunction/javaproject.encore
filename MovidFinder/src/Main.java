import java.lang.reflect.Member;
import java.sql.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws SQLException {
        // 어서오세요 메세지 출력
        System.out.println("어서오세요");

        //jdbc를 연결한다.
        dbCon.Con();
        //메뉴선택
        Menu.menuSelect();
    }

}


