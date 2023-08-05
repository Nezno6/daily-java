// TASK: https://www.hackerrank.com/challenges/sherlock-and-array/problem

package task14;

import java.util.List;

public class SherlockAndArray {


    public boolean balancedSums(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int sumOfLeftSubList = numbers.subList(0, i).stream().reduce(Integer::sum).orElse(0);
            int sumOfRightSubList = numbers.subList(i+1, numbers.size()).stream().reduce(Integer::sum).orElse(0);

            if(sumOfLeftSubList==sumOfRightSubList){
                return true;
            }

        }
        return false;
    }
}
