import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

    public static void main(String[] args) {

        String nameOfTheFile = "testingFileForExercises.txt";

        System.out.println(countLines(nameOfTheFile));

    }

    public static int countLines(String nameOfTheFile) {

        Path filePath = Paths.get("src/testingFileForExercises.txt");

        try {
            List<String> lines = Files.readAllLines(filePath);
            return lines.size();

        } catch (IOException e) {
            return 0;
        }
    }
}

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.