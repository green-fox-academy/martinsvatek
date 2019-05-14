import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbersSum {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

        int sum = numbers.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.summingInt(Integer::intValue));

        System.out.println(sum);
    }
}

// Write a Stream Expression to get the sum of the odd numbers in the following list: