//문제 1: if 문을 이용한 짝수/홀수 판별 프로그램
//사용자로부터 정수를 입력받고
// 그 숫자가 짝수인지 홀수인지 판별하는 프로그램을 작성

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " 짝수 입니다.");
        } else {
            System.out.println(number + " 홀수 입니다.");
        }
    }
}