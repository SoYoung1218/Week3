//문제 3: if 문을 이용한 성적 판정
//사용자로부터 점수를 입력받고,
// 점수에 따라 A, B, C, D, F 등급을 출력하는 프로그램을 작성

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("A 학점");
        } else if (score >= 80) {
            System.out.println("B 학점");
        } else if (score >= 70) {
            System.out.println("C 학점");
        } else if (score >= 60) {
            System.out.println("D 학점");
        } else {
            System.out.println("F 학점");
        }
    }
}