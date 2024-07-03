package Problem.medium;

import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;

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

}