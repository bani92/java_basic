package Problem.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem31Test {

    @Test
    public void testTransformAndSortStrings() {
        List<String> input = Arrays.asList("apple", "banana", "cherry", "fig", "elephant", "dog", "cat");
        List<String> expected = Arrays.asList("APPLE", "CHERRY");
        assertEquals(expected, Problem31.transformAndSortStrings(input));
    }
}