package task13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BetweenTwoSetsTest {
    BetweenTwoSets betweenTwoSets = new BetweenTwoSets();

    public static Stream<Arguments> dataForV2GetSizeOfSearchedSet() {
        return Stream.of(Arguments.of(List.of(2, 6, 3), List.of(24 * 10_000_000, 36 * 10_000_000, 12 * 100_000_000, 48 * 10_000_000), 72), Arguments.of(List.of(2, 4), List.of(16, 32, 96), 3));
    }

    public static Stream<Arguments> dataForGCDList() {
        return Stream.of(Arguments.of(Arrays.asList(2, 6, 8), 2), Arguments.of(Arrays.asList(2, 4), 2), Arguments.of(Arrays.asList(12, 18, 24), 6), Arguments.of(Arrays.asList(15, 25, 35), 5), Arguments.of(Arrays.asList(20, 40, 60), 20), Arguments.of(Arrays.asList(20, 1, 60), 1), Arguments.of(Arrays.asList(8, 7, 12), 1));
    }

    public static Stream<Arguments> dataForLCMList() {
        return Stream.of(Arguments.of(Arrays.asList(15, 20), 60), Arguments.of(Arrays.asList(12, 18), 36), Arguments.of(Arrays.asList(21, 28), 84), Arguments.of(Arrays.asList(1, 28), 28), Arguments.of(Arrays.asList(0, 1), 0), Arguments.of(Arrays.asList(0, 8), 0));
    }

    @ParameterizedTest
    @MethodSource("dataForV2GetSizeOfSearchedSet")
    void getSizeOfWantedSetV2Test(List<Integer> divisors, List<Integer> multiples, int expected) {
        int actual = betweenTwoSets.getSizeOfWantedSet(divisors, multiples);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("dataForGCDList")
    void getGCDTest(List<Integer> numbers, int expected) {
        int actual = betweenTwoSets.gcd(numbers);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("dataForLCMList")
    void getLCMTest(List<Integer> numbers, int expected) {
        int actual = betweenTwoSets.lcm(numbers);
        Assertions.assertEquals(expected, actual);
    }
}

