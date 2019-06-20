import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToString {
    public static void main(String[] args) {

        List<Character> letters = Arrays.asList('H', 'E', 'L', 'L', 'O');

        String word = letters.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(word);
    }
}

// Write a Stream Expression to concatenate a Character list to a string!