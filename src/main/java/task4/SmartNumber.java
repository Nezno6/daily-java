package task4;

public class SmartNumber {

        public String isSmartNumber(int number) {
            int count = 1;
            for (int i = 1; i <= number/2; i++) {
                if (number%i==0){
                    count++;
                }
            }
            return (count%2==0)?"NO":"YES";
        }
    }
