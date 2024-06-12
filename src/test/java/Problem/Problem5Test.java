package Problem;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem5Test {

    @Test
    @DisplayName("PriorityQueue")
    public void testCreatePriorityQueueFromStream() {
        int[] input = {4, 1, 3, 2, 5};
        Queue<Integer> expected = new PriorityQueue<>();

        for (int n : new int[]{1, 2, 3, 4, 5}) {
            expected.add(n);
        }

        Queue<Integer> actual = Problem5.createPriorityQueueFromStream(input);
        assertTrue(actual instanceof PriorityQueue<Integer>);
        Assertions.assertThat(actual.size()).isEqualTo(expected.size());
        while (!expected.isEmpty())
            Assertions.assertThat(actual.poll()).isEqualTo(expected.poll());
    }

    @Test
    @DisplayName("TreeMap")
    public void testCreateTreeMapFromStream() {
        String[] input = {"cherry", "banana", "apple"};
        Map<String, Integer> expected = new TreeMap<>();
        expected.put("apple", 5);
        expected.put("banana", 6);
        expected.put("cherry", 6);
        Assertions.assertThat(Problem5.createTreeMapFromStream(input)).isEqualTo(expected);

    }


    @Test
    @DisplayName("LinkedHashMap")
    public void testCreateLinkedHashMapFromStream() {
        int[] input = {1, 2, 3};
        Map<Integer, Integer> expected = new LinkedHashMap<>();
        expected.put(1, 1);
        expected.put(2, 4);
        expected.put(3, 9);
        Assertions.assertThat(Problem5.createLinkedHashMapFromStream(input)).isEqualTo(expected);
    }

}