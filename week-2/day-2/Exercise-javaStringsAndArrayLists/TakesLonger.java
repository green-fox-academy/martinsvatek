public class TakesLonger {

    public static void main(String[] args) {

        //1. ŘEŠENÍ

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String firstPartOfQuote = quote.substring(0, 21);
        String lastPartOfQuote = quote.substring(20);
        String addedPartOfQuote = "always takes longer than";
        String fixedQuote = firstPartOfQuote + addedPartOfQuote + lastPartOfQuote;

        System.out.println(fixedQuote);

        //2. ŘEŠENÍ

        int indexOfPozition = quote.indexOf("you");

        StringBuilder builder = new StringBuilder("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
        builder.insert(indexOfPozition,"always takes longer than ");

        System.out.println(builder.toString());
    }
}

// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)