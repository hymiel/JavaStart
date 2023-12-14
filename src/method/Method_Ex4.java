package method;

import java.util.Scanner;

public class Method_Ex4 {
    public static void main(String[] args) {
        //은행계좌입출금

        int balance = 0;

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------------");
            System.out.println("선택 : ");
            int option = scanner.nextInt();
            int amount;
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("입금액을 입력하세요.");
                    amount = scanner.nextInt();
                    balance = deposit(balance,amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요.");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    System.out.println("현재 잔액은 " + balance + "원");
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return; //main 메서드가 종료됨
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }
        }
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
