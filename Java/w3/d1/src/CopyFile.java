import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {

    public static void main(String[] args) {

        String firstFile = "testingFileForExercises.txt";
        String secondFile = "testingFileForExercises2.txt";

        copyFiles(firstFile, secondFile);
    }

    private static void copyFiles(String firstFile, String secondFile) {

        try {
            Path fromFilePath = Paths.get("src/" + firstFile);
            Path toFilePath = Paths.get("src/" + secondFile);

            List<String> content = Files.readAllLines(fromFilePath);

            Files.write(toFilePath, content);

            System.out.println("Copy was successful");

        } catch (IOException e) {
            System.out.println("Unable to write to new file");
        }
    }
}

// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful