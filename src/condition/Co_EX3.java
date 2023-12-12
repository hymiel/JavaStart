package condition;

public class Co_EX3 {
    public static void main(String[] args) {

        //환율 계산하기
        int dollar = 10;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다");
        } else if (dollar == 0) {
            System.out.println("환전 할 금액이 없습니다.");
        } else {
            int won = dollar * 1300;
            System.out.println("환전 금액은 " + won + "원 입니다.");
        }
    }
}
