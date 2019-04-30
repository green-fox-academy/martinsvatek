package inheritance;

public class Food { // superclass (parent), children are subclasses, even children of children can inheritance of superclass

    public void eat() {
        System.out.println("I am the eat method from Food class");
    }
    private void invisibleForChildren() { // only public can be inherited
        System.out.println("I am the invisible method from Food class");
    }
}