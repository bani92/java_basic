package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step2_1 {
    public static void main(String[] args) {
        /**
         * Stream중간연산
         * sorted()
         */
        Stream<String> stream = Stream.of("banana","apple","durian","cherry");
        Stream<String> sortedStream = stream.sorted();
        List<String> collect = sortedStream.collect(Collectors.toList());
        System.out.println(collect);

        /**
         * distinct()
         */
        Stream<String> stream1 = Stream.of("apple","apple","durian","cherry");
        Stream<String> distinctStream = stream1.distinct();
        distinctStream.forEach(System.out::println);

        /**
         * limit()
         */
        Stream<String> stream2 = Stream.of("apple","banana","duiran","cherry");
        Stream<String> limitStream = stream2.limit(2);
        List<String> collect2 = limitStream.collect(Collectors.toList());
        System.out.println(collect2);

        /**
         * skip()
         */
        Stream<String> stream3 = Stream.of("apple","banana","duiran","cherry");
        Stream<String> skippedStream = stream3.skip(2);
        List<String> collect3 = skippedStream.collect(Collectors.toList());
        System.out.println(collect3);
    }
}
