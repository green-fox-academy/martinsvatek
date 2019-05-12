package mostCommonCharactersFromFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class MainShorter {
    public static void main(String[] args) {

        try {
            HashMap<Character, Integer> result = getMostCommonCharacters("src/mostCommonCharactersFromFile/countchar.txt");
            System.out.println(result);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }

    private static HashMap<Character, Integer> getMostCommonCharacters(String fileName) throws Exception {
        Path path = Paths.get(fileName);
        String allLetters = "";

        try {
            List<String> letters = Files.readAllLines(path);
            for (String line: letters) {
                allLetters += line;
            }
        } catch (IOException exception) {
            throw new Exception("File does not exist!");
        }

        HashMap<Character, Integer> resultMap = new HashMap<>();
        int maxOccurrence = 0;
        Character mostCommonCharacter = null;
        int characters = allLetters.length();

        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < characters; i++) {
                int actualOccurence = 0;
                char currentlyChecked = allLetters.charAt(i);
                for (int j = i; j < characters; j++) {
                    if (currentlyChecked == allLetters.charAt(j) &&
                            (!resultMap.containsKey(currentlyChecked))) {
                        actualOccurence++;
                    }
                }

                if (actualOccurence > maxOccurrence) {
                    maxOccurrence = actualOccurence;
                    mostCommonCharacter = currentlyChecked;
                }
            }

            resultMap.put(mostCommonCharacter, maxOccurrence);
            maxOccurrence = 0;
        }

        return resultMap;
    }
}