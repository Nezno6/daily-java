package task4;

import java.util.HashSet;
import java.util.Set;

public class SmartNumber {

        public String isSmartNumber(int number) {
            Set<Integer> divisors = new HashSet<>();
            for (int i = 1; i <= Math.sqrt(number); i++) {
                if (number%i==0){
                    divisors.add(i);
                    divisors.add(number/i);
                }
            }
            return divisors.size()%2==1?"YES":"NO";
        }
    }
