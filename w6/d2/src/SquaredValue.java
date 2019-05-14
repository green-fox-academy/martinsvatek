import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquaredValue {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        List<Double> squaredNumbers = numbers.stream()
                .filter(x -> x > 0)
                .map(x -> Math.pow(x, 2))
                .collect(Collectors.toList());

        System.out.println(squaredNumbers);
    }
}

// Write a Stream Expression to get the squared value of the positive numbers from the following list: