package inheritance;

public class Main {
    public static void main(String[] args) {
        Food foodObject = new Food();
        Apple appleObject = new Apple();

        foodObject.eat(); // called method of subclass, but this method is defined in food class
        System.out.println("- - -");
        appleObject.eat(); // called method of subclass, where is overwrite method of food class
    }
}