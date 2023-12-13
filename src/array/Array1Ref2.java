package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        //배열의 초기화

        int[] student; // 배열 변수 선언
        student = new int[]{90,80,70,60,50}; //배열 생성과 초기화(변수생성 불필요)


        //변수값 사용
        for (int i = 0; i < student.length; i++) {
            System.out.println("학생 " + (i+1) + ": 점수" + student[i]);
        }

    }
}
