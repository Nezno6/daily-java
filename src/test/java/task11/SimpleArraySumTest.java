package task11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class SimpleArraySumTest {
    SimpleArraySum simpleArraySum = new SimpleArraySum();

    public static Stream<Arguments> dataForSumArgumentsTest() {
        return Stream.of(
                Arguments.of(List.of(1,2,3),6),
                Arguments.of(List.of(1,2,3,4,10,11),31)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForSumArgumentsTest")
    void sumArguments(List<Integer> numbers, int expected) {
        Integer actual = simpleArraySum.sumArguments(numbers);
        Assertions.assertEquals(expected, actual);
    }
}
