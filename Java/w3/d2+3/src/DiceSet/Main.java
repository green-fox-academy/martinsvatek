package DiceSet;

public class Main {
    public static void main(String[] args) {

        DiceSet diceSet = new DiceSet();
        System.out.println(diceSet.getCurrent());
        System.out.println(diceSet.roll());
        System.out.println(diceSet.getCurrent(5));
        diceSet.reroll();
        System.out.println(diceSet.getCurrent());
        diceSet.reroll(4);
        System.out.println(diceSet.getCurrent());

        for (int i = 0; i < 6; i++) {
            while (diceSet.getCurrent(i) != 6) {
                diceSet.reroll(i);
            }
        }

        System.out.println(diceSet.getCurrent());
    }
}