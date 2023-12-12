package condition;

public class CondOp1 {
    public static void main(String[] args) {


        //삼항연산자 : 참과 거짓에 따라서 특정 값을 구하는 경우에 사용
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + ", status = " + status);
    }
}
