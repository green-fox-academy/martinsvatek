package FinalInstanceVariable;

public class Data {

    private int sum;
    private final int NUMBER; // constant is better to type with capital letters, final can't modify, when we set value (here or in constructor) - it will be same value for the rest of my life :D

    public Data(int NUMBER) {
        this.NUMBER = NUMBER; // so we can set the value here only
    }

    public void add() {
        sum += NUMBER;
    }

    public String toString() {
        return String.format("sum = %d\n", sum);
    }
}