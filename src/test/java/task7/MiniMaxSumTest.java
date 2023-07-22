package task7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class MiniMaxSumTest {
    MiniMaxSum miniMaxSum = new MiniMaxSum();

    static Stream<Arguments> dataOfMinMaxSumsToCheck() {
        return Stream.of(Arguments.of(List.of(1, 3, 5, 7, 9), List.of(16L, 24L)), Arguments.of(List.of(1, 2, 3, 4, 5), List.of(10L, 14L)));
    }

    @ParameterizedTest
    @MethodSource("dataOfMinMaxSumsToCheck")
    void plusMinusTest(List<Integer> numbers, List<Long> expected) {
        List<Long> actual = miniMaxSum.miniAndMaxSum(numbers);
        Assertions.assertEquals(expected, actual);
    }
}
