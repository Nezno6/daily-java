package task15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.text.ParseException;
import java.util.stream.Stream;

public class TimeConversionTest {

    TimeConversion timeConversion;

    public static Stream<Arguments> dataForTimeConversion() {
        return Stream.of(
                Arguments.of("12:01:00PM", "12:01:00"),
                Arguments.of("12:01:00AM", "00:01:00"),
                Arguments.of("07:05:45PM", "19:05:45")
        );
    }

    @BeforeEach
    void initial() {
        this.timeConversion = new TimeConversion();
    }

    @ParameterizedTest
    @MethodSource("dataForTimeConversion")
    void timeConversionTest(String timeIn12HourFormat, String expected) throws ParseException {
    String actual = timeConversion.timeConversionTo24HourFormat(timeIn12HourFormat);
    Assertions.assertEquals(expected,actual);
    }
}
