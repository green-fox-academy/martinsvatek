package piratesTrialExam;

public class Pirate {
    String name;
    int amountOfGold;
    int healthPoints = 10;
    boolean captain;
    boolean woodenLeg;

    public void work() {
        if (captain) {
            amountOfGold += 10;
            healthPoints -= 5;
        } else {
            amountOfGold++;
            healthPoints--;
        }
    }

    public void party() {
        if (captain) {
            healthPoints += 10;
        } else {
            healthPoints++;
        }
    }

    private String legCheck() {
        if (woodenLeg) {
            return "I have a wooden leg";
        } else {
            return "I still have my real legs";
        }
    }

    @Override
    public String toString() {
        String pirate = "Hello, I'm " + name + ". " + legCheck() + " and " + amountOfGold + " Golds";

        return pirate;
    }
}