package operator;

public class OpAdd2 {
    public static void main(String[] args) {
        //전위 후위 증감연산자
   //++a; - 전위 증감 연산자 : 먼저 증가
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증가시키고 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

//        a++; - 후위 증감 연산자 : 나중에 증가
        a = 1; //a값을 다시 1로 지정
        b = 0; //b값을 다시 0으로 지정

        b = a++; //a의 현재값을 b에 먼저 대입하고 그 후 a값을 증가시킴
        System.out.println("a = " + a + ", b = " + b);



    }
}
