package loop;

public class Brack3 {
    public static void main(String[] args) {

        //for문으로 풀어보자
        //1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은?
        int sum = 0;

        for (int i = 1; ; i++) { // 조건식이 없으면 무한반복
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료 : i =" + i + ", sum =" + sum);
                break;
            }  i++;
        }
    }
}
