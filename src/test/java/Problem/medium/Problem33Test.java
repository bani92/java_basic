package Problem.medium;

import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Problem33Test {

    @Test
    public void testSumSpecialMultiples() {
        assertEquals(63, Problem33.sumSpecialMultiples(Arrays.asList(3, 5, 10, 15)));
    }

    @Test
    public void testFilterStringsByLength() {
        assertEquals(Arrays.asList("cat", "dog"), Problem33.filterStringsByLength(Arrays.asList("cat", "sheep", "dog"), Arrays.asList(3, 3, 3)));
    }

    @Test
    public void testSumExcludingRange() {
        assertEquals(30,Problem33.sumExcludingRange(Arrays.asList(3,5,7,10,12,15)));
    }

    @Test
    public void testConcatenateStringsOverLengthThree() {
        assertEquals("applebanana", Problem33.concatenateStringsOverLengthThree(Arrays.asList("apple", "ban", "banana")));
    }

    @Test
    public void testFrequencyOfNumbers() {
        Map<Integer, Long> expected = Map.of(1, 2L, 2, 1L, 3, 1L, 4, 1L);
        assertEquals(expected, Problem33.frequencyOfNumbers(Arrays.asList(1, 1, 2, 3, 4)));
    }
}