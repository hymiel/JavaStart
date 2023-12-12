package scanner;

import java.util.Scanner;

public class Scanner_Ex1 {
    public static void main(String[] args) {
        //사용자 이름 나이를 입력받고 출력하기
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력하세요.");
        String name = scanner.nextLine();

        System.out.println("나이를 입력하세요.");
        int age = scanner.nextInt();

        System.out.println("당신의 이름은 " + name + ", 나이는 " + age + "입니다.");
    }
}
