package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step3 {
    public static void main(String[] args) {

        /**
         * 최종연산
         * forEach()
         */
        Stream<String> stream = Stream.of("apple","banana","cherry","durian");
        stream.forEach(str -> System.out.println(str));

        /**
         * toArray()
         * 배열로 반환합니다.
         */
        Stream<String> stream1 = Stream.of("apple","banana","cherry","durian");
        String[] arr = stream1.toArray(String[]::new);
        System.out.println(Arrays.toString(arr));

        /**
         * reduce()
         * 하나로 줄여 하나의 결과를 반환합니다.
         */
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        int sum = stream2.reduce(1, (acc, val) -> acc + val);
        System.out.println(sum);

        /**
         * collect()
         * Stream 요소를 수집하여 새로운 Collection, List, Set 반환합니다.
         */
        Stream<String> stream3 = Stream.of("apple","banana","cherry","durian");
        List<String> list = stream3.collect(Collectors.toList());
        System.out.println(list);

        /**
         * count()
         * 요소의 개수를 반환합니다.
         */
        Stream<String> stream4 = Stream.of("apple","banana","cherry","durian");
        long count = stream4.count();

        /**
         * anyMatch()
         * 하나 이상의 요소가 조건에 맞는지 검사하여 결과를 반환합니다.
         */
        Stream<String> stream5 = Stream.of("apple","banana","cherry","durian");
        boolean result = stream5.anyMatch(str -> str.startsWith("a"));

        Stream<String> stream6 = Stream.of("apple","banana","cherry","durian");
        boolean result2 = stream6.allMatch(str -> str.length() > 3);
        System.out.println(result2);

        Stream<String> stream7 = Stream.of("apple","banana","cherry","durian");
        boolean result3 = stream7.noneMatch(str -> str.startsWith("z"));
        System.out.println(result3);
    }
}
