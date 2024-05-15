package Stream.One;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * class       :Step4
 * Package      :Stream.One
 *
 * @Description:
 * @author: SR45
 * @since: 2024-05-15 오전 11:16
 * 변경이력:
 * 이름     : 일자          : 근거자료   : 변경내용
 * ------------------------------------------------------
 * : 2024-05-15 :            : 신규 개발.
 */
public class Step4 {

    public static void main(String[] args) {

        List<String> stringList = List.of("zayson", "maeng", "joon");
        Stream<String> stringStream = stringList.stream().sorted();

        // 기존 데이터로부터 생성한 스트림
        stringStream.forEach(System.out::println);

        // 스트림이 닫혔기때문에 Exception
        // stringStream.filter(string -> string.contains("zayson")).forEach(System.out::println);

        for (String str : stringList) {
            System.out.println(str);
        }

        boolean forResult = stringContains(stringList);

        boolean streamResult = stringList.stream().anyMatch(str -> str.contains("a"));

        System.out.println(forResult==streamResult);

    }

    private static boolean stringContains(List<String> stringList) {

        for (String string : stringList) {
            if(string.contains("a")) {
                return true;
            }
        }
        return false;
    }

    private static void createStream() {
        /**
         * 스트림 생성하기
         */
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        List<String> stringList = List.of("zayson", "maeng", "joon");

        IntStream intStream = Arrays.stream(intArray);     // 배열의 스트림 생성
        Stream<String> stringStream = stringList.stream(); // 리스트의 스트림

        Map<String, Integer> person = Map.of("zayson", 28, "chaeyoung", 26);
        Stream<Map.Entry<String, Integer>> entryStream = person.entrySet().stream(); // 맵의 EntrySet 스트림 생성

        Set<Integer> integerSet = Set.of(10, 20, 30);
        Stream<Integer> stream = integerSet.stream(); // 셋의 스트림 생성 -> Integer 이므로 Integer 스트림 생성

        // Stream.of 팩토리 메서드로 스트림 생성
        Stream<Integer> integerStream = Stream.of(20, 30);

        // https://zayson.tistory.com/entry/Stream-API-%EB%AC%B4%EC%9E%91%EC%A0%95-%EC%97%B0%EC%8A%B5%ED%95%98%EA%B8%B0
    }
}
