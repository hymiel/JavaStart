package scanner;

import java.util.Scanner;

public class Scanner_Ex3 {
    public static void main(String[] args) {
        // 음식점 주문
        // 사용자로부터 음식의 이름(foodName), 가격(foodPrice), 수량(foodQuantity)을 입력받아,
        // 주문한 음식의 총 가격을 계산하고 출력하는 프로그램을 작성하세요.
        // 음식의 총 가격은 음식의 가격(foodPrice)과 수량(foodQuantity)을 곱한 값으로 totalPrice라는 변수에 저장할 것
        // 주문 정보와 총 가격을 출력하고 출력 형태는 [음식이름], [수량] 개를 주문하셨습니다. 총 가격은 [총 가격] 입니다. 로 출력할 것

        Scanner input = new Scanner(System.in);

        System.out.println("음식 이름을 입력해주세요.");
        String foodName = input.nextLine();

        System.out.println("음식 가격을 입력해주세요.");
        int foodPrice = input.nextInt();

        System.out.println("음식 수량을 입력해주세요.");
        int foodQuantity = input.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println(foodName + ", " + foodQuantity + "개를 주문하셨습니다. 총 가격은" + totalPrice + " 입니다." );
    }
}
