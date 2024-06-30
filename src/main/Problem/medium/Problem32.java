package Problem.medium;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem32 {

    /**
     * Problem38
     * 주어진 정수 리스트에서 연속된 3개의 숫자가 모두 짝수인 첫 번째 연속 부분을 찾습니다.
     * 만약 해당하는 부분이 없다면 빈 리스트를 반환합니다.
     *
     * @param numbers 정수 리스트
     * @return 연속된 3개의 숫자가 모두 짝수인 첫 번째 부분의 리스트
     */
    public static List<Integer> findFirstTripleEvenSequence(List<Integer> numbers) {
        // 여기에 코드 작성
        Optional<List<Integer>> result = IntStream.range(0, numbers.size() - 2).mapToObj(i -> numbers.subList(i, i + 3))
                .filter(subList -> subList.get(0) % 2 == 0 && subList.get(1) % 2 == 0 && subList.get(2) % 2 == 0)
                .findFirst();
        return result.orElseGet(() -> List.of());
    }

    /**
     * 주어진 문자열 리스트에서 'a'를 포함하는 단어의 개수를 세어 반환합니다.
     *
     * @param words 문자열 리스트
     * @return 'a'를 포함하는 단어의 개수
     */
    public static long countWordsContainingA(List<String> words) {
        // 여기에 코드 작성
        return words.stream().filter(word -> word.contains("a")).count();
    }

    /**
     * 주어진 문자열 리스트에서 'b'로 시작하는 문자열의 평균 길이를 계산합니다.
     * 해당하는 문자열이 없으면 0을 반환합니다.
     *
     * @param strings 문자열 리스트
     * @return 'b'로 시작하는 문자열의 평균 길이, 해당 문자열이 없으면 0
     */
    public static double averageLengthOfStringsStartingWithB(List<String> strings) {
        // 여기에 코드 작성
        OptionalDouble b = strings.stream().filter(word -> word.contains("b")).mapToInt(String::length).average();
        return b.isPresent() ? b.getAsDouble() : 0;
    }
}


