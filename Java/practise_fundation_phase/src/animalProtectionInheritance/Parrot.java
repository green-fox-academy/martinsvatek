package animalProtectionInheritance;

public class Parrot extends Animal{

    public Parrot(String name, boolean isHealthy) {
        super(name, isHealthy);
        startingValue = 4; // from 4 to 10
        randomNumber = 7;
        setHealCost();
    }
}