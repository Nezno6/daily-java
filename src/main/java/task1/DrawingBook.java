// TASK: https://www.hackerrank.com/challenges/drawing-book/problem?isFullScreen=true

package task1;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public class DrawingBook {

    public int getMinNumberOfPageTurns(int nNumberOfPages, int pPageNumberToTurnTo) {
        if (nNumberOfPages % 2 == 0) {
            nNumberOfPages += 1; // The problem states that an open book always has two visible pages:
            // the left one has an even page number and the right one has an odd page number,
            // which is greater by 1 than the left one.
            // We can take advantage of this by adding 1 to the total number of pages
            // if it is even, which reduces the number of cases to one.
        }
        int startBack = abs(nNumberOfPages - pPageNumberToTurnTo) / 2;
        int startFront = abs(-pPageNumberToTurnTo) / 2;
        return min(startFront, startBack);
    }
}
