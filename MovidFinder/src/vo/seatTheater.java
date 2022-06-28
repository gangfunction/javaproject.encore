package vo;

public class seatTheater {
    public seatTheater() {
        System.out.println("영화 좌석 정보입니다.");
        for (int i = 0; i < 6; i++) {
            System.out.print(movie.getArr()[i] + " " + movie.getBrr()[i] + " " + movie.getCrr()[i] + " " + movie.getDrr()[i] + " " + movie.getErr()[i] + "\n");
        }
    }
}
