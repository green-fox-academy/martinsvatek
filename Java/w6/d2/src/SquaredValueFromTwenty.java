import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquaredValueFromTwenty {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

        List<Integer> squaredNumbers = numbers.stream()
                .filter(x -> Math.pow(x, 2) > 20)
                .collect(Collectors.toList());

        System.out.println(squaredNumbers);
    }
}

// Write a Stream Expression to find which number squared value is more then 20 from the following list: