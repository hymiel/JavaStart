package condition;

public class Co_Ex7 {
    public static void main(String[] args) {
        //홀수짝수 찾기
        int x = 2;
        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x는 " + result + " 입니다.");
    }
}
