package Problem;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

class Problem7Test {

    @Test
    @DisplayName("숫자가 포함되어있는지 확인")
    public void testContainsNumber() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        Assertions.assertThat(Problem7.containsNumber(input, 3)).isEqualTo(true);
        Assertions.assertThat(Problem7.containsNumber(input, 6)).isEqualTo(false);
    }


    @Test
    @DisplayName("짝수인지 확인")
    public void testAreAllEven() {
        List<Integer> input = Arrays.asList(2, 4, 6, 8, 10);
        Assertions.assertThat(Problem7.areAllEven(input)).isEqualTo(true);
        Assertions.assertThat(Problem7.areAllEven(Arrays.asList(2,3,4))).isEqualTo(false);

    }

    @Test
    @DisplayName("하나 이상의 요소가 10보다 큰지 확인합니다.")
    public void testHasGreaterThanTen() {
        List<Integer> input = Arrays.asList(7, 8, 9, 10, 11);
        Assertions.assertThat(Problem7.hasGreaterThanTen(input)).isEqualTo(true);
        Assertions.assertThat(Problem7.hasGreaterThanTen(Arrays.asList(1, 2, 3, 4))).isEqualTo(false);
    }

    @Test
    @DisplayName("주어진 정수 리스트의 평균 값을 계산합니다.")
    public void testCalculateAverage() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        Assertions.assertThat(Problem7.calculateAverage(input)).isEqualTo(OptionalDouble.of(3.0));
    }

    @Test
    @DisplayName("가장 긴 문자열을 찾습니다.")
    public void testFindLongestString() {
        List<String> input = Arrays.asList("Java", "Stream", "API");
        Assertions.assertThat(Problem7.findLongestString(input)).isEqualTo(Optional.of("Stream"));
        Assertions.assertThat(Problem7.findLongestString(List.of())).isEqualTo(Optional.empty());
    }

    @Test
    @DisplayName("문자열에서 문자 개수의 총합을 계산합니다.")
    public void testTotalCharacterCount() {
        List<String> input = Arrays.asList("Java", "Stream", "API");
        Assertions.assertThat(Problem7.totalCharacterCount(input)).isEqualTo(13);
    }

    @Test
    @DisplayName("짝수의 개수를 계산합니다.")
    public void testCountEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Assertions.assertThat(Problem7.countEvenNumbers(numbers)).isEqualTo(3);
    }
}