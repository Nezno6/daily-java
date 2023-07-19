package task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class CompareTheTripletsTest {

    CompareTheTriplets compareTheTriplets = new CompareTheTriplets();

    static Stream<Arguments> comparisonPoints() {
        return Stream.of(Arguments.of(List.of(1, 2, 3), List.of(3, 2, 1), List.of(1, 1)), Arguments.of(List.of(5, 6, 7), List.of(3, 6, 10), List.of(1, 1)), Arguments.of(List.of(17, 28, 30), List.of(99, 16, 8), List.of(2, 1)));
    }

    @ParameterizedTest
    @MethodSource("comparisonPoints")
    void compareTripletsTest(List<Integer> pointsForPersonA, List<Integer> pointsForPersonB, List<Integer> expected) {
        List<Integer> actual = compareTheTriplets.compareTriplets(pointsForPersonA, pointsForPersonB);
        Assertions.assertEquals(expected, actual);
    }
}
