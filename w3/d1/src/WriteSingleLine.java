import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("HEY YOU, don't watch at me and type your name:");
        String singleLine = scanner.nextLine();

        writeToFile(singleLine);
    }

    private static void writeToFile(String singleLine) {

        try {
            Path filePath = Paths.get("src/testingFileForExercises.txt");
            List<String> content = new ArrayList<>();
            content.add (singleLine);
            Files.write(filePath, content);

        } catch (IOException e) {
            System.out.println("Unable to write file: testingFileForExercises.txt");
        }
    }
}

// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"