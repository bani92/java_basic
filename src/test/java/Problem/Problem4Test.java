package Problem;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

class Problem4Test {

    @Test
    @DisplayName("배열을 HashSet 반환")
    public void testCreateHashSetFromStream() {
        int[] input = {1, 2, 3, 4, 5};
        Set<Integer> expected = Set.of(1, 2, 3, 4, 5);
        Assertions.assertThat(Problem4.createHashSetFromStream(input)).isEqualTo(expected);
    }

    @Test
    @DisplayName("배열을 HashMap 반환")
    public void testCreateHashMapFromStream() {
        String[] input = {"apple", "banana", "cherry"};
        Map<String, Integer> expected = Map.of("apple", 5, "banana", 6, "cherry", 6);
        Assertions.assertThat(Problem4.createHashMapFromStream(input)).isEqualTo(expected);
    }
}