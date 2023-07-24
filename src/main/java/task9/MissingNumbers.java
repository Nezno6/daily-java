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

        for (Map.Entry<Integer, Integer> keyValuePair : numbersToOccurrences.entrySet()) {
            missingNumber = enterNumberIfAttendanceIsGreaterThanZero(keyValuePair,missingNumber);
        }
        Collections.sort(missingNumber);
        return missingNumber;
    }

    List<Integer> enterNumberIfAttendanceIsGreaterThanZero(
            Map.Entry<Integer, Integer> keyValuePair,
            List<Integer> missingNumber) {

        if (keyValuePair.getValue() <= 0) {
            return missingNumber;
        }

        List<Integer> copyOfMissingNumber = new ArrayList<>(missingNumber);

        for (int i = 0; i < keyValuePair.getValue(); i++) {
            copyOfMissingNumber.add(keyValuePair.getKey());
        }

        return copyOfMissingNumber;
    }

}
