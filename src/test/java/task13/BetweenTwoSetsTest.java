package task13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class BetweenTwoSetsTest {
    BetweenTwoSets betweenTwoSets = new BetweenTwoSets();

    public static Stream<Arguments> dataForGetSizeOfSearchedSet() {
        return Stream.of(
                Arguments.of(List.of(2, 6), List.of(24, 36), 2),
                Arguments.of(List.of(2, 4), List.of(16, 32, 96), 3));
    }

    @ParameterizedTest
    @MethodSource("dataForGetSizeOfSearchedSet")
    void getSizeOfWantedSetTest(List<Integer> divisors, List<Integer> multiples, int expected) {
        int actual = betweenTwoSets.getSizeOfWantedSet(divisors, multiples);
        Assertions.assertEquals(expected, actual);
    }
}

