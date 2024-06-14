package Problem;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem6Test {

    @Test
    @DisplayName("문자열로 변환하여 새로운 리스트")
    public void testConvertToStringList() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<String> expected = Arrays.asList("1", "2", "3");
        Assertions.assertThat(Problem6.convertToStringList(input)).isEqualTo(expected);

    }

    @Test
    @DisplayName("대문자로 변환하여 새로운 리스트")
    public void testConvertToUpperCase() {
        List<String> input = Arrays.asList("java", "stream", "api");
        List<String> expected = Arrays.asList("JAVA", "STREAM", "API");
        Assertions.assertThat(Problem6.convertToUpperCase(input)).isEqualTo(expected);
    }


    @Test
    @DisplayName("계산하여 새로운 리스트")
    public void testCalculateStringLengths() {
        List<String> input = Arrays.asList("java", "stream", "api");
        List<Integer> expected = Arrays.asList(4, 6, 3);
        Assertions.assertThat(Problem6.calculateStringLengths(input)).isEqualTo(expected);
    }

}