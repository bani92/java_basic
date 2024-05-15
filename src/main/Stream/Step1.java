package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Step1 {

    public static void main(String[] args) {

        /**
         * https://sm-code.tistory.com/entry/Java-8-Stream-API-%EA%B8%B0%EB%B3%B8-%EB%AC%B8%EB%B2%95-%EB%B0%8F-%ED%99%9C%EC%9A%A9-%EC%98%88%EC%A0%9C
         *  Collection으로부터 생성
         */
        List<String> list = Arrays.asList("a","b","c");
        Stream<String> stream = list.stream();
        /**
         *  Array로부터 생성
         */
        String[] arr = {"a","b","c"};
        Stream<String> stream1 = Arrays.stream(arr);
        /**
         *  Stream.of() 이용
         */
        Stream<String> stream2 = Stream.of("a","b","c");
    }



}
