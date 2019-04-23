public class Power {

    public static void main(String[] args) {

        int base = 3;
        int power = 6; //power

        System.out.println(powerFuncion(base, power));

    }

    public static int powerFuncion(int base, int power) {

        if (power != 0) {
            return 0;
        } else {
            return base * powerFuncion(base, power - 1);
        }
    }
}

// Given base and n that are both 1 or more,
// compute recursively (no loops) the value of base to the n power,
// so powerN(3, 2) is 9 (3 squared).