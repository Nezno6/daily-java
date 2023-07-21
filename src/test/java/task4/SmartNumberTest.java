package task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SmartNumberTest {

    SmartNumber smartNumber = new SmartNumber();

    static Stream<Arguments> numbersToCheckIsSmart() {
        return Stream.of(Arguments.of(4, true), // 1,2,4
                Arguments.of(1, true), // 1
                Arguments.of(2, false), // 1,2
                Arguments.of(7, false), // 1,7
                Arguments.of(49, true), // 1,7,49
                Arguments.of(64, true), // 1, 2, 4, 8, 16, 32, 64
                Arguments.of(65, false), // 1, 5, 13, 65
                Arguments.of(74, false), // 1,2,37,74
                Arguments.of(169, true), // 1, 13, 169
                Arguments.of(2401, true), // 1, 7, 49, 343, 2401
                Arguments.of(14641, true) // 1, 11, 121, 1331, 14641
        );
    }

    @ParameterizedTest
    @MethodSource("numbersToCheckIsSmart")
    void isSmartNumberTest(int number, Boolean expected) {
        Boolean actual = smartNumber.isSmartNumber(number);
        Assertions.assertEquals(expected, actual);
    }
}
