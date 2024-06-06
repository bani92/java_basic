package Problem;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Problem1 {

    /**
     * 주어진 문자열 리스트에서 길이가 5 이상인 문자열만을 포함하는 리스트를 반환합니다.
     *
     * @param strings 원본 문자열 리스트
     * @return 길이가 5 이상인 문자열만 포함하는 리스트
     */
    public static List<String> filterStrings(List<String> strings) {
        return strings.stream().filter(p -> p.length() >= 5).collect(Collectors.toList());
    }

    /**
     * 주어진 정수 리스트의 각 요소를 제곱하여 새로운 리스트를 반환합니다.
     *
     * @param numbers 원본 정수 리스트
     * @return 각 요소를 제곱한 새 리스트
     */
    public static List<Integer> squareNumbers(List<Integer> numbers) {
        return numbers.stream().map(p -> (int)Math.pow(p,2)).toList();
    }

    /**
     * 주어진 Double 리스트의 모든 요소의 합계를 반환합니다.
     *
     * @param numbers 원본 Double 리스트
     * @return 요소들의 합계
     */
    public static double sumOfList(List<Double> numbers) {
        // 여기에 코드 작성
        double sum = numbers.stream().mapToDouble(Double::doubleValue).sum();
        return sum;
    }

    /**
     * 주어진 정수 리스트에서 최대값을 반환합니다.
     * 최소값을 찾는 것도 비슷한 방법으로 할 수 있습니다.
     *
     * @param numbers 원본 정수 리스트
     * @return 리스트의 최대값
     */
    public static OptionalInt findMax(List<Integer> numbers) {
        // OptionalInt 에 저장된 값이 없을때 0로 반환, null은 아님
        return OptionalInt.of(numbers.stream().max(Integer::compare).orElse(0));
    }

    /**
     * 주어진 문자열 리스트를 하나의 문자열로 연결하여 반환합니다.
     *
     * @param strings 원본 문자열 리스트
     * @return 연결된 문자열
     */
    public static String concatenateStrings(List<String> strings) {
        // 여기에 코드 작성

        return strings.stream().map(String::trim).collect(Collectors.joining());
    }
}
