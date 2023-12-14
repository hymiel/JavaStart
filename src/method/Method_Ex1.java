package method;

public class Method_Ex1 {
    public static void main(String[] args) {

        //아래 문제를 리펙토링해보기
//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//        int sum = a + b + c;
//        double average = sum / 3.0;
//        System.out.println("평균값 : " + average); // 2.0
//
//        int x = 15;
//        int y = 25;
//        int z = 35;
//
//        sum = x + y + z;
//        average = sum / 3.0;
//        System.out.println("평균값 : " + average); // 25.0


        System.out.println("평균값 : " + average(1,2,3)); // 2.0
        System.out.println("평균값 : " + average(15,25,35)); // 25.0
    }

    public static double average (int a, int b, int c) {
        int sum = a + b + c;
        return sum/3.0;
    }
}
