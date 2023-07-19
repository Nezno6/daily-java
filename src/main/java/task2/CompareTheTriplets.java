package task2;

import java.util.List;

import static java.lang.Integer.compare;
import static java.util.Arrays.asList;

public class CompareTheTriplets {
    public List<Integer> compareTriplets(List<Integer> pointsA, List<Integer> pointsB) {
        List<Integer> pointsAwardResult = asList(0, 0);
        for (int i = 0; i < 3; i++) {
            int pointsAwardByCategories = compare(pointsA.get(i), pointsB.get(i));
            if (pointsAwardByCategories == 1) {
                pointsAwardResult.set(0, pointsAwardResult.get(0) + 1);
            } else if (pointsAwardByCategories == (-1)) {
                pointsAwardResult.set(1, pointsAwardResult.get(1) + 1);
            }
        }
        return pointsAwardResult;
    }
}
