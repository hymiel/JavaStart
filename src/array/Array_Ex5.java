package array;

import java.util.Scanner;

public class Array_Ex5 {
    public static void main(String[] args) {
        //배열을 이용한 합계와 평균
        //사용자에게 입력받을 숫자의 개수를 입력받도록 개선

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int sum = 0;

        System.out.println(count + "개의 정수를 입력하세요.");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
            sum+=numbers[i];
        }

        double average = (double) sum /count;
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);
    }
}
