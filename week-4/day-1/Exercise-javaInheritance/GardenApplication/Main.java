package GardenApplication;

public class Main {

    public static void main(String[] args) {

        thegardenapp.Garden garden = new thegardenapp.Garden();
        Flower yellowFlower = new Flower("yellow");
        Flower blueFlower = new Flower("blue");
        Tree purpleTree = new Tree("purple");
        Tree orangeTree = new Tree("orange");

        garden.add(yellowFlower);
        garden.add(blueFlower);
        garden.add(purpleTree);
        garden.add(orangeTree);
        garden.printStatus();
        garden.watering(40);
        garden.printStatus();
        garden.watering(70);
        garden.printStatus();
    }
}