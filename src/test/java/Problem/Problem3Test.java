package Problem;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

class Problem3Test {

    @Test
    @DisplayName("10보다 큰 숫자 반환")
    public void testFindFirstGreaterThanTen() {
        Set<Integer> input = Set.of(7, 11, 5, 3, 2);
        Assertions.assertThat(Problem3.findFirstGreaterThanTen(input)).isEqualTo(Optional.of(11));
    }

    @Test
    @DisplayName("문자열 길이 반환")
    public void testMapStringLength() {
        Map<String, String> input = Map.of("a", "apple", "b", "banana");
        Map<String, Integer> expected = Map.of("a", 5, "b", 6);
        Assertions.assertThat(Problem3.mapStringLength(input)).isEqualTo(expected);
    }

    @Test
    @DisplayName("곱하기 2 반환")
    public void testDoubleEach() {
        Queue<Integer> input = new LinkedList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        Queue<Integer> expected = new LinkedList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);

        Assertions.assertThat(Problem3.doubleEach(input)).isEqualTo(expected);

    }

    @Test
    @DisplayName("key 길이가 3이상")
    public void testFilterKeys() {
        Map<String, String> input = Map.of("key1", "value1", "k2", "value2", "key3", "value3");
        Map<String, String> expected = Map.of("key1", "value1", "key3", "value3");
        Assertions.assertThat(Problem3.filterKeys(input)).isEqualTo(expected);
    }

    @Test
    @DisplayName("특정 value와 동일한 key")
    public void testKeysForValue() {
        Map<String, String> input = Map.of("k1", "apple", "k2", "banana", "k3", "apple");
        Set<String> expected = Set.of("k1", "k3");
        Assertions.assertThat(Problem3.keysForValue(input,"apple")).isEqualTo(expected);
    }
}