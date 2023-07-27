package task12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StaircaseTest {

    Staircase staircase = new Staircase();

    public static Stream<Arguments> dataForDrawingHash() {
        return Stream.of(
                Arguments.of(4,
                           """
                           #
                          ##
                         ###
                        ####"""
                ),
                Arguments.of(6,
                             """
                             #
                            ##
                           ###
                          ####
                         #####
                        ######"""
                )
        );
    }

    @ParameterizedTest
    @MethodSource("dataForDrawingHash")
    void drawingHashTest(int numberOfLevel, String expected){
    String actual = staircase.drawStaircase(numberOfLevel);
    Assertions.assertEquals(expected,actual);
    }


}
