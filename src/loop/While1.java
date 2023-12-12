package loop;

public class While1 {
    public static void main(String[] args) {
        //1을 한번씩 더해서 총 3번을 더하는 코드
        int count = 0;

        while(count < 3) {
            count++;
            System.out.println("현재 숫자는 " + count);
        }
    }
}
