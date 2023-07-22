// TASK: https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true

package task6;

import java.util.List;

public class Candle {
    public int birthdayCakeCandles(List<Integer> candles) {
        int maxHeightCandle = candles.stream().max(Integer::compareTo).orElse(0);
        return (int) candles.stream().filter(heightCandle -> heightCandle.equals(maxHeightCandle)).count();
    }
}
