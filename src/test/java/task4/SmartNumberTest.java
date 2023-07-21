package task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SmartNumberTest {

    SmartNumber smartNumber = new SmartNumber();

    static Stream<Arguments> numbersToCheckIsSmart() {
        return Stream.of(Arguments.of(4, "YES"), // 1,2,4
                Arguments.of(1, "YES"), // 1
                Arguments.of(2, "NO"), // 1,2
                Arguments.of(7, "NO"), // 1,7
                Arguments.of(49, "YES"), // 1,7,49
                Arguments.of(64, "YES"), // 1, 2, 4, 8, 16, 32, 64
                Arguments.of(65, "NO"), // 1, 5, 13, 65
                Arguments.of(74, "NO"), // 1,2,37,74
                Arguments.of(169, "YES"), // 1, 13, 169
                Arguments.of(2401, "YES"), // 1, 7, 49, 343, 2401
                Arguments.of(14641, "YES") // 1, 11, 121, 1331, 14641
        );
    }

    @ParameterizedTest
    @MethodSource("numbersToCheckIsSmart")
    void isSmartNumberTest(int number, String expected) {
        String actual = smartNumber.isSmartNumber(number);
        Assertions.assertEquals(expected, actual);
    }
}
