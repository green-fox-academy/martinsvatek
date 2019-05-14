import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence:");
        String sentence = scanner.nextLine();

        // Version with long

        Map<Character, Long> frequency = sentence.chars()
                .mapToObj(letter -> (char)letter)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Version with integer

        /* Map<Character, Integer> frequency = sentence.chars()
                .mapToObj(letter -> (char)letter)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c -> 1))); */

        System.out.println(frequency);
    }
}

// Write a Stream Expression to find the frequency of characters in a given string!