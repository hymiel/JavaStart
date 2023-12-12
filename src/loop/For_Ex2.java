package loop;

public class For_Ex2 {
    public static void main(String[] args) {
        //짝수 출력
        //처음 10개의 짝수를 출력하는 프로그램을 만들어라
        //변수는 num
        //for 버전 - 여러 변수를 한번에 선언도 됨
//      for (int num = 2, count = 1; count <= 10; num += 2, count++) {
//          System.out.println(num);
//      }

        int num = 2;
        for (int count = 1; count <= 10; count ++) {
            System.out.println(num);
            num += 2;
        }
    }
}
