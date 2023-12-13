package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2*3 2차원 배열 리펙토링
        // 배열의 길이만큼 알아서 채우기

        int[][] arr = new int[3][4];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr[row].length; colum++) {
                arr[row][colum] = i++;
            }
        }


        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr[row].length; colum++) {
                System.out.print(arr[row][colum] + " ");
            }
            System.out.println();
        }

    }
}
