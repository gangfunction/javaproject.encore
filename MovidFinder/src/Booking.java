import java.sql.SQLException;

public class Booking {
    static void booking() throws SQLException {
        System.out.println("영화를 선택하세요");
        Movie.showMovie();
    }

    static void showBooking() throws SQLException {
        System.out.println("예매내역");
        Seats.seatSelectColumn();
    }


}
