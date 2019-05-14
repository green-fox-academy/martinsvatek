import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OddNumbersAverageValue {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        // On easy solution

/*        IntSummaryStatistics averageValue = numbers.stream()
                .filter(x -> x % 2 != 0)
                .mapToInt(Integer::intValue)
                .summaryStatistics(); */

        // Just logic solution

/*      List<Integer> oddNumbers = numbers.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());

        double averageValue = oddNumbers.stream()
                .mapToInt(x -> x.intValue()).sum() / oddNumbers.size(); */

        // Shortest solution

        double averageValue = numbers.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.averagingDouble(Integer::intValue));

        System.out.println(averageValue);
    }
}

// Write a Stream Expression to get the average value of the odd numbers from the following list: