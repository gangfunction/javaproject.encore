import dao.movie.initialProcess;
import service.serviceMenu;

import java.sql.SQLException;

public class Main{
    public static void main(String[] args) throws SQLException {
        // 어서오세요 메세지 출력
        dto.dto.getConn();
        new initialProcess();

        System.out.println("어서오세요");
        //메뉴선택
        new serviceMenu();
    }

}


