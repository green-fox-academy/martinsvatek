package animalProtectionInheritance;

public class Parrot extends Animal{

    public Parrot(String name, boolean isHealthy) {
        super(name, isHealthy);
        startingValue = 4;
        randomNumber = 7;
        randomHealCost();
    }
}