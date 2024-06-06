package Problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @Test
    @DisplayName("length 5 이상")
    public void testFilterStrings() {
        List<String> input = Arrays.asList("apple", "banana", "cherry", "fig");
        List<String> expected = Arrays.asList("apple", "banana", "cherry");
        assertEquals(expected, Problem1.filterStrings(input));
    }

    @Test
    @DisplayName("제곱")
    public void testSquareNumbers() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(1, 4, 9, 16);
        assertThat(Problem1.squareNumbers(input)).isEqualTo(expected);
    }

    @Test
    @DisplayName("모든항목 더하기")
    public void testSumOfList() {
        List<Double> input = Arrays.asList(1.5, 2.5, 3.5);
        double expected = 7.5;
        assertThat(Problem1.sumOfList(input)).isEqualTo(expected);
    }

    @Test
    @DisplayName("최대값 구하기")
    public void testFindMax() {
        List<Integer> input = Arrays.asList(3, 9, 2, 8);
        assertThat(Problem1.findMax(input).getAsInt()).isEqualTo(9);
    }

    @Test
    @DisplayName("문자열 연결")
    public void testConcatenateStrings() {
        List<String> input = Arrays.asList("Java","Stream","API");
        assertThat(Problem1.concatenateStrings(input)).isEqualTo("JavaStreamAPI");
    }

}