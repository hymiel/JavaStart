package loop;

public class Do_while {
    public static void main(String[] args) {
        //참,거짓 상관없이 조건에 만족하지 않아도 무조건 한번은 출력 해야하는 경우
        //우선 돌리고 조건을 검사
        int i = 10;
        do {
            System.out.println("현재 숫자는 " + i);
            i++;
        } while (i<3);
    }
}
