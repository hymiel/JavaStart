package array;

public class Array_Ex1 {
    public static void main(String[] args) {
        //배열을 사용하도록 변경해보자

        //문제
//        int student1 = 90;
//        int student2 = 80;
//        int student3 = 70;
//        int student4 = 60;
//        int student5 = 50;
//
//        int total = student1 + student2 + student3 + student4 + student5;
//        double average = (double) total /5;
//
//        System.out.println("점수 총합 : " + total); //점수 총합 : 350
//        System.out.println("점수 평균 : " + average); //점수 평균 : 70.0

        //배열 사용 시
        int students[] = {90, 80, 70, 60, 50};

        int total = 0;

//        일반for문
//        for (int i = 0; i < students.length; i++) {
//            total+=students[i];
//        }

        //향상된 for문
        for (int student : students) {
            total += student;
        }

        double average = (double) total /5;
        System.out.println("점수 총합 : " + total); //점수 총합 : 350
        System.out.println("점수 평균 : " + average); //점수 평균 : 70.0
    }
}
