package array;

import java.util.Scanner;

public class ArrayDi_Ex1 {
    public static void main(String[] args) {
        // 2차원 배열
        //사용자로부터 4명의 학생의 국영수 점수를 입력받아 각 학생의 총점과 평균을 계산

        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"국어","영어","수학"};

        for (int i = 0; i < 4; i++) { //행
            System.out.println((i+1) +"번 학생의 성적을 입력하세요.");
            for (int j = 0; j < 3; j++) { //열
                System.out.println(subjects[j] + "점수 : ");
                scores[i][j] = scanner.nextInt();
            }
        }
        for (int i = 1; i < 4; i ++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total+=scores[i][j];
            }
            double average = total / 3.0;
            System.out.println((i+1) + "번 학생의 총점 : " + total + ", 평균 : " + average);
        }
    }
}
