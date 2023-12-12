package operator;

public class Op1{
    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b =2;

        //덧셈
        int sum = a + b;
        System.out.println("sum = " + sum); // 출력 a+b=7

        //뺄셈
        int diff = a - b;
        System.out.println("diff = " + diff); // 출력 a-b=3

        //곱셈
        int multi = a * b;
        System.out.println("multi = " + multi); // 출력 a*b=10

        //나눗셈
        int div = a / b;
        System.out.println("div = " + div); // 출력 a/b=2 =>int 형이기때문에 소수점 표현이 안됨

        //나머지
        int mod = a % b;
        System.out.println("mod = " + mod); // 출력 a%b = 1
    }
}
