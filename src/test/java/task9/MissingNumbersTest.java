package task9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class MissingNumbersTest {

    MissingNumbers missingNumbers = new MissingNumbers();

    public static Stream<Arguments> dataForMissingNumbersToTest() {
        return Stream.of(
                Arguments.of(
                        List.of(203, 204, 205, 206, 207, 208, 203, 204, 205, 206),
                        List.of(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204),
                        List.of(204, 205, 206)
                ),
                Arguments.of(
                        List.of(7, 2, 5, 3, 5, 3),
                        List.of(7, 2, 5, 4, 6, 3, 5, 3),
                        List.of(4, 6)
                ),
                Arguments.of(
                        List.of(203, 204, 205, 206, 207, 208, 203, 204, 205, 206),
                        List.of(203, 204, 204, 205, 206, 207, 204, 205, 208, 203, 206, 205, 206, 204),
                        List.of(204, 204, 205, 206)
                )
        );
    }

    @ParameterizedTest
    @MethodSource("dataForMissingNumbersToTest")
    void missingNumbersTest(
            List<Integer> toCheckIfMissSomeNumbers,
            List<Integer> controlListOfNumbers,
            List<Integer> expected) {

        List<Integer> actual = missingNumbers.getMissingNumbers(toCheckIfMissSomeNumbers, controlListOfNumbers);
        Assertions.assertEquals(expected, actual);
    }

}
