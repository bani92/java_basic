package Problem.medium;

import java.util.*;
import java.util.stream.Collectors;

public class Problem31 {

    /**
     * 주어진 문자열 리스트에서 길이가 3 이상 7 이하인 문자열 중에서 'e'를 포함하고 있는 문자열들만을
     * 대문자로 변환한 뒤 이를 알파벳 순으로 정렬하여 반환합니다.
     *
     * @param strings 원본 문자열 리스트
     * @return 조건을 만족하는 대문자로 변환된, 정렬된 문자열 리스트
     */
    public static List<String> transformAndSortStrings(List<String> strings) {
        // 여기에 코드 작성

        return strings.stream().filter(s -> s.length() >=3 && s.length() <= 7).filter(dto -> dto.contains("e")).map(String::toUpperCase).sorted().toList();
    }

    /**
     * 주어진 정수 리스트에서 10 이상 20 이하의 숫자만 필터링하고, 이를 제곱한 값으로 이루어진 리스트를 반환합니다.
     *
     * @param numbers 정수 리스트
     * @return 10 이상 20 이하의 숫자들의 제곱으로 이루어진 리스트
     */
    public static List<Integer> filterAndSquareNumbers(List<Integer> numbers) {
        // 여기에 코드 작성

        return numbers.stream().filter(dto -> dto >= 10 && dto <= 20).map(dto -> (int)Math.pow(dto, 2)).collect(Collectors.toList());
    }

    /**
     * 주어진 문자열 리스트에서 'a'로 시작하는 문자열을 찾아 그 길이의 합을 계산합니다.
     *
     * @param strings 원본 문자열 리스트
     * @return 'a'로 시작하는 문자열들의 길이의 합
     */
    public static int sumLengthsOfStringsStartingWithA(List<String> strings) {
        // 여기에 코드 작성

        return strings.stream().filter(dto -> dto.startsWith("a")).mapToInt(String::length).sum();
    }

    /**
     * 주어진 정수 리스트에서 최대값을 찾습니다. 리스트가 비어있으면 0을 반환합니다.
     *
     * @param numbers 정수 리스트
     * @return 리스트의 최대값, 리스트가 비어 있으면 0
     */
    public static int findMaxValue(List<Integer> numbers) {
        // 여기에 코드 작성
        OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();
        return max.isPresent() ? max.getAsInt() : 0;
    }

    /**
     * 주어진 문자열 리스트에서 가장 긴 단어를 찾습니다. 만약 리스트가 비어있으면 빈 문자열을 반환합니다.
     *
     * @param words 문자열 리스트
     * @return 리스트에서 가장 긴 단어, 리스트가 비어있으면 빈 문자열
     */
    public static String findLongestWord(List<String> words) {
        // 여기에 코드 작성
        Optional<String> max = words.stream().max(Comparator.comparing(String::length));
        Optional<String> max1 = words.stream().max(Comparator.comparingInt(String::length));
        return max1.isPresent() ?  max1.get() : "";
    }
}


