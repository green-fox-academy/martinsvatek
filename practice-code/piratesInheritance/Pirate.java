package piratesInheritance;

public abstract class Pirate {

    private String name;
    protected int amountOfGold = 10;
    protected int healthPoints = 10;
    private boolean woodenLeg = true;

    public Pirate(String name, boolean woodenLeg) {
        this.name = name;
        this.woodenLeg = woodenLeg;
    }

    public abstract void work(); // abstract because it is not specific

    public abstract void party(); // abstract because it is not specific

    public String toString() {
        return (woodenLeg == true ? "Hello, I'm " + name + ". I have a wooden leg and " + amountOfGold + " golds. (HEALTH POINT: " + healthPoints + ")"
                : "Hello, I'm " + name + ". I still have my real legs and " + amountOfGold + " golds. (HEALTH POINT: " + healthPoints + ")");
    }
}