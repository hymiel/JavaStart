package scanner;

import java.util.Scanner;

public class Scanner_Ex6 {
    public static void main(String[] args) {
        //이름과 나이 반복(종료 입력 시 프로그램 종료)
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("이름을 입력하세요. (종료를 입력하면 종료)");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("나이를 입력하세요.");
            int age = input.nextInt();
            input.nextLine();

            System.out.println("입력한 이름 : " + name + ", 나이 : " + age);

        }
    }
}
