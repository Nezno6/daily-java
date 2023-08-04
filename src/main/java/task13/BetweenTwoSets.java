// TASK: https://www.hackerrank.com/challenges/between-two-sets/problem?isFullScreen=true
package task13;

import java.util.List;
import java.util.OptionalInt;

public class BetweenTwoSets {
    // element%d1=0 and element%d2=0 and element%d3=0 --> element >= max(d1,d2,d3) --> element is a multiple
    // m1%element=0 and m2%element=0 and m3%element=0 --> element <= min(m1,m2,m3) --> element is a divisor
    public int getSizeOfWantedSet(List<Integer> divisors, List<Integer> multiples) {
        int counter = 0;
        int maxDivisor = max(divisors);
        int minMultiple = min(multiples);
        for (int i = maxDivisor; i <= minMultiple; i++) {
            if (isMultipleOfAll(divisors, i) && isDivisorOfAll(multiples, i)) {
                counter++;
            }
        }
        return counter;
    }

    private boolean isMultipleOfAll(List<Integer> divisors, int i) {
        for (Integer divisor : divisors) {
            if (i % divisor != 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isDivisorOfAll(List<Integer> multiples, int i) {
        for (Integer multiple : multiples) {
            if (multiple % i != 0) {
                return false;
            }
        }
        return true;
    }

    private int max(List<Integer> divisors) {
        OptionalInt max = divisors.stream().mapToInt(e -> e).max();
        if (max.isPresent()) {
            return max.getAsInt();
        }
        throw new IllegalArgumentException("Max method accepts only numbers");
    }

    private int min(List<Integer> multiples) {
        OptionalInt min = multiples.stream().mapToInt(e -> e).min();
        if (min.isPresent()) {
            return min.getAsInt();
        }
        throw new IllegalArgumentException("Min method accepts only numbers");
    }
}
