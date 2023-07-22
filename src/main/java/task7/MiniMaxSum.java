// TASK: https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true

package task7;

import java.util.List;

public class MiniMaxSum {
    public List<Long> miniAndMaxSum(List<Integer> numbers) {
        long sumAllElements = numbers.stream().map(Long::valueOf).reduce(0L, Long::sum);
        long minElement = numbers.stream().mapToLong(number -> number).min().orElse(0L);
        long maxElement = numbers.stream().mapToLong(number -> number).max().orElse(0L);
        return List.of(sumAllElements - maxElement, sumAllElements - minElement);
    }
}
