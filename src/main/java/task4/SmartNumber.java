package task4;

import static java.lang.Math.sqrt;

public class SmartNumber {

    public Boolean isSmartNumber(int number) {
        int numberSqrt = (int) sqrt(number);
        return number / (double) numberSqrt == numberSqrt;
    }
}
