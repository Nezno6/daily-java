// TASK: https://www.hackerrank.com/challenges/missing-numbers/problem?isFullScreen=true

package task9;

import java.util.*;
import java.util.Map.Entry;

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

        Iterator<Entry<Integer, Integer>> newIterator = numbersToOccurrences.entrySet().iterator();

        while (newIterator.hasNext()) {
            Entry<Integer, Integer> currentEntry = newIterator.next();
            missingNumber = enterNumberIfAttendanceIsGreaterThanZero(currentEntry, missingNumber);
        }

        Collections.sort(missingNumber);
        return missingNumber;
    }

    List<Integer> enterNumberIfAttendanceIsGreaterThanZero(Entry<Integer, Integer> currentEntry, List<Integer> missingNumber) {

        if (currentEntry.getValue() <= 0) {
            return missingNumber;
        }

        List<Integer> copyOfMissingNumber = new ArrayList<>(missingNumber);

        for (int i = 0; i < currentEntry.getValue(); i++) {
            copyOfMissingNumber.add(currentEntry.getKey());
        }

        return copyOfMissingNumber;
    }

}
