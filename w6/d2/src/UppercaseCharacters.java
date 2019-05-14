import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UppercaseCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence:");
        String sentence = scanner.nextLine();

     /*   String upperCaseCharacters = sentence.chars()
                .filter(Character::isUpperCase)
                .mapToObj(letter -> Character.toString((char)letter))
                .collect(Collectors.joining()); */

        //method2 of exercise 6

        List<Character> upperCaseCharacters = sentence.chars()
                .filter(letter -> Character.isUpperCase(letter))
                .mapToObj(letter -> (char) letter)
                .collect(Collectors.toList());

        System.out.println("Upper is: " + upperCaseCharacters);

    }
}

// Write a Stream Expression to find the uppercase characters in a string!