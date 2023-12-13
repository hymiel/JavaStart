package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        // 2*3 2차원 배열 리펙토링
        //초기화와 배열의 길이 관련

        int[][] arr = {
                {1, 2, 3},
            {4, 5, 6}
        };


        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr[row].length; colum++) {
                System.out.println(arr[row][colum] + " ");
            }
            System.out.println();
        }

    }
}
