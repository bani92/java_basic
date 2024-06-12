package Problem;

import java.util.*;
import java.util.stream.Collectors;

public class Problem4 {

    /**
     * 스트림을 사용하여 주어진 정수 배열에서 HashSet을 생성합니다.
     *
     * @param numbers 정수 배열
     * @return 생성된 HashSet
     */
    public static Set<Integer> createHashSetFromStream(int[] numbers) {
        // 여기에 코드 작성
        return Arrays.stream(numbers).boxed().collect(Collectors.toSet());
    }

    /**
     * 스트림을 사용하여 문자열 배열에서 HashMap을 생성합니다.
     * 배열의 각 요소를 key로 하고, 해당 요소의 길이를 value로 하는 HashMap을 반환합니다.
     *
     * @param strings 문자열 배열
     * @return 생성된 HashMap
     */
    public static Map<String, Integer> createHashMapFromStream(String[] strings) {
        // 여기에 코드 작성

        return  Arrays.stream(strings).collect(Collectors.toMap(key -> key, String::length));
    }
}