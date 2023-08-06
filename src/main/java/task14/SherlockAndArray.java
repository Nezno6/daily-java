// TASK: https://www.hackerrank.com/challenges/sherlock-and-array/problem

package task14;

import java.util.List;

public class SherlockAndArray {


    public boolean balancedSums(List<Integer> numbers) {
        return balancedSumsHelper(numbers, 0, numbers.size() - 1);
    }

    private boolean balancedSumsHelper(List<Integer> numbers, int start, int end) {

        if (start > end) {
            return false;
        }

        int middle = (start + end) / 2;
        int sumToMiddle = numbers.subList(0, middle).stream().reduce(Integer::sum).orElse(0);
        int sumFromMiddleUpOne = numbers.subList(middle + 1, numbers.size()).stream().reduce(Integer::sum).orElse(0);

        if (sumToMiddle == sumFromMiddleUpOne) {
            return true;
        }

        if (sumToMiddle > sumFromMiddleUpOne) {
            return balancedSumsHelper(numbers, start, middle - 1);
        }

        return balancedSumsHelper(numbers, middle + 1, end);
    }
}
