// TASK: https://www.hackerrank.com/challenges/missing-numbers/problem?isFullScreen=true

package task9;

import java.util.*;

public class MissingNumbers {
    public List<Integer> getMissingNumbers(List<Integer> toCheckIfMissSomeNumbers, List<Integer> controlListOfNumbers) {

        HashMap<Integer, Integer> numbersToOccurrences = new HashMap<>();

        for (Integer number : controlListOfNumbers) {
            if (!numbersToOccurrences.containsKey(number)) {
                numbersToOccurrences.put(number, 1);
            } else {
                numbersToOccurrences.put(number, numbersToOccurrences.get(number) + 1);
            }
        }

        for (Integer numberChecked : toCheckIfMissSomeNumbers) {
            if (numbersToOccurrences.containsKey(numberChecked)) {
                numbersToOccurrences.put(numberChecked, numbersToOccurrences.get(numberChecked) - 1);
            }
        }

        List<Integer> missingNumber = new ArrayList<>();

        for (Map.Entry<Integer, Integer> number : numbersToOccurrences.entrySet()) {
            if (number.getValue() > 0) {
                for (int i = 0; i < number.getValue(); i++) {
                    missingNumber.add(number.getKey());
                }
            }
        }
        Collections.sort(missingNumber);
        return missingNumber;
    }
}
