package loop;

public class For_for_Ex1 {
    public static void main(String[] args) {
        //구구단 출력
        for (int i = 1; i <= 9 ; i++) {
            for (int j =1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }
}
