// TASK: https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true

// Constraints
// 0<=x1<x2<=10_000
// 1<=v1<=10_000
// 1<=v2<=10_000

package task10;

public class NumberLineJumps {

    public boolean countJumps(int positionChasing, int jumpLengthChasing, int positionChased, int jumpLengthChased) {
        if (jumpLengthChasing <= jumpLengthChased) {
            return false;
        }
        int distance = positionChased - positionChasing;
        int diffSpeed = jumpLengthChasing - jumpLengthChased;
        return distance%diffSpeed==0;
    }
}
