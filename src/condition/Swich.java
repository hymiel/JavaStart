package condition;

public class Swich {
    public static void main(String[] args) {
        //grade 1 : 쿠폰 1000, 2 : 쿠폰 2000, 3 : 쿠폰 3000, 그 외 500

        int grade = 2;
        int coupon;

        switch (grade){
            case 1 :
                coupon = 1000;
               break;
            case 2 :
                coupon = 2000;
                 break;
            case 4 :
                coupon = 3000;
                  break;
            default :
                coupon = 500;
        }
        System.out.println("발급 받은 쿠폰 = " + coupon);
    }
}
