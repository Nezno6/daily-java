package task4;

public class SmartNumber {

    public String isSmartNumber(int number) {
        int numberSqrt = (int) Math.sqrt(number);
        if (numberSqrt * numberSqrt == number) {
            return "YES";
        }
        return "NO";
    }
}
