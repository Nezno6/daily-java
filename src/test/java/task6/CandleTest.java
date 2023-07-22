package task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class CandleTest {
    Candle candle = new Candle();

    static Stream<Arguments> dataOfCandlesToCheck() {
        return Stream.of(
                Arguments.of(
                        List.of(4, 4, 1, 3), 2),
                Arguments.of(
                        List.of(3, 2, 1, 3), 2)
        );
    }

    @ParameterizedTest
    @MethodSource("dataOfCandlesToCheck")
    void plusMinusTest(List<Integer> candles, int expected) {
        int actual = candle.birthdayCakeCandles(candles);
        Assertions.assertEquals(expected, actual);
    }
}
