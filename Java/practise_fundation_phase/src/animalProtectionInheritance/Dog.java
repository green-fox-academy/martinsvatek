package animalProtectionInheritance;

public class Dog extends Animal {

    public Dog(String name, boolean isHealthy) {
        super(name, isHealthy);
        startingValue = 1; // from 1 to 8
        randomNumber = 8;
        setHealCost();
    }
}