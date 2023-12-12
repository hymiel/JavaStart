package casting;

public class Casting1 {
    public static void main(String[] args) {
        //자동형변환 : 작은 범위에서 큰 범위에서는 표현이 가능
        //int -> long -> double
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);
        
        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);

        //형변환이 되는 동작 과정
//        doubleValue = intValue;
//        doubleValue = (double) intValue;
//        doubleValue = (double) 10;
//        doubleValue = 10.0;
    }
}
