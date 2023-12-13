package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        //학생의 점수를 출력하는 프로그램
        //배열 리펙토링 : 중복 제거, 복잡성 줄이고, 이해하기 쉬운 코드로 변경하는 것
        // -> 코드의 설계를 바꿈

        int[] student; // 배열 변수 선언
        student = new int[5]; //배열 생성

        //변수값 대입
        student[0] = 90;
        student[1] = 80;
        student[2] = 70;
        student[3] = 60;
        student[4] = 50;

        //변수값 사용
        for (int i = 0; i < student.length; i++) {
            System.out.println("학생 " + (i+1) + ": 점수" + student[i]);
        }

//        System.out.println("학생 1 점수: " + student[0]);
//        System.out.println("학생 2 점수: " + student[1]);
//        System.out.println("학생 3 점수: " + student[2]);
//        System.out.println("학생 4 점수: " + student[3]);
//        System.out.println("학생 5 점수: " + student[4]);
    }
}
