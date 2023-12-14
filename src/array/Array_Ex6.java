package array;

import java.util.Scanner;

public class Array_Ex6 {
    public static void main(String[] args) {
        //가장 작은 수와 큰 수 찾기
        //사용자로부터 n개의 정수를 입력받아 배열에 저장한 후 배열 내에서
        //가장 작은수와 가장 큰 수를 찾아서 출력하는 프로그램

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int min, max;

        System.out.println(n + "개의 정수를 입력하세요.");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        min = numbers[0];
        max = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers [i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("가장 작은 수는 "+ min);
        System.out.println("가장 큰 수는 "+ max);
    }
}
