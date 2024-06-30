package Problem.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
}