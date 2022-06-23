//package Service;
//
//import java.util.Scanner;
//
//public class Split {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int[][] seat=new int[3][4];
//        String str="b1";
//        String str1=str.substring(0,1);
//        String str2=str.substring(1,2);
//        System.out.println(str1+","+str2);
//
//
//        boolean flag=true;
//        while(flag) {
//            int row;
//            System.out.println("좌석번호 선택 ex)c4");
//            String num=sc.next();
//            String num1=num.substring(0,1); //영문
//            int num2=Integer.parseInt(num.substring(1,2)); //숫자
//
//            if(num1.equals("a") && (num2 < 4)){
//                row=0;
//                if (seat[row][num2] == 1) {
//                    System.out.println("이미 배정된 좌석");
//                } else if (seat[row][num2] == 0) {
//                    seat[row][num2] = 1;
//                }
//            } else if(num1.equals("b") && (num2 < 4)) {
//                row=1;
//                if (seat[row][num2] == 1) {
//                    System.out.println("이미 배정된 좌석");
//                } else if (seat[row][num2] == 0) {
//                    seat[row][num2] = 1;
//                }
//            }else if(num1.equals("c") && (num2 < 4)){
//                row=2;
//                if (seat[row][num2] == 1) {
//                    System.out.println("이미 배정된 좌석");
//                } else if (seat[row][num2] == 0) {
//                    seat[row][num2] = 1;
//                }
//            }else{
//                System.out.println("배정할수없는 좌석");
//                break;
//            }
//
//            for (int i = 0; i < seat.length; i++) {
//                for (int j=0; j <seat[i].length;j++){
//                    System.out.print(seat[i][j] + " ");
//                }
//                System.out.println();
//            }
//
//        }//while문 끝

//
//
//    }
//}
