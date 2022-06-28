package vo;

public class seattheater1  {
    public seattheater1() {
        System.out.println("1번 영화 정보입니다.");
        for (int i = 0; i < 6; i++) {
            System.out.print(movie1.getArr()[i] + " " + movie1.getBrr()[i] + " " + movie1.getCrr()[i] + " " + movie1.getDrr()[i] + " " + movie1.getErr()[i] + "\n");
        }
    }
}
