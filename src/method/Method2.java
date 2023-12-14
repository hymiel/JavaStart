package method;

public class Method2 {
    public static void main(String[] args) {
        //반환타입
        boolean result = odd(2);
        System.out.println(result);

    }
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
