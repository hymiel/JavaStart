package casting;

public class Casting2 {
    public static void main(String[] args) {
        //명시적 형변환 : 큰 범위에서 작은 범위로 대입
        double doubleValue = 1.5; //이 안의 값이 변경되진 않음
        int intValue = 0;

//        intValue = doubleValue; // 컴파일 오류 (자동으로 변환되지 않음)
        intValue = (int) doubleValue; // 명시적 형변환 (강제적 변환)
        System.out.println("intValue = " + intValue); // 출력값 1;
        System.out.println((int) 10.5);
    }
}
