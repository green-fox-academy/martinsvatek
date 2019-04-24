package GardenApplication;

public class Flower extends Plant {

    Flower(String color){
        super(color);
        waterNeed = 5;
    }

    public void watering(int amountOfWater) {
        currentWater += amountOfWater * 0.75;
    }
}