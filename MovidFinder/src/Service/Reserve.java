package Service;

import DAO.ReserveDao;

import java.sql.SQLException;
import java.util.Scanner;

public class Reserve {

    static void seatSelectProcess() throws SQLException {
        System.out.println("열을 선택하세요");
        System.out.println("1. A열 2. B열 3. C열 4. D열 5. E열");
        Scanner sc = new Scanner(System.in);
        int columnSelect = sc.nextInt();
        switch (columnSelect) {
            case 1 -> seatSelectRow("A");
            case 2 -> seatSelectRow("B");
            case 3 -> seatSelectRow("C");
            case 4 -> seatSelectRow("D");
            case 5 -> seatSelectRow("E");
        }
        //예매내용 확인 메소드

    }

    private static void seatSelectRow(String i) throws SQLException {
        System.out.println("순서를 선택하세요");
        System.out.println("1. 첫번째 2. 두번째 3. 셋번째 4. 네번째 5. 다섯번째 6.여섯번째");
        //switch 문으로 순서를 선택할수 있는 메소드를 만들어야한다.
        Scanner sc = new Scanner(System.in);
        String rowSelect = sc.next();
        switch (rowSelect) {
            case "1" -> seatSelect(i, "1");
            case "2" -> seatSelect(i, "2");
            case "3" -> seatSelect(i, "3");
            case "4" -> seatSelect(i, "4");
            case "5" -> seatSelect(i, "5");
            case "6" -> seatSelect(i, "6");
        }
    }

    private static void seatSelect(String i, String i1) throws SQLException {
        //선택환 좌석을 출력하는 메소드
        System.out.println("선택한 좌석은 " + i + i1 + "입니다.");
        //선택한 좌석을 예매할 것인지 아니면 다른 좌석을 선택할 것인지 선택할수 있는 메소드
        System.out.println("예매하시겠습니까?(y/n)");
        Scanner sc = new Scanner(System.in);
        String select = sc.next();
        if (select.equals("y")) {
            //예매하는 메소드
            ReserveDao.seatReserve(i, i1);
        } else if (select.equals("n")) {
            //다른 좌석을 선택하는 메소드
            seatSelectRow(i);
        }
    }


}
