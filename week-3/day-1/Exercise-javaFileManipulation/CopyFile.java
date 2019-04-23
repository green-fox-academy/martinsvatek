import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {

    public static void main(String[] args) {

        String firstFile = "Copyfile.txt";
        String secondFile = firstFile + "Version2.txt";

        System.out.println(copyFiles(firstFile, secondFile));
    }

    public static boolean copyFiles(String firstFile, String secondFile) {

        try {
            Path fromFilePath = Paths.get(firstFile);
            Path toFilePath = Paths.get(secondFile);

            List<String> content = Files.readAllLines(fromFilePath);

            Files.write(toFilePath, content);
            return true;

        } catch (IOException e) {

            System.out.println("Unable to write to new file");
            return false;
        }
    }
}

// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful