package loop;

public class While_Ex3 {
    public static void main(String[] args) {
        //누적 합 계산
        //반복문을 사용하여 1부터 max까지의 합을 계산하고 출력하는 프로그램을 작성
        //sum 변수 사용
        //while 버전

        int max = 100;

        int sum = 0;
        int i = 1;
        while (i <= max) {
            sum += i;
            i++;
        }
            System.out.println(sum);

    }
}
