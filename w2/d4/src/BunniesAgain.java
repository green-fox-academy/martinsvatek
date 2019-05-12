public class BunniesAgain {
    public static void main(String[] args) {

        int bunniesNumber = 5;
        int earsPerEvenBunny = 3;
        int earsPerOddBunny = 2;

        System.out.println(earsCount(bunniesNumber, earsPerEvenBunny, earsPerOddBunny));
    }

    private static int earsCount(int bunniesNumber, int earsPerEvenBunny, int earsPerOddBunny) {

        if (bunniesNumber == 0) {
            return 0;
        } else if (bunniesNumber % 2 != 0) {
            return earsPerOddBunny + earsCount(bunniesNumber - 1, earsPerEvenBunny, earsPerOddBunny);
        } else {
            return earsPerEvenBunny + earsCount(bunniesNumber - 1, earsPerEvenBunny, earsPerOddBunny);
        }
    }
}

// We have bunnies standing in a line, numbered 1, 2, ...
// The odd bunnies (1, 3, ..) have the normal 2 ears.
// The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
// Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).