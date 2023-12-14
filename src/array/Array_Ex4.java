package array;

import java.util.Scanner;

public class Array_Ex4 {
    public static void main(String[] args) {
        //배열을 이용한 합계와 평균
        //사용자에게 5개의 정수를 입력받고 이들 정수의 합계와 평균을 계산해보자

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요.");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum+=numbers[i];
        }

        double average = (double) sum /5;
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);
    }
}
