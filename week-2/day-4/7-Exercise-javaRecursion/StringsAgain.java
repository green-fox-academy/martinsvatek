public class StringsAgain {

    public static void main(String[] args) {

        String words = "xxXxXxx";
        char from = 'x';
        char to = ' ';

        System.out.println(delete(words, from, to));
    }

    public static String delete(String words, char from, char to) {

        if (words.length() < 1) {
            return words;
        }
        else {
            char first = (words.charAt(0));
            if (first == from) {
                first = to;
            }
            return first + delete(words.substring(1), from, to);
        }
    }
}

// Given a string, compute recursively a new string where all the 'x' chars have been removed.