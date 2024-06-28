package Problem.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem31Test {

    @Test
    public void testTransformAndSortStrings() {
        List<String> input = Arrays.asList("apple", "banana", "cherry", "fig", "elephant", "dog", "cat");
        List<String> expected = Arrays.asList("APPLE", "CHERRY");
        assertEquals(expected, Problem31.transformAndSortStrings(input));
    }

    @Test
    @DisplayName("10 ~ 20 사이의 숫자를 제곱")
    public void testFilterAndSquareNumbers() {
        List<Integer> input = Arrays.asList(5, 10, 15, 20, 25);
        List<Integer> expected = Arrays.asList(100, 225, 400);
        assertEquals(expected, Problem31.filterAndSquareNumbers(input));
    }

    @Test
    @DisplayName("a로 시작하는 문자길이 합")
    public void testSumLengthsOfStringsStartingWithA() {
        List<String> input = Arrays.asList("apple", "banana", "avocado", "apricot", "grape");
        assertEquals(19,Problem31.sumLengthsOfStringsStartingWithA(input));
    }

    @Test
    @DisplayName("제일 큰 숫자")
    public void testFindMaxValue() {
        assertEquals(10, Problem31.findMaxValue(Arrays.asList(1, 2, 10, 3)));
        assertEquals(0, Problem31.findMaxValue(Collections.emptyList()));
    }

    @Test
    @DisplayName("제일 긴 문자")
    public void testFindLongestWord() {
        assertEquals("strawberry", Problem31.findLongestWord(Arrays.asList("apple", "banana", "strawberry")));
        assertEquals("", Problem31.findLongestWord(Arrays.asList()));
    }
}