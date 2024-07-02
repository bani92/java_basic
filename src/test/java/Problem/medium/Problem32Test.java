package Problem.medium;

import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Problem32Test {

    @Test
    public void testFindFirstTripleEvenSequence() {
        assertEquals(Arrays.asList(2,4,6), Problem32.findFirstTripleEvenSequence(Arrays.asList(1,2,4,6,7,8)));
        assertEquals(Arrays.asList(), Problem32.findFirstTripleEvenSequence(Arrays.asList(1,3,5)));
    }

    @Test
    public void testCountWordsContainingA() {
        assertEquals(2, Problem32.countWordsContainingA(Arrays.asList("apple","banana","cherry","fig")));
    }

    @Test
    public void testAverageLengthOfStringsStartingWithB() {
        assertEquals(7.5, Problem32.averageLengthOfStringsStartingWithB(Arrays.asList("banana", "blueberry", "apple")), 0.001);
        assertEquals(0.0, Problem32.averageLengthOfStringsStartingWithB(Arrays.asList("apple", "cherry")), 0.001);
    }

    @Test
    public void testSumOfSquaresOfNumbersGreaterThanFive() {
        assertEquals(85, Problem32.sumOfSquaresOfNumbersGreaterThanFive(Arrays.asList(1, 2, 3, 6, 7)));
    }

    @Test
    public void testGroupStringsByLength() {
        Map<Integer, List<String>> expected = Map.of(
                5, Arrays.asList("apple", "grape"),
                6, Arrays.asList("banana", "cherry")
        );
        assertEquals(expected, Problem32.groupStringsByLength(Arrays.asList("apple", "banana", "cherry", "grape")));
    }

    @Test
    public void testCountAndAverageLengthOfStringsStartingWithC() {
        SimpleEntry<Long, Double> expected = new SimpleEntry<>(2L, 3.0);
        assertEquals(expected, Problem32.countAndAverageLengthOfStringsStartingWithC(Arrays.asList("cat", "car", "apple")));
    }
}