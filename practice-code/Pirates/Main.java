package Pirates;

public class Main {
    public static void main(String[] args) {
        Pirate pirateOne = new CaptainPirate("Jack",true);
        Pirate pirateTwo = new OrdinaryPirate("Johny",false);

        System.out.println(pirateOne);
        System.out.println(pirateTwo);

        pirateOne.party();
        pirateTwo.party();

        System.out.println("- - - - -");

        System.out.println(pirateOne);
        System.out.println(pirateTwo);
    }
}
