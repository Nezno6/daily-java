// TASK: https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true

package task5;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;

public class PlusMinus {
    private static final int IS_POSITIVE = 1;
    private static final int IS_NEGATIVE = -1;
    private static final int IS_ZERO = 0;
    private static final DecimalFormat df = new DecimalFormat("0.000000", new DecimalFormatSymbols(Locale.US));
    private double positiveCounter;
    private double negativeCounter;
    private double zeroCounter;

    public List<Double> ratiosOfElementsBySignum(List<Integer> numbers) {
        for (Integer number : numbers) {
            int sign = (int) Math.signum(number);
            switch (sign) {
                case IS_POSITIVE -> positiveCounter++;
                case IS_NEGATIVE -> negativeCounter++;
                case IS_ZERO -> zeroCounter++;
            }
        }
        int size = numbers.size();
        return List.of(positiveCounter / size, negativeCounter / size, zeroCounter / size);
    }

    public List<String> formatResult(List<Double> ratiosOfElements) {
        return ratiosOfElements.stream().map(df::format).toList();
    }
}
