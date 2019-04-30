package animalProtectionInheritance;

public class Main {
    public static void main(String[] args) {
        Animal animalObject1 = new Cat("Míca", false);
        Animal animalObject2 = new Cat("Mourek", true);
        Animal animalObject3 = new Dog("Alík", false);
        Animal animalObject4 = new Dog("Buddy", true);
        Animal animalObject5 = new Parrot("Papouch", false);
        Animal animalObject6 = new Parrot("Gangster", true);

        System.out.println(animalObject1);
        System.out.println(animalObject2);
        System.out.println(animalObject3);
        System.out.println(animalObject4);
        System.out.println(animalObject5);
        System.out.println(animalObject6);
    }
}
