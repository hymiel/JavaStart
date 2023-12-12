package operator;

public class Op3 {
    public static void main(String[] args) {
        //연산자의 우선순위1
        int sum1 = 1 + 2 * 3; // 1 + (2 * 3) = 7
        int sum2 = (1 + 2) * 3; // (1+ 2) * 3 = 9;
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);


        //연산자의 우선순위2
        int sum3 = 2 * 2 + 3 * 3; //(2 * 2) + (3 * 3) = 13
        int sum4 = (2 * 2) + (3 * 3); //sum3과 같다
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        //연산자 우선순위 암기
//        1.괄호()
//        2.단항연산자 (++, --, !, ~, new, (type))
//        3.산술연산자(*, /, %, 우선, 그 다음에 +,-)
//        4.shift연산자(<<, >>, >>>)
//        5.비교연산자 (<, <=, >, >=, instanceof)
//        6.동식연산자(==, !=)
//        7.비트연산자(&, ^, |)
//        8.논리연산자(&&, ||)
//        9.삼항연산자(?:)
//        10.대입연산자(=, +=, -=, *=, /=, %=)
    }
}
