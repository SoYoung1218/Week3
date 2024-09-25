//문제 4: switch 문을 사용한 계산기
//두 개의 숫자와 연산자(+, -, *, /)를 입력받아
//해당 연산을 수행하고 결과를 출력하는 프로그램을 작성

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " 는 윤년입니다.");
        } else {
            System.out.println(year + " 는 윤년이 아닙니다.");
        }
    }
}

