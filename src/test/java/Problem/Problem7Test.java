package Problem;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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

}