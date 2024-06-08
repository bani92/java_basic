package Problem;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Problem2 {

    /**
     * 주어진 정수 리스트에서 중복된 값을 제거하고 유일한 값들만 포함하는 리스트를 반환합니다.
     *
     * @param numbers 원본 정수 리스트
     * @return 중복 없는 정수 리스트
     */
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        // 여기에 코드 작성
        return numbers.stream().distinct().collect(Collectors.toList());
    }

    /**
     * 주어진 문자열 리스트를 알파벳 순으로 정렬하여 반환합니다.
     *
     * @param strings 원본 문자열 리스트
     * @return 알파벳 순으로 정렬된 문자열 리스트
     */
    public static List<String> sortStrings(List<String> strings) {
        // 여기에 코드 작성

        return strings.stream().sorted().collect(Collectors.toList());
    }

    /**
     * 주어진 정수 리스트에서 첫 번째로 짝수를 찾아 반환합니다.
     *
     * @param numbers 원본 정수 리스트
     * @return 첫 번째 짝수 (존재하지 않으면 Optional.empty())
     */
    public static Optional<Integer> findFirstEven(List<Integer> numbers) {
        // 여기에 코드 작성
//        Optional<Integer> i = Optional.of(numbers.stream().filter(item -> item % 2 == 0).collect(Collectors.toList()).get(0));

        return numbers.stream().filter(number -> number % 2 == 0).findFirst();
    }

    /**
     * 주어진 문자열 리스트의 각 문자열에 대해 길이가 3보다 크면 대문자로 변환하고, 그렇지 않으면 그대로 두는 새로운 리스트를 반환합니다.
     *
     * @param strings 원본 문자열 리스트
     * @return 변환된 문자열 리스트
     */
    public static List<String> transformStrings(List<String> strings) {
        // 여기에 코드 작성
        return strings.stream().map(string -> string.length() >= 3 ? string.toUpperCase() : string).toList();
    }

    /**
     * 주어진 Customer 객체 리스트를 나이(age)별로 그룹화하여 Map으로 반환합니다.
     *
     * @param customers Customer 객체 리스트
     * @return 나이별로 그룹화된 Map
     */
    public static Map<Integer, List<Customer>> groupCustomersByAge(List<Customer> customers) {
        // 여기에 코드 작성
        Map<Integer, List<Customer>> collect = customers.stream().collect(groupingBy((Customer::getAge)));
        return collect;
    }
}
