public class Strings {

    public static void main(String[] args) {

        String words = "xxXxXxx";
        char from = 'x';
        char to = 'y';

        System.out.println(replace(words, from, to));
    }

    public static String replace(String words, char from, char to) {

        if (words.length() < 1) {
            return words;
        }
        else {
            char first = (words.charAt(0));
            if (first == from) {
                first = to;
            }
            return first + replace(words.substring(1), from, to);
        }
    }
}

//Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.