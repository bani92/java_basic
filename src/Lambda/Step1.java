package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Step1 {
    public static void main(String[] args) {

        /** https://yooniron.tistory.com/14
         * 예제1번
         */
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Start Thread");
                    Thread.sleep(1000);
                    System.out.println("End Thread");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.run();

        /**
         * 예제2번
         */
        List<String> list = new ArrayList<>();
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");

        list.forEach(x -> System.out.println(x));
        list.forEach(System.out::println);

        /**
         * 예제3번
         */
        MySum func = (a, b) -> a + b;

        System.out.println(func.sum(10,11));
    }
}
