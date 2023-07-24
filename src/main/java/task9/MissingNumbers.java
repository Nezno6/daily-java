// TASK: https://www.hackerrank.com/challenges/missing-numbers/problem?isFullScreen=true

package task9;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers {
    public List<Integer> getMissingNumbers(List<Integer> toCheckIfMissSomeNumbers, List<Integer> controlListOfNumbers) {

        HashMap<Integer, Integer> numbersToOccurrences = controlListOfNumbers
                .stream()
                .collect(Collectors
                        .toMap(
                                numberKey -> numberKey,
                                numberValue -> 1,
                                Integer::sum,
                                HashMap::new
                        )
                );

        toCheckIfMissSomeNumbers.forEach(
                numberChecked -> {
                    numbersToOccurrences.merge(numberChecked, -1, Integer::sum);
                }
        );

        return numbersToOccurrences
                .entrySet()
                .stream()
                .filter(numberToOccurrence -> numberToOccurrence.getValue() > 0)
                .flatMapToInt(
                        numberToOccurrence -> IntStream
                                .range(0, numberToOccurrence.getValue())
                                .map(index -> numberToOccurrence.getKey())
                )
                .sorted()
                .boxed()
                .toList();
    }
}
