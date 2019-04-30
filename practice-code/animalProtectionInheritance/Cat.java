package animalProtectionInheritance;

public class Cat extends Animal {

    public Cat(String name, boolean isHealthy) {
        super(name, isHealthy);
        startingValue = 0;
        randomNumber = 7;
        randomHealCost();
    }
}