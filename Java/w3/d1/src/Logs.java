import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) {

        Path logFile = Paths.get("src/log.txt");

        IPUnique(logFile);
        GetPostRatio(logFile);
    }

    private static void IPUnique(Path logfile) {

        try {
            List<String> logContent = Files.readAllLines(logfile);
            ArrayList<String> IPAddresses = new ArrayList<>();
            for (String line : logContent) {
                IPAddresses.add(line.substring(27, 40));
            }
            for (String IP : IPAddresses) {
                System.out.println(IP);
            }
        } catch (IOException error) {
            System.out.println("can't open file.");
        }
    }

    private static void GetPostRatio(Path logfile) {

        try {
            List<String> logContent = Files.readAllLines(logfile);
            int post = 0;
            int get = 0;
            for (String line : logContent) {
                if (line.endsWith("POST /")) {
                    post++;
                } else get++;
            }
            System.out.println("GET - POST request ratio is " + post + " : " + get);
        } catch (IOException error) {
            System.out.println("can't open file.");
        }
    }
}

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP addresses.
// Write a function that returns the GET / POST request ratio.