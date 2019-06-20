package piratesInheritance;

public class OrdinaryPirate extends Pirate {

    private int healthWork = 1;
    private int goldWork = 1;
    private int healthParty = 1;

    public OrdinaryPirate(String name, boolean woodenLeg) {
        super(name, woodenLeg); // we have to create constructor in every child class, dont forget to super.
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