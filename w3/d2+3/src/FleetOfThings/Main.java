package FleetOfThings;

public class Main {
    public static void main(String[] args) {

        Fleet fleet = new Fleet();

        Thing getMilk = new Thing("Get Milk");
        Thing removeTheObstacles = new Thing("Remove the obstacles");
        Thing standUp = new Thing("Stand up");
        Thing eatLunch = new Thing("Eat lunch");

        standUp.complete();
        eatLunch.complete();

        fleet.add(getMilk);
        fleet.add(removeTheObstacles);
        fleet.add(standUp);
        fleet.add(eatLunch);

        System.out.println(fleet);
    }
}

// Create a fleet of things to have this output:
// 1. [ ] Get milk
// 2. [ ] Remove the obstacles
// 3. [x] Stand up
// 4. [x] Eat lunch