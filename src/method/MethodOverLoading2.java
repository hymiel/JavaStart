package method;

public class MethodOverLoading2 {
    public static void main(String[] args) {
        //메서드의 오버로딩
        //메서드의 이름은 같지만 매개변수의 타입이나 순서가 달라야한다
        //반환타입이 다른 것은 오버로딩으로 인정되지 않는다.

        //메서드 시그니처
        //메서드 시그니처 : 메서드 이름과 매개변수의 타입과 순서로
        //자바에서 메서드르르 구분할 수 있느느 고유한 식별자나 서명


        //매개변수의 타입이 다른 예제1
        myMethod(1,1.2);
        myMethod(1.2,1);
    }

    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }
    public static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }
}
