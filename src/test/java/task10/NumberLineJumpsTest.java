package task10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class NumberLineJumpsTest {

    NumberLineJumps numberLineJumps = new NumberLineJumps();

    public static Stream<Arguments> dataForKangarooTest() {
        return Stream.of(
                Arguments.of(1,2,2,1,true),
                Arguments.of(0,3,4,2,true),
                Arguments.of(0,2,5,3,false),
                Arguments.of(0,5,3,3,false)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForKangarooTest")
    void countJumpsTest(
            int positionChasing,
            int valueJumpChasing,
            int positionChased,
            int valueJumpChased,
            boolean expected){
    boolean actual = numberLineJumps.countJumps(positionChasing, valueJumpChasing, positionChased, valueJumpChased);
        Assertions.assertEquals(expected,actual);
    }
}
