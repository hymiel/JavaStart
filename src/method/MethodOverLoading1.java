package method;

public class MethodOverLoading1 {
    public static void main(String[] args) {
        //메서드의 오버로딩
        //메서드의 이름은 같지만 매개변수의 타입이나 순서가 달라야한다
        //반환타입이 다른 것은 오버로딩으로 인정되지 않는다.

        //메서드 시그니처
        //메서드 시그니처 : 메서드 이름과 매개변수의 타입과 순서로
        //자바에서 메서드르르 구분할 수 있느느 고유한 식별자나 서명


        //매개변수의 순서가 다른 예제
        System.out.println("1 : " + add(1,2));
        System.out.println("2 : " + add(1,2,3));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a+b;
    }
    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a+b+c;
    }
}
