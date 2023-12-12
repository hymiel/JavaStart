package condition;

public class Co_Ex6 {
    public static void main(String[] args) {
        //더 큰 숫자 찾기 - 삼항연산자 사용
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;
        System.out.println("더 큰 숫자는" + max + "입니다.");
    }
}
