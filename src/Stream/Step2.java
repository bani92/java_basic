package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step2 {

    public static void main(String[] args) {

        /**
         * Stream중간연산
         * filter()
         */
        Stream<String> stream = Stream.of("apple","banana","cherry","durian");
        Stream<String> filteredStream = stream.filter(str -> str.length() > 5);
        /**
         * 출력 1번 - List로 변환하여 println
         */
        List<String> collect = filteredStream.collect(Collectors.toList());
        System.out.println(collect);

        /**
         *  map()
         */
        Stream<String> stream1 = Stream.of("apple","banana","cherry");
        Stream<Integer> mappedStream = stream1.map(str2 -> str2.length());
        /**
         * 출력 2번 - forEach문으로 println
         */
        mappedStream.forEach(System.out::println);

        /**
         *  flatMap()
         */
        Stream<List<Integer>> stream2 = Stream.of(Arrays.asList(1,2), Arrays.asList(3,4));
        Stream<Integer> flatMappedStream = stream2.flatMap(list -> list.stream());
        List<Integer> collect2 = flatMappedStream.collect(Collectors.toList());
        System.out.println(collect2);


    }
}
