// TASK: https://www.hackerrank.com/challenges/between-two-sets/problem?isFullScreen=true
package task13;

import java.util.List;

public class BetweenTwoSets {
    // element%d1=0 and element%d2=0 and element%d3=0 --> element >= max(d1,d2,d3) --> element is a multiple
    // m1%element=0 and m2%element=0 and m3%element=0 --> element <= min(m1,m2,m3) --> element is a divisor
    public int getSizeOfWantedSet(List<Integer> divisors, List<Integer> multiples) {
        int counter = 0;
        int lowerBoundFromLcmSet = lcm(divisors);
        int upperBoundFromGcdSet = gcd(multiples);
        for (int i = lowerBoundFromLcmSet; i <= upperBoundFromGcdSet; i += lowerBoundFromLcmSet) {
            if (isDivisorOfAll(multiples, i)) {
                counter++;
            }
        }
        return counter;
    }

    private boolean isDivisorOfAll(List<Integer> multiples, int i) {
        for (Integer multiple : multiples) {
            if (multiple % i != 0) {
                return false;
            }
        }
        return true;
    }

    int gcd(int firstNum, int secondNum) {
        if (secondNum == 0) return firstNum;
        else return gcd(secondNum, firstNum % secondNum);
    }

    int gcd(List<Integer> numbers) {
        int result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result = gcd(numbers.get(i), result);
        }
        return result;
    }

    int lcm(int firstNum, int secondNum) {
        return Math.abs(firstNum * secondNum) / gcd(firstNum, secondNum);
    }

    int lcm(List<Integer> numbers) {
        int result = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            result = lcm(numbers.get(i), result);
        }
        return result;
    }
}
