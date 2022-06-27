package utility;

import dao.reviewDelete;
import dao.reviewInsert;
import dao.reviewSelect;
import dao.reviewUpdate;
import service.Menu;

import java.sql.SQLException;
import java.util.Scanner;

public class menuPrint {
    private menuPrint() throws SQLException {
        //게시판 출력
        System.out.println("1. 게시판 출력 2. 게시판 입력 3. 게시판 수정 4. 게시판 삭제 5. 종료");
        Scanner sc = new Scanner(System.in);

        //입력받은 번호에 따라 처리
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("게시판 출력");
                new reviewSelect();
                new menuPrint();
                break;
            case 2:
                System.out.println("게시판 입력");
                new reviewInsert();
                new menuPrint();

                break;
            case 3:
                System.out.println("게시판 수정");
                new reviewUpdate();
                new menuPrint();
                break;
            case 4:
                System.out.println("게시판 삭제");
                new reviewDelete();
                new menuPrint();
                break;
            case 5:
                System.out.println("종료");
                //메뉴로 돌아가기
                Menu.menuSelect();

                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }
    }



}

