package Pirates;

public class CaptainPirate extends Pirate {

    private int healthWork = 5;
    private int goldWork = 10;
    private int healthParty = 10;

    public CaptainPirate(String name, boolean woodenLeg) {
        super(name, woodenLeg);
    }

    @Override
    public void work() {
        amountOfGold += goldWork;
        healthPoints -= healthWork;
    }

    @Override
    public void party() {
        healthPoints += healthParty;
    }
}