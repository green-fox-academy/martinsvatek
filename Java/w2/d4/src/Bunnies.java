public class Bunnies {
    public static void main (String[] args) {

        int bunniesNumber = 10;
        int earsPerBunny = 2;

        System.out.println(earsCount(bunniesNumber, earsPerBunny));
    }

    private static int earsCount (int bunniesNumber, int earsPerBunny) {

        if (bunniesNumber == 0) {
            return 0;
        } else {
            return earsPerBunny + earsCount(bunniesNumber - 1, earsPerBunny);
        }
    }
}

//We have a number of bunnies and each bunny has two big floppy ears.
//We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).