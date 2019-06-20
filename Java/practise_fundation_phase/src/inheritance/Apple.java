package inheritance;

public class Apple extends Food { // inheritance; subclass

    @Override
    public void eat() {
        System.out.println("I am the eat method from Food class, but over-write in Apple subclass");
    }
}