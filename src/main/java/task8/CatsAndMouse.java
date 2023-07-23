package task8;

import static java.lang.Math.*;

public class CatsAndMouse {
    public String findCatsAndMouseWinner(int positionOfCatA, int positionOfCatB, int positionOfMouse) {
        int distanceA = abs(positionOfMouse - positionOfCatA);
        int distanceB = abs(positionOfMouse - positionOfCatB);
        return distanceA>distanceB? "Cat B" :
                distanceB>distanceA? "Cat A" : "Mouse C";
    }
}
