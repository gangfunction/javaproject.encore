import dto.Dto;
import service.Menu;
import service.initialProcess;

import java.sql.SQLException;

public class Main{
    public static void main(String[] args) throws SQLException {
        // 어서오세요 메세지 출력
        Dto.dbCon();
        Dto.getConn();
        new initialProcess();

        System.out.println("어서오세요");
        //메뉴선택
        Menu.menuSelect();
    }

}


