package method;

public class Method3 {
    public static void main(String[] args) {
        //반환타입 예제
        checkAge(10);
        checkAge(20);


    }
    public static void checkAge(int age) {
        if (age< 18) {
            System.out.println("미성년자는 출입이 불가합니다.");
        } else {
            System.out.println("입장하세요");
        }
    }
}
