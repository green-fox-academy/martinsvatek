package Animal;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal(50, 50);

        dog.print();
        System.out.println("---Dog is eating---");
        dog.eat();
        dog.print();
        System.out.println("---Dog is drinking---");
        dog.drink();
        dog.print();
        System.out.println("---Dog is playing---");
        dog.play();
        dog.print();
    }
}