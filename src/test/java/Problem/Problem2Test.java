package Problem;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem2Test {

    @Test
    @DisplayName("중복값 제거")
    public void testRemoveDuplicates() {
        List<Integer> input = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        Assertions.assertThat(Problem2.removeDuplicates(input)).isEqualTo(expected);
    }

    @Test
    @DisplayName("정렬")
    public void testSortStrings() {
        List<String> input = Arrays.asList("banana", "apple", "cheery");
        List<String> expected = Arrays.asList("apple", "banana", "cheery");
        Assertions.assertThat(Problem2.sortStrings(input)).isEqualTo(expected);
    }

    @Test
    @DisplayName("첫번째 짝수")
    public void testFindFirstEven() {
        List<Integer> input = Arrays.asList(1, 3, 5, 6, 7);
        Assertions.assertThat(Problem2.findFirstEven(input)).isEqualTo(Optional.of(6));

    }

    @Test
    @DisplayName("문자열 길이가 3보다 크면 대문자 변환")
    public void testTransformStrings() {
        List<String> input = Arrays.asList("Java", "is", "fun");
        List<String> expected = Arrays.asList("JAVA", "is", "FUN");
        Assertions.assertThat(Problem2.transformStrings(input)).isEqualTo(expected);
    }

    @Test
    @DisplayName("나이별로 그룹핑")
    public void testGroupCustomersByAge() {
        List<Customer> input = Arrays.asList(
                new Customer(1, "Alice", 30),
                new Customer(2, "Bob", 20),
                new Customer(3, "Charlie", 30)
        );

        Map<Integer, List<Customer>> result = Problem2.groupCustomersByAge(input);
        Assertions.assertThat(result.get(30).size()).isEqualTo(2);
        Assertions.assertThat(result.get(20).size()).isEqualTo(1);

    }

}