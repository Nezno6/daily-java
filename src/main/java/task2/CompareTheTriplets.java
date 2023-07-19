// TASK: https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true

package task2;

import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.compare;

public class CompareTheTriplets {
    public static final int ALICE_WIN = 1;
    public static final int BOB_WIN = (-1);

    public List<Integer> compareTriplets(List<Integer> pointsA, List<Integer> pointsB) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < 3; i++) {
            int comparisonResult = compare(pointsA.get(i), pointsB.get(i));
            aliceScore += comparisonResult == ALICE_WIN ? 1 : 0;
            bobScore += comparisonResult == BOB_WIN ? 1 : 0;
        }
        return Arrays.asList(aliceScore, bobScore);
    }
}
