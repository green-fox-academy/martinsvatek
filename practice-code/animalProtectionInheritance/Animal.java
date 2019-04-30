package animalProtectionInheritance;

import java.util.Random;

public abstract class Animal {
    private String name;
    private boolean isHealthy;
    private int healCost;

    protected int startingValue;
    protected int randomNumber;

    public Animal(String name, boolean isHealthy) {
        this.name = name;
        this.isHealthy = isHealthy;
    }

    public void heal() {
        isHealthy = true;
    }

    public boolean isAdoptable() {
        if (isHealthy == true) {
            return true;
        }
        return false;
    }

    public void randomHealCost() {
        Random healing = new Random();
        healCost = startingValue + healing.nextInt(randomNumber);
    }

    public String toString() {
        return (isHealthy == false ? name + " is not healthy (" + healCost + " €), and not adoptable"
                : name + " is healthy, and adoptable");
    }
}