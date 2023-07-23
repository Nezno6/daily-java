package task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CatsAndMouseTest {

    CatsAndMouse catsAndMouse = new CatsAndMouse();

    public static Stream<Arguments> dataToTestCatAndMouseProblem() {
        return Stream.of(
                Arguments.of(2, 5, 4, "Cat B"),
                Arguments.of(1, 2, 3, "Cat B"),
                Arguments.of(1, 3, 2, "Mouse C"),
                Arguments.of(2, 3, 1, "Cat A")
        );
    }

    @ParameterizedTest
    @MethodSource("dataToTestCatAndMouseProblem")
    public void catAndMouse(int positionOfCatA, int positionOfCatB, int positionOfMouse, String expected) {
        String actual = catsAndMouse.findCatsAndMouseWinner(positionOfCatA, positionOfCatB, positionOfMouse);
        Assertions.assertEquals(expected, actual);
    }
}
