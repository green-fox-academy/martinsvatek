public class Power {
    public static void main(String[] args) {

        int base = 3;
        int power = 3;

        System.out.println(powerFunction(base, power));

    }

    private static int powerFunction(int base, int power) {

        if (power != 0) {
            return (base * powerFunction(base, power - 1));
        }
        return 1;
    }
}

// Given base and n that are both 1 or more,
// compute recursively (no loops) the value of base to the n power,
// so powerN(3, 2) is 9 (3 squared).