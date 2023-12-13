package scanner;

import java.util.Scanner;

public class Scanner_Ex7 {
    public static void main(String[] args) {
        //상품 가격 계산
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("상품의 가격을 입력하세요.(-1을 입력하면 종료)");
            int place = input.nextInt();

            if (place == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("구매하려는 수량을 입력하세요.");
            int quantity = input.nextInt();

            int sum = place * quantity;
            System.out.println("총 비용 : " + sum);
        }
    }
}
