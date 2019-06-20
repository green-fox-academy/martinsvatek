public class Strings {
    public static void main(String[] args) {

        String word = "xxXxXxx";
        char from = 'x';
        char to = 'y';

        System.out.println(replace(word, from, to));
    }

    private static String replace(String word, char from, char to) {

        if (word.length() < 1) {
            return word;
        }
        else {
            char first = (word.charAt(0));
            if (first == from) {
                first = to;
            }
            return first + replace(word.substring(1), from, to);
        }
    }
}

//Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.