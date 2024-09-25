//문제 5: if 문을 이용한 나이 계산 프로그램
//사용자로부터 나이를 입력받아, 18세 이상이면 "성인입니다"를 출력
// 그렇지 않으면 "미성년자입니다"를 출력하는 프로그램을 작성

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int score = age.nextInt();

        if (score >= 18) {
            System.out.println("성인입니다");
        } else {
            System.out.println("미성년자입니다");
        }
    }
}