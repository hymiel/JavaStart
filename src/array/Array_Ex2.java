package array;

import java.util.Scanner;

public class Array_Ex2 {
    public static void main(String[] args) {
        //배열의 입력과 출력
        //사용자에게 5개의 정수를 입력받아서 배열에 저장하고 입력 순서대로 출력할 것
        // 출력 포멧은 쉼표를 사용해서 구분하고 마지막에는 쉼표를 넣지 말것

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];


        System.out.println("5개의 정수를 입력하세요.");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length -1) {
                System.out.print(", ");
            }
        }

    }
}
