public class StringsAgainAndAgain {
    public static void main(String[] args) {

        String impute = "ommxyy zeyiowklk hlkf";

        System.out.println(inputCharacter(impute, impute.length() - 1));
    }

    // Function inputs * between every char in original string except for " ".

    private static String inputCharacter(String impute, int count) {

        if (count <= 0)
            return impute;

        char followingChar = impute.charAt(count - 1);

        if (followingChar == ' ') {
            return inputCharacter(impute, count - 2);
        } else {
            impute = impute.substring(0, count).concat("*" + impute.substring(count));
            return inputCharacter(impute, count - 1);
        }
    }
}