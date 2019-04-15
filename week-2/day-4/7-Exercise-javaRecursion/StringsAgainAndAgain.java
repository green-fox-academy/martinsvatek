public class StringsAgainAndAgain {

    public static void main(String[] args) {

        String inputed = "ommxyy zeyiowklk hlkf";

        System.out.println(inputCharacter(inputed, inputed.length() - 1));
    }
    // Function inputs * between every char in original string except for " ".

    public static String inputCharacter(String sentence, int count) {

        if (count <= 0)
            return sentence;

        char followingChar = sentence.charAt(count - 1);

        if (followingChar == ' ') {
            return inputCharacter(sentence, count - 2);
        } else {
            sentence = sentence.substring(0, count).concat("*" + sentence.substring(count));
            return inputCharacter(sentence, count - 1);
        }
    }
}