package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class DrawingBookTest {

    DrawingBook drawingBook = new DrawingBook();

    static Stream<Arguments> pageTurns() {
        return Stream.of(
                Arguments.of(5, 3, 1),
                Arguments.of(6, 2, 1),
                Arguments.of(5, 4, 0),
                Arguments.of(6, 3, 1),
                Arguments.of(7, 2, 1),
                Arguments.of(6, 4, 1),
                Arguments.of(7, 3, 1),
                Arguments.of(8, 5, 2),
                Arguments.of(7, 4, 1),
                Arguments.of(9, 5, 2),
                Arguments.of(10, 5, 2),
                Arguments.of(10, 3, 1),
                Arguments.of(10, 8, 1),
                Arguments.of(10, 7, 2),
                Arguments.of(7, 7, 0),
                Arguments.of(1, 1, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("pageTurns")
    void getMinNumberOfPageTurnsTest(int nNumberOfPages, int pPageNumberToTurnTo, int expected) {
        int actual = drawingBook.getMinNumberOfPageTurns(nNumberOfPages, pPageNumberToTurnTo);
        Assertions.assertEquals(expected, actual);
    }
}
