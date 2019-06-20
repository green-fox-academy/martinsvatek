package Animal;

public class Animal {

    private int hungerValue;
    private int thirstValue;

    public Animal(int hungerValue, int thirstValue) {
        this.hungerValue = hungerValue;
        this.thirstValue = thirstValue;
    }

    public void eat() {
        hungerValue--;
    }

    public void drink() {
        thirstValue--;
    }

    public void play() {
        hungerValue++;
        thirstValue++;
    }

    public void print() {
        System.out.println("Hunger value: " + hungerValue);
        System.out.println("Thirst value: " + thirstValue);
    }
}

// Create an Animal class
    // Every animal has a hunger value, which is a whole number
    // Every animal has a thirst value, which is a whole number
    // when creating a new animal object these values are created with the default 50 value
    // Every animal can eat() which decreases their hunger by one
    // Every animal can drink() which decreases their thirst by one
    // Every animal can play() which increases both by one