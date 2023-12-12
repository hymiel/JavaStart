package casting;

public class Casting4 {
    public static void main(String[] args) {
        //계산과 형변환
        int div1 = 3 / 2; // 원래 답은 1.5
        System.out.println("div1 = " + div1); // 1

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2); // 1.0
        
        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); // 1.5
        
        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4); // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); // 1.5

//        자바에서의 계산
//        1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
//        int + int = int / double + double = double
//        2. 서로 다른 타입의 경우 큰 범위로 자동 형변환이 된다.
//        int + long => long + long
//        int + double => double + double
    }
}
