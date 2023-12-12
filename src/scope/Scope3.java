package scope;

public class Scope3 {
    public static void main(String[] args) {
        //스코프의 존재이유
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
