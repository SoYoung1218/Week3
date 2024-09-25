//문제 8: if 문을 사용한 BMI 계산기
//사용자로부터 키(cm)와 몸무게(kg)를 입력받아 BMI를 계산
//BMI에 따라 건강 상태를 출력하는 프로그램을 작성

import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("키를 입력하세요.");
        int m = sc.nextInt();
        System.out.println("몸무게를 입력하세요.");
        int kg = sc.nextInt();
        int bmi = (kg / (m * m));

        if(bmi < 18.5){
            System.out.println("저체중");
        }
        else if(bmi <= 24.9){
            System.out.println("정상");
        }
        else if(bmi <= 29.9){
            System.out.println("과체중");
        }
        else    if(bmi > 30){
            System.out.println("비만");
        }
    }
}

