package task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SmartNumberTest {

    SmartNumber smartNumber = new SmartNumber();

    static Stream<Arguments> numbersToCheckIsSmart() {
        return Stream.of(
                Arguments.of(4, "YES"),
                Arguments.of(1, "NO"),
                Arguments.of(2, "NO"),
                Arguments.of(7, "NO"),
                Arguments.of(169, "YES")
        );
    }

    @ParameterizedTest
    @MethodSource("numbersToCheckIsSmart")
    void isSmartNumberTest(int number, String expected) {
        String actual = smartNumber.isSmartNumber(number);
        Assertions.assertEquals(expected, actual);
    }
}
