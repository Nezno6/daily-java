package task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class SumTest {

   Sum sum = new Sum();

    static Stream<Arguments> numbersToAdd() {
        return Stream.of(
                Arguments.of(7, 3, 10),
                Arguments.of(2, 3, 5));
    }

    @ParameterizedTest
    @MethodSource("numbersToAdd")
    void additionTest(int firstNumb, int secondNumb, int expected) {
        int actual = sum.addition(firstNumb, secondNumb);
        Assertions.assertEquals(expected, actual);
    }

}
