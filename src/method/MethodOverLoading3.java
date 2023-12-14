package method;

public class MethodOverLoading3 {
    public static void main(String[] args) {
        //매개변수의 타입이 다른 예제2
        System.out.println("1. " + add(1,2));
        System.out.println("2. " + add(1.2, 1.5));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    } // 이 메서드가 사라져도 int는 double로 자동 형변환이 되기 때문에 1.0 2.0으로 바뀌어서 들어가짐
    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
