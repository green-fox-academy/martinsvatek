package gardenApplication;

public class Flower extends Plant {

    public Flower(String color){
        super(color);
        waterNeed = 5;
    }

    public void watering(int amountOfWater) {
        currentWater += amountOfWater * 0.75;
    }
}