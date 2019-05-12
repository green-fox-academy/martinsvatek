package animalProtectionInheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalShelter {
    private int budget;
    private List<Animal> animals;
    private List<String> adopterNames;


    public AnimalShelter() { // nicer is to set all values in constructor
        budget = 50;
        animals = new ArrayList<>();
        adopterNames = new ArrayList<>();

        animals.add(new Cat("Mourek", true));
        adopterNames.add("Novák");
    }

    // It must have a method named rescue this method takes an Animal as parameter
        // and add the animal to the shelter's list and return the size of the list
    public int rescue(Animal animalToRescue) {
        animals.add(animalToRescue);
        return animals.size();
    }

    // It must have a method named heal this method heals the first not healthy Animal
        // if it is possible by budget, returns the amount of healed animals(0 or 1)
    public int heal() {
        for (Animal animal : animals) {
            if (animal.getIsHealthy() != true) { // find first healthy
                if (animal.getHealCost() <= budget) { // do we have money for healing?
                    animal.heal();
                    return 1;
                }
                return 0;
            }
        }
        return 0;
    }

    // It must have a method named addAdopter this method takes a name as a parameter
        // and saves it as a potential new owner
    public void addAdobter(String adopterName) {
        adopterNames.add(adopterName);
    }

    // It must have a method named findNewOwner
        // this method pairs a random name with a random adoptable Animal if it is possible
        // and removes both of them from the lists
    public void findNewOwner() {
        Random random = new Random();

        if (!animals.isEmpty() && !adopterNames.isEmpty()) {
            Animal randomAnimal = animals.get(random.nextInt(animals.size()));
            String randomAdopter = adopterNames.get(random.nextInt(adopterNames.size()));

            randomAnimal.setOwnerName(randomAdopter); // pair them

            // remove them
            animals.remove(randomAnimal);
            adopterNames.remove(randomAdopter);
        }
    }

    // It must have a method named earnDonation this method takes an amount as parameter
        // and increases the shelter's budget by the parameter's value and returns the current budget
    public int earnDonation(int amount) {
        budget += amount;
        return budget;
    }

    // It must have a method named toString that represents the shelter
        // and print all the informations about the shelter and the animals in the following format:
    @Override
    public String toString() {

        String dataFromAnimal = "";

        for (Animal animal : animals) {
            dataFromAnimal += animal.toString() + "\n";
        }

        return "Budget: " + budget + "€,\n"
                + "There are " + animals.size() + " animal(s) and " + adopterNames.size() + " potential adopter(s)\n"
                + dataFromAnimal;
    }
}