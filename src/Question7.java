//문제 7: switch 문을 이용한 계절 판별기
//월(1~12)을 입력받고, 해당 월에 맞는 계절을 출력하는 프로그램을 작성

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-12): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("겨울");
                break;
            case 2:
                System.out.println("겨울");
                break;
            case 3:
                System.out.println("봄");
                break;
            case 4:
                System.out.println("봄");
                break;
            case 5:
                System.out.println("봄");
                break;
            case 6:
                System.out.println("여름");
                break;
            case 7:
                System.out.println("여름");
                break;
            case 8:
                System.out.println("여름");
                break;
            case 9:
                System.out.println("가을");
                break;
            case 10:
                System.out.println("가을");
                break;
            case 11:
                System.out.println("가을");
                break;
            case 12:
                System.out.println("겨울");
                break;
            default:
                System.out.println("잘못된 월 입니다. 1 ~ 12 사이를 입력해주세요.");
        }
    }
}