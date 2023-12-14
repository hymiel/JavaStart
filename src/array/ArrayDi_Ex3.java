package array;

import java.util.Scanner;

public class ArrayDi_Ex3 {
    public static void main(String[] args) {
        //상품 관리 프로그램


        int maxProduct = 10;

        String[] produntNames = new String[maxProduct];
        int[] productPrices = new int[maxProduct];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("1.상품 등록 | 2.상품 목록 | 3. 종료\n메뉴를 선택하세요 : ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1 :

                    if (productCount >= maxProduct) {
                        System.out.println("더이상 상품을 등록할 수 없습니다.");
                        continue;
                    }

                    System.out.println("상품 이름을 입력하세요.");
                    produntNames[productCount] = scanner.nextLine();

                    System.out.println("상품 가격을 입력하세요.");
                    productPrices[productCount] = scanner.nextInt();

                    productCount++;

                case 2 :
                    if (productCount == 0) {
                        System.out.println("등록된 상품이 없습니다.");
                        continue;
                    }

                    System.out.println("상품 목록을 조회합니다.");
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(produntNames[i] + " : " + productPrices[i] + "원");
                    }

                case 3 :
                    System.out.println("프로그램을 종료합니다.");
                    break;

            }

        }
    }
}
