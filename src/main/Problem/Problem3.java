package Problem;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Problem3 {

    /**
     * 주어진 정수 Set에서 첫 번째로 10보다 큰 수를 찾아 반환합니다.
     *
     * @param numbers 정수 Set
     * @return 10보다 큰 첫 번째 수 (존재하지 않으면 Optional.empty())
     */
    public static Optional<Integer> findFirstGreaterThanTen(Set<Integer> numbers) {
        // 여기에 코드 작성
        Optional<Integer> first = numbers.stream().filter(number -> number > 10).findFirst();
        return first;
    }

    /**
     * Map의 각 값(value)에 대해 문자열의 길이를 계산하여 새로운 Map을 생성합니다.
     *
     * @param map 원본 문자열 Map
     * @return 문자열 길이를 값으로 가지는 새 Map
     */
    public static Map<String, Integer> mapStringLength(Map<String, String> map) {
        // 여기에 코드 작성
//        Map<String, Integer> map1 = new HashMap<>();
//
//        map.forEach((key, value) -> {
//            map1.put(key, value.length());
//        });

        return map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().length()));
     //   return map1;
    }

    /**
     * Queue에 있는 모든 정수에 2를 곱하여 새 Queue를 생성합니다.
     *
     * @param numbers 원본 정수 Queue
     * @return 각 요소에 2를 곱한 새 Queue
     */
    public static Queue<Integer> doubleEach(Queue<Integer> numbers) {
        // 여기에 코드 작성
        Queue<Integer> queue = new LinkedList<>();
        for(Integer i : numbers) {
            queue.add(i * 2);
        }
        return queue;
    }


    /**
     * Map에서 길이가 3 이상인 키만 필터링하여 새 Map을 생성합니다.
     *
     * @param map 원본 Map
     * @return 길이가 3 이상인 키를 포함하는 새 Map
     */
    public static Map<String, String> filterKeys(Map<String, String> map) {
        // 여기에 코드 작성
        Map<String, String> collect = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() >= 3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return collect;
    }

    /**
     * Map에서 'apple'과 같은 특정 값에 해당하는 모든 키를 Set으로 반환합니다.
     *
     * @param map 원본 Map
     * @return 'apple'을 값으로 가지는 모든 키의 Set
     */
    public static Set<String> keysForValue(Map<String, String> map, String value) {
        // 여기에 코드 작성
        return map.entrySet().stream().filter(entry -> entry.getValue().equals(value)).map(Map.Entry::getKey).collect(Collectors.toSet());
    }
}
