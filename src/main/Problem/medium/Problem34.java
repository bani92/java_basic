package Problem.medium;

import java.util.Collections;
import java.util.Comparator;
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

    /**
     * 주어진 문자열 리스트에서 각 문자열의 첫 글자를 대문자로 변환하고,
     * 나머지 글자는 소문자로 변환한 새로운 리스트를 반환합니다.
     *
     * @param strings 문자열 리스트
     * @return 변환된 문자열 리스트
     */
    public static List<String> capitalizeFirstLetter(List<String> strings) {
        // 여기에 코드 작성
        return strings.stream().map(word -> word.replaceFirst(word, word.substring(0, 1).toUpperCase()) + word.substring(1).toLowerCase()).toList();
    }

    /**
     * 주어진 정수 리스트에서 합이 10을 초과하는 최초의 연속된 부분 리스트를 반환합니다.
     * 예를 들어, [1, 2, 3, 5, 4]의 경우 [3, 5, 4]가 해당합니다.
     *
     * @param numbers 정수 리스트
     * @return 합이 10을 초과하는 최초의 연속된 부분 리스트
     */
    public static List<Integer> findFirstSublistWithSumOverTen(List<Integer> numbers) {
        // 여기에 코드 작성
        int[] sum = {0};
        return IntStream.range(0,numbers.size())
                .boxed()
                .flatMap(start -> IntStream.range(start, numbers.size()).mapToObj(end -> numbers.subList(start, end + 1)))
                .peek(sublist -> sum[0] = sublist.stream().mapToInt(Integer::intValue).sum())
                .filter(sublist -> sum[0] > 10)
                .findFirst()
                .orElse(Collections.emptyList());

    }

    /**
     * 주어진 직원(Employee) 리스트에서 'IT' 부서에 속하고,
     * 나이가 30 이상인 직원들의 이름을 알파벳 순으로 정렬하여 반환합니다.
     *
     * @param employees 직원 리스트
     * @return 조건을 만족하는 직원들의 이름 리스트
     */
    public static List<String> getNamesOfITDepartmentEmployeesOver30(List<Employee> employees) {
        // 여기에 코드 작성
        return employees.stream().filter(emp -> emp.getDepartment().equals("IT")).filter(age -> age.getAge() >= 30).sorted(Comparator.comparing((Employee::getName)))
                .map(Employee::getName).collect(Collectors.toList());
    }

    /**
     * 주어진 제품(Product) 리스트에서 가격이 20달러 이하인 제품들의 이름을 반환합니다.
     *
     * @param products 제품 리스트
     * @return 가격이 20달러 이하인 제품들의 이름 리스트
     */
    public static List<String> getProductNamesUnder20Dollars(List<Product> products) {
        // 여기에 코드 작성

        return products.stream().filter(pro -> pro.getPrice() <= 20).map(Product::getName).collect(Collectors.toList());
    }

    /**
     * 주어진 제품(Product) 리스트에서 가장 높은 가격을 가진 제품의 이름을 반환합니다.
     * 리스트가 비어있다면 빈 문자열을 반환합니다.
     *
     * @param products 제품 리스트
     * @return 최대 가격을 가진 제품의 이름, 빈 리스트인 경우 빈 문자열
     */
    public static String getMostExpensiveProductName(List<Product> products) {
        // 여기에 코드 작성

        return products.stream().max(Comparator.comparing(Product::getPrice)).map(Product::getName).orElse("");
    }

}


