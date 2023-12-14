package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        //메서드와 형변환
        double number = 1.5;
//        printNumber(number); //double 은 int 에 대입이 안되서 컴파일 오류
        printNumber((int)number); //int-double 형변환
        }
    public static void printNumber(int n) {
        System.out.println("숫자 : " + n);
    }

}

