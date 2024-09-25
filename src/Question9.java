//문제 9: if 문을 이용한 고급 계산기
//사용자가 입력한 연산자와 두 개의 숫자에 따라
// 사칙연산(+, -, *, /)을수행하는 프로그램을 작성

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 입력: ");
        int a = sc.nextInt();

        System.out.print("두 번째 숫자 입력: ");
        int b = sc.nextInt();

        System.out.print("연산자를 입력하시오 : ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (op == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (op == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            } else {
                System.out.println(a + " / " + b + " = " + (a / b));
            }
        } else {
            System.out.println("잘못 입력하셨습니다");
        }

        sc.close();
    }
}
