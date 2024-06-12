package Problem;

import java.util.*;
import java.util.stream.Collectors;

public class Problem5 {

    /**
     * 스트림을 사용하여 정수 배열에서 PriorityQueue를 생성합니다.
     *
     * @param numbers 정수 배열
     * @return 생성된 PriorityQueue
     */
    public static Queue<Integer> createPriorityQueueFromStream(int[] numbers) {
        // 여기에 코드 작성

        return Arrays.stream(numbers).boxed().collect(Collectors.toCollection(PriorityQueue::new));
    }

    /**
     * 스트림을 사용하여 문자열 배열에서 TreeMap을 생성합니다.
     * 배열의 각 요소를 key로 하고, 해당 요소의 길이를 value로 하는 TreeMap을 반환합니다.
     *
     * @param strings 문자열 배열
     * @return 생성된 TreeMap
     */
    public static Map<String, Integer> createTreeMapFromStream(String[] strings) {
        // 여기에 코드 작성

        return Arrays.stream(strings).collect(Collectors.toMap(String::toString, String::length));
    }

    /**
     * 스트림을 사용하여 정수 배열에서 LinkedHashMap을 생성합니다.
     * 배열의 각 요소를 key로 하고, 해당 요소를 제곱한 값을 value로 하는 LinkedHashMap을 반환합니다.
     *
     * @param numbers 정수 배열
     * @return 생성된 LinkedHashMap
     */
    public static Map<Integer, Integer> createLinkedHashMapFromStream(int[] numbers) {
        // toMap의 인자는 4개

        return  Arrays.stream(numbers).boxed().collect(Collectors.toMap(key -> key, value -> value * value, (existing, replacement) -> existing,
                LinkedHashMap::new));
    }
}
