package method;

public class Method_Ex3 {
    public static void main(String[] args) {
        //입출금 리펙토링
        //입금(deposit)과 출금(withdraw)을 메서드로 만들어서 리펙토링
//
//        int balance = 10000;
//
//        //입금
//        int deposit = 1000;
//        balance += deposit;
//        System.out.println(deposit + "원을 입금하셨습니다." +
//                "현재 잔액은 " + balance + "원 입니다.");
//
//        //출금
//        int withdraw = 2000;
//        if (balance >= withdraw) {
//            balance -= withdraw;
//            System.out.println(withdraw + "원을 출금하셨습니다." +
//                    "현재 잔액은 " + balance + "원 입니다.");
//
//        } else {
//            System.out.println("잔액이 부족합니다. 현재 잔액은 "
//                    + balance + "원 입니다.");
//        }
//        System.out.println("최종 잔액은 " + balance + "원");

        int balance = 10000;

        //입금
        balance = deposit(balance,1000);

        //출금
        balance = withdraw(balance, 2000);
        System.out.println("최종 잔액은 " + balance + "원");
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
                System.out.println(amount + "원을 입금하셨습니다." +
                "현재 잔액은 " + balance + "원 입니다.");

                return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하셨습니다." +
                    "현재 잔액은 " + balance + "원 입니다.");

        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액은 "
                    + balance + "원 입니다.");
        }

        return balance;
    }
}
