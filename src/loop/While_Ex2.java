package loop;

public class While_Ex2 {
    public static void main(String[] args) {
        //짝수 출력
        //처음 10개의 짝수를 출력하는 프로그램을 만들어라
        //변수는 num
        //while 버전

        int num = 2;
        int count = 1;
        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count ++;

        }
    }
}
