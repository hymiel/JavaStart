package method;

public class Method_Ex2 {
    public static void main(String[] args) {
        //반복 출력 리펙토링

//        String msg = "Hello World";
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(msg);
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(msg);
//        }
//        for (int i = 0; i < 7; i++) {
//            System.out.println(msg);
//        }
//

        printMsg("Hello World",3);
        printMsg("Hello World",5);
        printMsg("Hello World",7);

    }

    public static void printMsg (String msg, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }
    }
}
