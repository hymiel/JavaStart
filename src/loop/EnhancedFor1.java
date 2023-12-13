package loop;

public class EnhancedFor1 {
    public static void main(String[] args) {
        //향상된 for문
//        for(변수 : 배열 또는 컬렉션) {
//            //배열 또는 컬렉션의 요소를 순화하면서 수행할 작업
//        }

        int[] numbers = {1,2,3,4,5};

        //일반 for문
        for(int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
        //향상된 for문 (for-each문)
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
