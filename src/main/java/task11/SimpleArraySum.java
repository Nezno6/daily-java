package task11;

import java.util.List;

public class SimpleArraySum {
    Integer sumArguments(List<Integer> numbers){
        return numbers.stream().reduce(0, Integer::sum);
    }
}
