package task14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class SherlockAndArrayTest {
    SherlockAndArray sherlockAndArray;

    @BeforeEach
    void initial() {
        this.sherlockAndArray = new SherlockAndArray();
    }

    public static Stream<Arguments> dataForBalancedSums() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3), false),
                Arguments.of(List.of(1, 2, 3, 3), true),
                Arguments.of(List.of(1, 1, 4, 1, 1), true),
                Arguments.of(List.of(2, 0, 0, 0), true),
                Arguments.of(List.of(0, 0, 2, 0), true),
                Arguments.of(List.of(1), true),
                Arguments.of(List.of(1,0), true),
                Arguments.of(List.of(1,1), false),
                Arguments.of(List.of(5, 6, 8, 11), true),
                Arguments.of(List.of(3,2,3), true)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForBalancedSums")
    void balancedSumsTest(List<Integer> numbers, boolean expected){
        boolean actual = sherlockAndArray.balancedSums(numbers);
        Assertions.assertEquals(expected,actual);
    }



}
