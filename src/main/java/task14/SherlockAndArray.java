// TASK: https://www.hackerrank.com/challenges/sherlock-and-array/problem

package task14;

import java.util.List;

public class SherlockAndArray {


    public boolean balancedSums(List<Integer> numbers) {
        int sumOfAllList = numbers.stream().reduce(Integer::sum).orElse(0);
        int sum = 0;
        for (Integer number : numbers) {
            if ((2 * sum + number) == sumOfAllList) {
                return true;
            }
            sum += number;
        }
        return false;
    }
}
