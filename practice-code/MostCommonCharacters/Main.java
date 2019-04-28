package MostCommonCharacters;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            HashMap<Character, Integer> result = mostCommonCharacter("src/MostCommonCharacters/countchar.txt");
            System.out.println(result);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static HashMap<Character, Integer> mostCommonCharacter (String fileName) throws IOException { // read the file

        Path path = Paths.get(fileName);
        String allLetters = "";

        try { // get the content from the file to one string

            List<String> fileData = Files.readAllLines(path);
            for (String line : fileData)  {
                allLetters = allLetters + line;
            }
        } catch (IOException e){ // throw exception if it does not exist
            throw new IOException("File does not exist!");
        }
        return getMostCommon(allLetters);
    }

    public static HashMap<Character, Integer> getMostCommon(String allLetters){ // Build a HashMap that stores characters and occurrences

        HashMap<Character, Integer> map = new HashMap<>();

        int maximumOccurrenceOne = 0;
        int maximumOccurrenceTwo = 0;
        char mostCommonCharakterOne = '\u0000';
        char mostCommonCharakterTwo = '\u0000';

        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < allLetters.length(); i++) {
                char countedCharacter = allLetters.charAt(i);
                int occurrenceOfCounted = getOccurrence(allLetters, countedCharacter);

                if ((k == 0) && occurrenceOfCounted > maximumOccurrenceOne) {
                    maximumOccurrenceOne = occurrenceOfCounted;
                    mostCommonCharakterOne = countedCharacter;
                } else if (occurrenceOfCounted > maximumOccurrenceTwo && countedCharacter != mostCommonCharakterOne) {
                    maximumOccurrenceTwo = occurrenceOfCounted;
                    mostCommonCharakterTwo = countedCharacter;
                }
            }
        }

        map.put(mostCommonCharakterOne, maximumOccurrenceOne);
        map.put(mostCommonCharakterTwo, maximumOccurrenceTwo);
        return map;
    }

    public static Integer getOccurrence(String allLetters, char countedCharacter){ // another loop four counting occurrences of countedCharacter

        int occurrenceOfCounted = 0;

        for (int j = 0; j < allLetters.length(); j++) {
            if (countedCharacter == allLetters.charAt(j)) {
                occurrenceOfCounted++;
            }
        }
        return occurrenceOfCounted;
    }
}