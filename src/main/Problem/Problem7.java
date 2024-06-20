package Problem;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Problem7 {

    /** 24
     * 주어진 정수 리스트에 특정 요소가 존재하는지 확인합니다.
     *
     * @param numbers 정수 리스트
     * @param number 찾고자 하는 정수
     * @return 주어진 정수가 리스트에 존재하면 true, 그렇지 않으면 false
     */
    public static boolean containsNumber(List<Integer> numbers, int number) {
        // 여기에 코드 작성
        return numbers.stream().anyMatch(num -> num.equals(number));
    }

    /**
     * 주어진 정수 리스트의 모든 요소가 짝수인지 확인합니다.
     *
     * @param numbers 정수 리스트
     * @return 모든 요소가 짝수이면 true, 그렇지 않으면 false
     */
    public static boolean areAllEven(List<Integer> numbers) {
        // 여기에 코드 작성
        return numbers.stream().allMatch(num -> num % 2 == 0);
    }

    /**
     * 주어진 정수 리스트에서 하나 이상의 요소가 10보다 큰지 확인합니다.
     *
     * @param numbers 정수 리스트
     * @return 하나 이상의 요소가 10보다 크면 true, 그렇지 않으면 false
     */
    public static boolean hasGreaterThanTen(List<Integer> numbers) {

        return numbers.stream().anyMatch(dto -> dto > 10);
    }

    /**
     * 주어진 정수 리스트의 평균 값을 계산합니다.
     *
     * @param numbers 정수 리스트
     * @return 평균 값 (리스트가 비어있으면 OptionalDouble.empty())
     */
    public static OptionalDouble calculateAverage(List<Integer> numbers) {
        // 여기에 코드 작성
        return numbers.stream().mapToInt(Integer::intValue).average();
    }

    /**
     * 주어진 문자열 리스트에서 가장 긴 문자열을 찾습니다.
     *
     * @param strings 문자열 리스트
     * @return 가장 긴 문자열 (리스트가 비어있으면 Optional.empty())
     */
    public static Optional<String> findLongestString(List<String> strings) {
        // 여기에 코드 작성
        if (strings.isEmpty()) {
            return Optional.empty();
        }
        return strings.stream().max(Comparator.comparingInt(String::length));
    }

    /**
     * 주어진 문자열 리스트의 모든 문자열에서 문자 개수의 총합을 계산합니다.
     *
     * @param strings 문자열 리스트
     * @return 문자 개수의 총합
     */
    public static int totalCharacterCount(List<String> strings) {
        // 여기에 코드 작성
        return strings.stream().mapToInt(String::length).sum();
    }

    /**
     * 주어진 정수 리스트에서 짝수의 개수를 계산합니다.
     *
     * @param numbers 정수 리스트
     * @return 짝수의 개수
     */
    public static long countEvenNumbers(List<Integer> numbers) {
        // 여기에 코드 작성
        return numbers.stream().filter(dto -> dto % 2 == 0).count();
    }
}
