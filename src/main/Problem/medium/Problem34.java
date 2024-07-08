package Problem.medium;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem34 {

    /**
     * 주어진 문자열 리스트에서 'd'로 시작하는 문자열의 인덱스를 찾아 리스트로 반환합니다.
     * 인덱스는 0부터 시작합니다.
     *
     * @param strings 문자열 리스트
     * @return 'd'로 시작하는 문자열의 인덱스 리스트
     */
    public static List<Integer> findIndicesOfStringsStartingWithD(List<String> strings) {
        // 여기에 코드 작성
        return IntStream.range(0,strings.size()).filter(word -> strings.get(word).startsWith("d")).boxed().collect(Collectors.toList());
    }

    /**
     * 주어진 정수 리스트가 순차적으로 증가하는지 확인합니다.
     * 예를 들어, 리스트 [1, 2, 3, 4]는 순차적으로 증가하지만, [1, 3, 2, 4]는 그렇지 않습니다.
     *
     * @param numbers 정수 리스트
     * @return 리스트가 순차적으로 증가하면 true, 그렇지 않으면 false
     */
    public static boolean isSequentiallyIncreasing(List<Integer> numbers) {
        // 여기에 코드 작성

        return IntStream.range(0, numbers.size() -1).allMatch(num -> numbers.get(num) < numbers.get(num + 1));
    }
}


