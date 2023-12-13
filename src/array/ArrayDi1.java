package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        // 2*3 2차원 배열 리펙토링
        int[][] arr = new int[2][3]; // 행 2 열 3

        arr[0][0] = 1; // 0행 0열
        arr[0][1] = 2; // 0행 1열
        arr[0][2] = 3; // 0행 2열
        arr[1][0] = 4; // 1행 0열
        arr[1][1] = 5; // 1행 1열
        arr[1][2] = 6; // 1행 2열


        for (int row = 0; row < 2; row++) {
            System.out.println(arr[row][0] + " "); // 0열출력
            System.out.println(arr[row][1] + " "); // 1열출력
            System.out.println(arr[row][2] + " "); // 2열출력
            System.out.println();
        }

    }
}
