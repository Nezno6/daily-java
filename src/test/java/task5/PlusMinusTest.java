package task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import java.util.stream.Stream;

public class PlusMinusTest {
    PlusMinus plusMinus = new PlusMinus();

    static Stream<Arguments> dataToCheckPlusMinus() {
        return Stream.of(Arguments.of(List.of(1, 1, 0, -1, -1), List.of(2 / 5.0, 2 / 5.0, 1 / 5.0)), Arguments.of(List.of(-4, 3, -9, 0, 4, 1), List.of(3 / 6.0, 2 / 6.0, 1 / 6.0)));
    }

    static Stream<Arguments> dataFormatToCheckPlusMinus() {
        return Stream.of(Arguments.of(List.of(1, 1, 0, -1, -1), List.of("0.400000", "0.400000", "0.200000")), Arguments.of(List.of(-4, 3, -9, 0, 4, 1), List.of("0.500000", "0.333333", "0.166667")));
    }

    @ParameterizedTest
    @MethodSource("dataToCheckPlusMinus")
    void plusMinusTest(List<Integer> numbers, List<Double> expected) {
        List<Double> actual = plusMinus.ratiosOfElementsBySignum(numbers);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("dataFormatToCheckPlusMinus")
    void plusMinusPrintingTest(List<Integer> elements, List<String> expected) {
        List<String> actual = plusMinus.formatResult(plusMinus.ratiosOfElementsBySignum(elements));
        Assertions.assertEquals(expected, actual);
    }

}
