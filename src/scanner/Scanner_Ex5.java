package scanner;

import java.util.Scanner;

public class Scanner_Ex5 {
    public static void main(String[] args) {
       //사이의 숫자 : 사용자로부터 두개의 정수를 입력받고,
        //입력받은 두 정수 사이의 모든 정수를 출력하는 프로그램

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요.");
        int num1 = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요.");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;

        }

        System.out.println("두 숫자 사이의 모든 정수를 출력합니다.");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) {
                System.out.print(",");
            }
        }

    }
}
