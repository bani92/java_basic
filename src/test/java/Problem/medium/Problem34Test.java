package Problem.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Problem34Test {

    @Test
    public void testFindIndicesOfStringsStartingWithD() {
        assertEquals(Arrays.asList(1, 3), Problem34.findIndicesOfStringsStartingWithD(Arrays.asList("apple", "dog", "cat", "door")));
    }

    @Test
    public void testIsSequentiallyIncreasing() {
        assertTrue(Problem34.isSequentiallyIncreasing(Arrays.asList(1, 2, 3, 4)));
        assertFalse(Problem34.isSequentiallyIncreasing(Arrays.asList(1, 3, 2, 4)));
    }
}