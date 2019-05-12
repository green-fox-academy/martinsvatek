package animalProtectionInheritance;

public class Cat extends Animal {

    public Cat(String name, boolean isHealthy) {
        super(name, isHealthy);
        startingValue = 0; // from 0 to 6
        randomNumber = 7;
        setHealCost();
    }
}